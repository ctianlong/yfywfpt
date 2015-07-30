package com.newtouch.yfy.write.db;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.newtouch.yfy.api.AppoResources;
import com.newtouch.yfy.api.Dept;
import com.newtouch.yfy.service.ReadDBService;

public class BookingJobTask {

	/**
	 * 业务逻辑处理
	 */
	@Autowired
	ReadDBService readDBServiceImpl;

	private ParseXml_YY07 xmlp07 = new ParseXml_YY07();

	private ParseXml_YY02 xmlp02 = new ParseXml_YY02();

	private BookSoapProxy proxy = new BookSoapProxy();

	protected void execute() throws RemoteException, SQLException {

		// 执行任务
		System.out.println("***定时计划test执行...***" + System.currentTimeMillis());

		// YYSendLab("YY07",YY07Str("0"));
		// YYSendLab("YY07",YY07Str("1"));
		// YYSendLab("YY07",YY07Str("2"));
		// YY02Test();
		System.out.println();
	}

	/**
	 * 
	 * @return返回当前日期和15天后的日期字符数组
	 */
	public static String[] nowdate() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String format = formatter.format(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 15);
		String format2 = formatter.format(cal.getTime());
		String str[] = { format, format2 };

		return str;
	}

	private void YYSendLab(String callType, String xmlStr) {
		String yySendLab = "<rows> <row hospital='1' hospitalname='上海市第一妇婴保健院' dept_code='2106019' dept_name='生殖医学科' dept_describe='' DocNum='3' /></rows>";
		try {
			// yySendLab = proxy.YYSendLab(callType, xmlStr);
			System.out.println(yySendLab);
			List<Dept> list = xmlp07.parseXml(yySendLab);
			for (Dept dept : list) {
				readDBServiceImpl.writeToMysqlYY07(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// System.out.println(YY02Str("0","2015-7-18","2015-7-31","0102003","1188","","微信"));

	}

	public Boolean YY02Test() throws SQLException, RemoteException {
		List<Dept> list = readDBServiceImpl.getDeptData();
		String str[] = nowdate();
		ParseXml_YY02 xmlp = new ParseXml_YY02();
		// ParseXml_YY07 xmlp=new ParseXml_YY07();

		BookSoapProxy proxy = new BookSoapProxy();
		for (Dept map : list) {
			String yySendLab = proxy.YYSendLab(
					"YY02",
					YY02Str(map.getHospitalcode(), str[0], str[1],
							map.getDeptcode()));
			System.out.println(yySendLab);
			//
			List<AppoResources> appolist = xmlp.parseXml(yySendLab);
			for (AppoResources appoResources : appolist) {
				readDBServiceImpl.writeToMysqlYY02(appoResources);
			}
		}

		return true;

	}

	private static String YY07Str(String hospital) {
		StringBuilder str = new StringBuilder();
		// String str = " <rows><row  hospital='2' /></rows>";

		str.append("<rows><row  hospital='").append(hospital)
				.append("'/></rows>");
		return str.toString();
	}

	private static String YY02Str(String hospital, String stdate,
			String endate, String dept_code) {
		StringBuilder str = new StringBuilder();
		// <rows><row hospital='0' stdate='2015-7-18' endate='2015-7-31'
		// dept_code='0102003' expert_code='1188' partcode='' patfrom='微锟斤拷'
		// cancelled='false'/></rows>
		str.append("<rows><row  hospital='");
		str.append(hospital);
		str.append("' stdate='");
		str.append(stdate);
		str.append("' endate='");
		str.append(endate);
		str.append("' dept_code='");
		str.append(dept_code);
		str.append("' expert_code='");
		str.append("' partcode='");
		str.append("' patfrom='");
		str.append("' cancelled='false'/></rows>");
		return str.toString();
	}
}
