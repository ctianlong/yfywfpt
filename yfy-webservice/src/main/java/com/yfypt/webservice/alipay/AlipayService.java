/**
 * AlipayService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yfypt.webservice.alipay;

public interface AlipayService extends javax.xml.rpc.Service {
    public java.lang.String getAlipayServiceSoapAddress();

    public com.yfypt.webservice.alipay.AlipayServiceSoap getAlipayServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.yfypt.webservice.alipay.AlipayServiceSoap getAlipayServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
