package com.newtouch.yfy.dao.impl;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.newtouch.yfy.api.Authorityfy;
import com.newtouch.yfy.dao.CheckAuthorityfyDao;

@Repository("checkAuthorityfyDaoImpl")
public class CheckAuthorityfyDaoImpl implements CheckAuthorityfyDao{

	/* private EntityManagerFactory emf;
	 private EntityManager entityManagersqlserver;
	
	 public EntityManager getEntityManager() {
	   return entityManagersqlserver;
	 }
	 
	@PersistenceContext(unitName="aaaUnit")
	 public void setEntityManager(EntityManager entityManager) {
	  this.entityManagersqlserver = entityManager;
	 }

	 @PersistenceUnit(unitName="aaaUnit")
	 public void setEntityManagerFactory(EntityManagerFactory emf) {
	  this.emf = emf;
	 }*/

	@Override
	public Boolean findHashKey(Authorityfy authorityfy) throws SQLException {
		  String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //加载JDBC驱动  
			 
		   String dbURL = "jdbc:sqlserver://172.20.1.33:1433; DatabaseName=YfyHisPlatform";   //连接服务器和数据库sample  
		 
		   String userName = "sa";   //默认用户名  
		 
		   String userPwd = "Dell@2699";   //密码  
		   
			java.sql.Connection dbConn=null;
			
			Statement ps = null;
			
			ResultSet  result  =null;
		try{
				String sql ="SELECT  [ID]  FROM [Application] where id ='"+authorityfy.getHashKey()+"'";
				System.out.println(sql);
				Class.forName(driverName);  
				 
				   dbConn = DriverManager.getConnection(dbURL, userName, userPwd);  
				   ps =  dbConn.createStatement();
				   result = ps.executeQuery(sql);
				   while (result.next()) {
					   System.out.println("Connection Successful!");   //如果连接成功 控制台输出Connection Successful!  
				         System.out.println(result.getString("ID"));
				        }  
				 return true;
			}catch(Exception e){
			  System.out.println(e+"Error loading sqlswever Driver!");
			return false;
			}finally{
				if(dbConn!=null){
					dbConn.close();
				}
			}
	
	}

	@Override
	public Boolean findAlipayAgreement(Authorityfy authorityfy) {
		 
		return true;
	}
	
}