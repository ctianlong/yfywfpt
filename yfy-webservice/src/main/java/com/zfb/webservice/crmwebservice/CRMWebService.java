/**
 * CRMWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zfb.webservice.crmwebservice;

public interface CRMWebService extends javax.xml.rpc.Service {
    public java.lang.String getCRMWebServiceSoapAddress();

    public com.zfb.webservice.crmwebservice.CRMWebServiceSoap getCRMWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.zfb.webservice.crmwebservice.CRMWebServiceSoap getCRMWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
