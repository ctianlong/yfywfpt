/**
 * BookSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yfy.webservice.alipaybook;

public class BookSoapSkeleton implements com.yfy.webservice.alipaybook.BookSoap, org.apache.axis.wsdl.Skeleton {
    private com.yfy.webservice.alipaybook.BookSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://WebBooking.com/", "callType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://WebBooking.com/", "xmlMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("YYSendLab", _params, new javax.xml.namespace.QName("http://WebBooking.com/", "YYSendLabResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://WebBooking.com/", "YYSendLab"));
        _oper.setSoapAction("http://WebBooking.com/YYSendLab");
        _myOperationsList.add(_oper);
        if (_myOperations.get("YYSendLab") == null) {
            _myOperations.put("YYSendLab", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("YYSendLab")).add(_oper);
    }

    public BookSoapSkeleton() {
        this.impl = new com.yfy.webservice.alipaybook.BookSoapImpl();
    }

    public BookSoapSkeleton(com.yfy.webservice.alipaybook.BookSoap impl) {
        this.impl = impl;
    }
    public java.lang.String YYSendLab(java.lang.String callType, java.lang.String xmlMessage) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.YYSendLab(callType, xmlMessage);
        return ret;
    }

}
