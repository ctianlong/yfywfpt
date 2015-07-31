package com.yfypt.webservice.alipay;

import java.rmi.RemoteException;

public class TestAlipay {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		String xml = "<root> <head> <parameter> <hashKey>1dcc108c-45e2-4bac-a05f-0a86e061be9f</hashKey><ApplyIDFrom>50ce51cf-6eb4-4727-9f27-a8e1f3c095b6</ApplyIDFrom><AlipayID>rG0hVXiyZScGap3tc0qHPBlkXv4PbBuA5XowSnf6rfveMcWdmuZUZ6zT1++5zVLL01</AlipayID><AgreementID>20150706028655229290</AgreementID>  <Optype>2</Optype> </parameter> </head> <body /> </root>";
		AlipayServiceSoapProxy  alipayServiceSoapProxy = new AlipayServiceSoapProxy();
		String xmlOut = alipayServiceSoapProxy.alipay_Authoration_ApplyAndUser(xml);
	    System.out.println(xmlOut);
	}

}
