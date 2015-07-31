/**
 * CRMWebServiceSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zfb.webservice.crmwebservice;

public class CRMWebServiceSoapSkeleton implements com.zfb.webservice.crmwebservice.CRMWebServiceSoap, org.apache.axis.wsdl.Skeleton {
    private com.zfb.webservice.crmwebservice.CRMWebServiceSoap impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "msgType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "agreementID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "first"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "remark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "keywords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "actionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "urlParas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "rptType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pushTemplateMessage", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "pushTemplateMessage"));
        _oper.setSoapAction("http://tempuri.org/pushTemplateMessage");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pushTemplateMessage") == null) {
            _myOperations.put("pushTemplateMessage", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pushTemplateMessage")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "msgType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "mobileNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "identityCard"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "first"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "remark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "keywords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pushMatcherMessage", _params, new javax.xml.namespace.QName("http://tempuri.org/", "pushMatcherMessageResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "pushMatcherMessage"));
        _oper.setSoapAction("http://tempuri.org/pushMatcherMessage");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pushMatcherMessage") == null) {
            _myOperations.put("pushMatcherMessage", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pushMatcherMessage")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "actionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "visitDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pushEvaluateMessage", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "pushEvaluateMessage"));
        _oper.setSoapAction("http://tempuri.org/pushEvaluateMessage");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pushEvaluateMessage") == null) {
            _myOperations.put("pushEvaluateMessage", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pushEvaluateMessage")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "agreementID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "payMentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "actionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "isPush"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "payType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pushPayForAlipay", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "pushPayForAlipay"));
        _oper.setSoapAction("http://tempuri.org/pushPayForAlipay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pushPayForAlipay") == null) {
            _myOperations.put("pushPayForAlipay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pushPayForAlipay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "agreementID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "actionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "isPush"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "payType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outOrderNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outRequestNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "freezeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pushNewPreAuthorForAlipay", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "pushNewPreAuthorForAlipay"));
        _oper.setSoapAction("http://tempuri.org/pushNewPreAuthorForAlipay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pushNewPreAuthorForAlipay") == null) {
            _myOperations.put("pushNewPreAuthorForAlipay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pushNewPreAuthorForAlipay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "agreementID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "actionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "isPush"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "payType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "auth_no"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "out_request_no"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "remark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "mixfee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("pushPreAuthorForAlipay", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "pushPreAuthorForAlipay"));
        _oper.setSoapAction("http://tempuri.org/pushPreAuthorForAlipay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("pushPreAuthorForAlipay") == null) {
            _myOperations.put("pushPreAuthorForAlipay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("pushPreAuthorForAlipay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "agreementID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "actionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "isPush"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "patId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "reqNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "applyNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "techNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "isRead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sendReportForAlipay", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "sendReportForAlipay"));
        _oper.setSoapAction("http://tempuri.org/sendReportForAlipay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendReportForAlipay") == null) {
            _myOperations.put("sendReportForAlipay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sendReportForAlipay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "agreementID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "cardNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "alipayUserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("unbindMedicalCardForAlipay", _params, new javax.xml.namespace.QName("http://tempuri.org/", "unbindMedicalCardForAlipayResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "unbindMedicalCardForAlipay"));
        _oper.setSoapAction("http://tempuri.org/unbindMedicalCardForAlipay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("unbindMedicalCardForAlipay") == null) {
            _myOperations.put("unbindMedicalCardForAlipay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("unbindMedicalCardForAlipay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "alipay_trade_no"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "refund_batch_no"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "refund_fee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "refund_reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("refundSingleToAlipayUser", _params, new javax.xml.namespace.QName("http://tempuri.org/", "refundSingleToAlipayUserResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "refundSingleToAlipayUser"));
        _oper.setSoapAction("http://tempuri.org/refundSingleToAlipayUser");
        _myOperationsList.add(_oper);
        if (_myOperations.get("refundSingleToAlipayUser") == null) {
            _myOperations.put("refundSingleToAlipayUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("refundSingleToAlipayUser")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outOrderNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outRequestNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "freezeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doPreAuthorizationFreeze", _params, new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationFreezeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationFreeze"));
        _oper.setSoapAction("http://tempuri.org/doPreAuthorizationFreeze");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doPreAuthorizationFreeze") == null) {
            _myOperations.put("doPreAuthorizationFreeze", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doPreAuthorizationFreeze")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "authNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outRequestNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "remark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doPreAuthorizationUnFreeze", _params, new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationUnFreezeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationUnFreeze"));
        _oper.setSoapAction("http://tempuri.org/doPreAuthorizationUnFreeze");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doPreAuthorizationUnFreeze") == null) {
            _myOperations.put("doPreAuthorizationUnFreeze", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doPreAuthorizationUnFreeze")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "authNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outRequestNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "remark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doPreAuthorizationFreezeApply", _params, new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationFreezeApplyResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationFreezeApply"));
        _oper.setSoapAction("http://tempuri.org/doPreAuthorizationFreezeApply");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doPreAuthorizationFreezeApply") == null) {
            _myOperations.put("doPreAuthorizationFreezeApply", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doPreAuthorizationFreezeApply")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "authNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outOrderNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doPreAuthorizationQuery", _params, new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationQueryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationQuery"));
        _oper.setSoapAction("http://tempuri.org/doPreAuthorizationQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doPreAuthorizationQuery") == null) {
            _myOperations.put("doPreAuthorizationQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doPreAuthorizationQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "authNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "bodyDesc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "subjectDesc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "buyerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outTradeNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "totalFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doPreAuthorizationPay", _params, new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationPayResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "doPreAuthorizationPay"));
        _oper.setSoapAction("http://tempuri.org/doPreAuthorizationPay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doPreAuthorizationPay") == null) {
            _myOperations.put("doPreAuthorizationPay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doPreAuthorizationPay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "outOrderNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("doSingleTradeQuery", _params, new javax.xml.namespace.QName("http://tempuri.org/", "doSingleTradeQueryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "doSingleTradeQuery"));
        _oper.setSoapAction("http://tempuri.org/doSingleTradeQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("doSingleTradeQuery") == null) {
            _myOperations.put("doSingleTradeQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("doSingleTradeQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "alipay_trade_no"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "refund_batch_no"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "refund_fee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "refund_reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("refundToAlipayUser", _params, new javax.xml.namespace.QName("http://tempuri.org/", "refundToAlipayUserResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "refundToAlipayUser"));
        _oper.setSoapAction("http://tempuri.org/refundToAlipayUser");
        _myOperationsList.add(_oper);
        if (_myOperations.get("refundToAlipayUser") == null) {
            _myOperations.put("refundToAlipayUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("refundToAlipayUser")).add(_oper);
    }

    public CRMWebServiceSoapSkeleton() {
        this.impl = new com.zfb.webservice.crmwebservice.CRMWebServiceSoapImpl();
    }

    public CRMWebServiceSoapSkeleton(com.zfb.webservice.crmwebservice.CRMWebServiceSoap impl) {
        this.impl = impl;
    }
    public void pushTemplateMessage(java.lang.String msgType, java.lang.String userID, java.lang.String agreementID, java.lang.String first, java.lang.String remark, java.lang.String keywords, java.lang.String actionName, java.lang.String urlParas, java.lang.String rptType) throws java.rmi.RemoteException
    {
        impl.pushTemplateMessage(msgType, userID, agreementID, first, remark, keywords, actionName, urlParas, rptType);
    }

    public java.lang.String pushMatcherMessage(java.lang.String msgType, java.lang.String mobileNo, java.lang.String identityCard, java.lang.String first, java.lang.String remark, java.lang.String keywords) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.pushMatcherMessage(msgType, mobileNo, identityCard, first, remark, keywords);
        return ret;
    }

    public void pushEvaluateMessage(java.lang.String userID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String visitDate) throws java.rmi.RemoteException
    {
        impl.pushEvaluateMessage(userID, title, desc, actionName, visitDate);
    }

    public void pushPayForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String payMentID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType) throws java.rmi.RemoteException
    {
        impl.pushPayForAlipay(userID, agreementID, payMentID, title, desc, actionName, isPush, payType);
    }

    public void pushNewPreAuthorForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType, java.lang.String outOrderNo, java.lang.String outRequestNo, java.lang.String freezeFee) throws java.rmi.RemoteException
    {
        impl.pushNewPreAuthorForAlipay(userID, agreementID, title, desc, actionName, isPush, payType, outOrderNo, outRequestNo, freezeFee);
    }

    public void pushPreAuthorForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType, java.lang.String auth_no, java.lang.String out_request_no, java.lang.String amount, java.lang.String remark, java.lang.String mixfee) throws java.rmi.RemoteException
    {
        impl.pushPreAuthorForAlipay(userID, agreementID, title, desc, actionName, isPush, payType, auth_no, out_request_no, amount, remark, mixfee);
    }

    public void sendReportForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, java.lang.String patId, java.lang.String reqNo, java.lang.String applyNo, java.lang.String techNo, java.lang.String type, java.lang.String id, java.lang.String isRead) throws java.rmi.RemoteException
    {
        impl.sendReportForAlipay(userID, agreementID, title, desc, actionName, isPush, patId, reqNo, applyNo, techNo, type, id, isRead);
    }

    public java.lang.String unbindMedicalCardForAlipay(java.lang.String agreementID, java.lang.String cardNo, java.lang.String alipayUserID) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.unbindMedicalCardForAlipay(agreementID, cardNo, alipayUserID);
        return ret;
    }

    public java.lang.String refundSingleToAlipayUser(java.lang.String alipay_trade_no, java.lang.String refund_batch_no, java.lang.String refund_fee, java.lang.String refund_reason) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.refundSingleToAlipayUser(alipay_trade_no, refund_batch_no, refund_fee, refund_reason);
        return ret;
    }

    public java.lang.String doPreAuthorizationFreeze(java.lang.String outOrderNo, java.lang.String outRequestNo, java.lang.String freezeFee) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.doPreAuthorizationFreeze(outOrderNo, outRequestNo, freezeFee);
        return ret;
    }

    public java.lang.String doPreAuthorizationUnFreeze(java.lang.String authNo, java.lang.String outRequestNo, java.lang.String amount, java.lang.String remark) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.doPreAuthorizationUnFreeze(authNo, outRequestNo, amount, remark);
        return ret;
    }

    public java.lang.String doPreAuthorizationFreezeApply(java.lang.String authNo, java.lang.String outRequestNo, java.lang.String amount, java.lang.String remark) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.doPreAuthorizationFreezeApply(authNo, outRequestNo, amount, remark);
        return ret;
    }

    public java.lang.String doPreAuthorizationQuery(java.lang.String authNo, java.lang.String outOrderNo) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.doPreAuthorizationQuery(authNo, outOrderNo);
        return ret;
    }

    public java.lang.String doPreAuthorizationPay(java.lang.String authNo, java.lang.String bodyDesc, java.lang.String subjectDesc, java.lang.String buyerId, java.lang.String outTradeNo, java.lang.String totalFee) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.doPreAuthorizationPay(authNo, bodyDesc, subjectDesc, buyerId, outTradeNo, totalFee);
        return ret;
    }

    public java.lang.String doSingleTradeQuery(java.lang.String outOrderNo) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.doSingleTradeQuery(outOrderNo);
        return ret;
    }

    public java.lang.String refundToAlipayUser(java.lang.String[] alipay_trade_no, java.lang.String refund_batch_no, java.lang.String[] refund_fee, java.lang.String[] refund_reason, java.lang.String count) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.refundToAlipayUser(alipay_trade_no, refund_batch_no, refund_fee, refund_reason, count);
        return ret;
    }

}
