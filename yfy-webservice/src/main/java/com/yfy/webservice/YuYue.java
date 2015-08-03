package com.yfy.webservice;

import java.rmi.RemoteException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;



@WebService
public interface YuYue {
   @WebMethod
   public  String doYuYue(@WebParam(name = "xmlMessage") String xmlMessage);
   
   /**
    * 
    * @param callType
    * @param xmlMessage
    * @return
 * @throws RemoteException 
    */
   @WebMethod
	public  String alipayBooking(@WebParam(name = "xmlMessage") String xmlMessage) throws RemoteException;
}
