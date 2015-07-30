package com.newtouch.yfy.write.db;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BookingJobTask {
	/**
	 * 业务逻辑处理
	 */
	@Autowired
	ReadDBService readDBServiceImpl;
	@Autowired
	CheckAuthorityfyService checkAuthorityfyServiceImpl;


	protected void execute() throws RemoteException, SQLException {

		// 执行任务
		System.out.println("***定时计划test执行...***" + System.currentTimeMillis());

		// YYSendLab("YY07",YY07Str("0"));
		 //YYSendLab("YY07",YY07Str("1"));
		 // YYSendLab("YY07",YY07Str("2"));
		// YY02Test();
		//testAuthorityfy();
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
		String yySendLab = "";
		YY07Map xmlp07 = new YY07Map();
		BookSoapProxy proxy = new BookSoapProxy();
		try {
			yySendLab = proxy.YYSendLab(callType, xmlStr);
			System.out.println(yySendLab);
			List<Dept> list = xmlp07.parseStrToList(yySendLab);
			for (Dept dept : list) {
				readDBServiceImpl.dowriteToMysqlYY07(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		/* BookSoapProxy proxy1 = new BookSoapProxy();
		 try {
			System.out.println(proxy1.YYSendLab("YY07", YY07Str("2"))+"@@");
			System.out.println(proxy1.YYSendLab("YY07", YY07Str("0"))+"##");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// System.out.println(YY02Str("0","2015-7-18","2015-7-31","0102003","1188","","微信"));

	}

	public Boolean YY02Test() throws SQLException, RemoteException {
		List<Dept> list = readDBServiceImpl.getDeptData();
		String str[] = nowdate();
		YY02Map xmlp = new YY02Map();
		// ParseXml_YY07 xmlp=new ParseXml_YY07();

		BookSoapProxy proxy = new BookSoapProxy();
		for (Dept map : list) {
			String yySendLab = proxy.YYSendLab(
					"YY02",
					YY02Str(map.getHospitalcode(), str[0], str[1],
							map.getDeptcode()));
			System.out.println(yySendLab);
			//
			List<AppoResources> appolist = xmlp.parseStrToList(yySendLab);
			for (AppoResources appoResources : appolist) {
				readDBServiceImpl.dowriteToMysqlYY02(appoResources);
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
	
	public  void testAuthorityfy() throws Throwable{
		Authorityfy authorityfy = new Authorityfy();
		authorityfy.setHashKey("33199f9e-13c3-4e88-b696-534ac8d8c7a2");
		authorityfy.setAlipayID(null);
		authorityfy.setAgreementID(null);
		Boolean flag = checkAuthorityfyServiceImpl.findHashKey(authorityfy);
		System.out.println(flag); 
	}
}