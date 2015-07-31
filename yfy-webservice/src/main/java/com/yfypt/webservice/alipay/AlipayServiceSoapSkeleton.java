/**
 * AlipayServiceSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yfypt.webservice.alipay;

public class AlipayServiceSoapSkeleton implements com.yfypt.webservice.alipay.AlipayServiceSoap, org.apache.axis.wsdl.Skeleton {
    private com.yfypt.webservice.alipay.AlipayServiceSoap impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Bill_Download", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Bill_DownloadResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Bill_Download"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Bill_Download");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Bill_Download") == null) {
            _myOperations.put("alipay_Bill_Download", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Bill_Download")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getPersonalCard", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetPersonalCardResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPersonalCard"));
        _oper.setSoapAction("http://tempuri.org/GetPersonalCard");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getPersonalCard") == null) {
            _myOperations.put("getPersonalCard", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getPersonalCard")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("card_Bind", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Card_BindResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Card_Bind"));
        _oper.setSoapAction("http://tempuri.org/Card_Bind");
        _myOperationsList.add(_oper);
        if (_myOperations.get("card_Bind") == null) {
            _myOperations.put("card_Bind", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("card_Bind")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("card_Bind_Cancel_Other", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Card_Bind_Cancel_OtherResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Card_Bind_Cancel_Other"));
        _oper.setSoapAction("http://tempuri.org/Card_Bind_Cancel_Other");
        _myOperationsList.add(_oper);
        if (_myOperations.get("card_Bind_Cancel_Other") == null) {
            _myOperations.put("card_Bind_Cancel_Other", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("card_Bind_Cancel_Other")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_NewAdd", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_NewAddResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_NewAdd"));
        _oper.setSoapAction("http://tempuri.org/Alipay_NewAdd");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_NewAdd") == null) {
            _myOperations.put("alipay_NewAdd", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_NewAdd")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Booking", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_BookingResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Booking"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Booking");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Booking") == null) {
            _myOperations.put("alipay_Booking", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Booking")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_AgreementId", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AgreementIdResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AgreementId"));
        _oper.setSoapAction("http://tempuri.org/Alipay_AgreementId");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_AgreementId") == null) {
            _myOperations.put("alipay_AgreementId", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_AgreementId")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Regist_Record", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Regist_RecordResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Regist_Record"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Regist_Record");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Regist_Record") == null) {
            _myOperations.put("alipay_Regist_Record", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Regist_Record")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Regist_Record_Detail", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Regist_Record_DetailResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Regist_Record_Detail"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Regist_Record_Detail");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Regist_Record_Detail") == null) {
            _myOperations.put("alipay_Regist_Record_Detail", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Regist_Record_Detail")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Regist_Dept", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Regist_DeptResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Regist_Dept"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Regist_Dept");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Regist_Dept") == null) {
            _myOperations.put("alipay_Regist_Dept", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Regist_Dept")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Regist", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RegistResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Regist"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Regist");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Regist") == null) {
            _myOperations.put("alipay_Regist", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Regist")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_RegistApply", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RegistApplyResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RegistApply"));
        _oper.setSoapAction("http://tempuri.org/Alipay_RegistApply");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_RegistApply") == null) {
            _myOperations.put("alipay_RegistApply", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_RegistApply")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetOrderInfoByOrderNo", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetOrderInfoByOrderNoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetOrderInfoByOrderNo"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetOrderInfoByOrderNo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetOrderInfoByOrderNo") == null) {
            _myOperations.put("alipay_GetOrderInfoByOrderNo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetOrderInfoByOrderNo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_UpdateOrderChargeInfo", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_UpdateOrderChargeInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_UpdateOrderChargeInfo"));
        _oper.setSoapAction("http://tempuri.org/Alipay_UpdateOrderChargeInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_UpdateOrderChargeInfo") == null) {
            _myOperations.put("alipay_UpdateOrderChargeInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_UpdateOrderChargeInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetAlipayOrder", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAlipayOrderResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAlipayOrder"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetAlipayOrder");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetAlipayOrder") == null) {
            _myOperations.put("alipay_GetAlipayOrder", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetAlipayOrder")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetAlipayOrderDetail", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAlipayOrderDetailResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAlipayOrderDetail"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetAlipayOrderDetail");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetAlipayOrderDetail") == null) {
            _myOperations.put("alipay_GetAlipayOrderDetail", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetAlipayOrderDetail")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetAllAlipayOrderRecord", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAllAlipayOrderRecordResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAllAlipayOrderRecord"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetAllAlipayOrderRecord");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetAllAlipayOrderRecord") == null) {
            _myOperations.put("alipay_GetAllAlipayOrderRecord", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetAllAlipayOrderRecord")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Cancel", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_CancelResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Cancel"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Cancel");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Cancel") == null) {
            _myOperations.put("alipay_Cancel", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Cancel")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetTestReportPageAddr", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportPageAddrResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportPageAddr"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetTestReportPageAddr");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetTestReportPageAddr") == null) {
            _myOperations.put("alipay_GetTestReportPageAddr", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetTestReportPageAddr")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetTestReportList", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportListResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportList"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetTestReportList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetTestReportList") == null) {
            _myOperations.put("alipay_GetTestReportList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetTestReportList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetAllTestReportList", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAllTestReportListResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetAllTestReportList"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetAllTestReportList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetAllTestReportList") == null) {
            _myOperations.put("alipay_GetAllTestReportList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetAllTestReportList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_UpdateMessageType", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_UpdateMessageTypeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_UpdateMessageType"));
        _oper.setSoapAction("http://tempuri.org/Alipay_UpdateMessageType");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_UpdateMessageType") == null) {
            _myOperations.put("alipay_UpdateMessageType", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_UpdateMessageType")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetTestReportDetail", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportDetailResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportDetail"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetTestReportDetail");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetTestReportDetail") == null) {
            _myOperations.put("alipay_GetTestReportDetail", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetTestReportDetail")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetTestReportDetail2", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportDetail2Result"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetTestReportDetail2"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetTestReportDetail2");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetTestReportDetail2") == null) {
            _myOperations.put("alipay_GetTestReportDetail2", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetTestReportDetail2")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetPersonInfoByAlipayID", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetPersonInfoByAlipayIDResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetPersonInfoByAlipayID"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetPersonInfoByAlipayID");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetPersonInfoByAlipayID") == null) {
            _myOperations.put("alipay_GetPersonInfoByAlipayID", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetPersonInfoByAlipayID")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_AddAlipayPersonInfo", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AddAlipayPersonInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AddAlipayPersonInfo"));
        _oper.setSoapAction("http://tempuri.org/Alipay_AddAlipayPersonInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_AddAlipayPersonInfo") == null) {
            _myOperations.put("alipay_AddAlipayPersonInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_AddAlipayPersonInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_GetPersonInfo", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetPersonInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_GetPersonInfo"));
        _oper.setSoapAction("http://tempuri.org/Alipay_GetPersonInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_GetPersonInfo") == null) {
            _myOperations.put("alipay_GetPersonInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_GetPersonInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_SetPrefee", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_SetPrefeeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_SetPrefee"));
        _oper.setSoapAction("http://tempuri.org/Alipay_SetPrefee");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_SetPrefee") == null) {
            _myOperations.put("alipay_SetPrefee", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_SetPrefee")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_InpFee", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_InpFeeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_InpFee"));
        _oper.setSoapAction("http://tempuri.org/Alipay_InpFee");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_InpFee") == null) {
            _myOperations.put("alipay_InpFee", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_InpFee")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getWaitingDept", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetWaitingDeptResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetWaitingDept"));
        _oper.setSoapAction("http://tempuri.org/GetWaitingDept");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getWaitingDept") == null) {
            _myOperations.put("getWaitingDept", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getWaitingDept")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "str"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("fundAuthAsync", _params, new javax.xml.namespace.QName("http://tempuri.org/", "FundAuthAsyncResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "FundAuthAsync"));
        _oper.setSoapAction("http://tempuri.org/FundAuthAsync");
        _myOperationsList.add(_oper);
        if (_myOperations.get("fundAuthAsync") == null) {
            _myOperations.put("fundAuthAsync", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("fundAuthAsync")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_PatStatus", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PatStatusResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PatStatus"));
        _oper.setSoapAction("http://tempuri.org/Alipay_PatStatus");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_PatStatus") == null) {
            _myOperations.put("alipay_PatStatus", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_PatStatus")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_IsPreAuthorization", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_IsPreAuthorizationResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_IsPreAuthorization"));
        _oper.setSoapAction("http://tempuri.org/Alipay_IsPreAuthorization");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_IsPreAuthorization") == null) {
            _myOperations.put("alipay_IsPreAuthorization", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_IsPreAuthorization")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Inp_Fee_PrepardFee", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Inp_Fee_PrepardFeeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Inp_Fee_PrepardFee"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Inp_Fee_PrepardFee");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Inp_Fee_PrepardFee") == null) {
            _myOperations.put("alipay_Inp_Fee_PrepardFee", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Inp_Fee_PrepardFee")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_RenewRegistApplyOrderNo", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RenewRegistApplyOrderNoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RenewRegistApplyOrderNo"));
        _oper.setSoapAction("http://tempuri.org/Alipay_RenewRegistApplyOrderNo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_RenewRegistApplyOrderNo") == null) {
            _myOperations.put("alipay_RenewRegistApplyOrderNo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_RenewRegistApplyOrderNo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_PreAuthorizationQuery", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PreAuthorizationQueryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PreAuthorizationQuery"));
        _oper.setSoapAction("http://tempuri.org/Alipay_PreAuthorizationQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_PreAuthorizationQuery") == null) {
            _myOperations.put("alipay_PreAuthorizationQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_PreAuthorizationQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_AuthorizationUnFreeze", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AuthorizationUnFreezeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AuthorizationUnFreeze"));
        _oper.setSoapAction("http://tempuri.org/Alipay_AuthorizationUnFreeze");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_AuthorizationUnFreeze") == null) {
            _myOperations.put("alipay_AuthorizationUnFreeze", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_AuthorizationUnFreeze")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_AuthorizationNewFreeze", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AuthorizationNewFreezeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AuthorizationNewFreeze"));
        _oper.setSoapAction("http://tempuri.org/Alipay_AuthorizationNewFreeze");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_AuthorizationNewFreeze") == null) {
            _myOperations.put("alipay_AuthorizationNewFreeze", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_AuthorizationNewFreeze")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_OrderHasPay", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_OrderHasPayResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_OrderHasPay"));
        _oper.setSoapAction("http://tempuri.org/Alipay_OrderHasPay");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_OrderHasPay") == null) {
            _myOperations.put("alipay_OrderHasPay", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_OrderHasPay")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_RechargeAccount", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RechargeAccountResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RechargeAccount"));
        _oper.setSoapAction("http://tempuri.org/Alipay_RechargeAccount");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_RechargeAccount") == null) {
            _myOperations.put("alipay_RechargeAccount", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_RechargeAccount")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_RechargeAccount_Query", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RechargeAccount_QueryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_RechargeAccount_Query"));
        _oper.setSoapAction("http://tempuri.org/Alipay_RechargeAccount_Query");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_RechargeAccount_Query") == null) {
            _myOperations.put("alipay_RechargeAccount_Query", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_RechargeAccount_Query")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Wechat_Refund", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Wechat_RefundResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Wechat_Refund"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Wechat_Refund");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Wechat_Refund") == null) {
            _myOperations.put("alipay_Wechat_Refund", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Wechat_Refund")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_HospitalList", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_HospitalListResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_HospitalList"));
        _oper.setSoapAction("http://tempuri.org/Alipay_HospitalList");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_HospitalList") == null) {
            _myOperations.put("alipay_HospitalList", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_HospitalList")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_DoctorInfo", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_DoctorInfoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_DoctorInfo"));
        _oper.setSoapAction("http://tempuri.org/Alipay_DoctorInfo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_DoctorInfo") == null) {
            _myOperations.put("alipay_DoctorInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_DoctorInfo")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_MyWaitingQuery", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_MyWaitingQueryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_MyWaitingQuery"));
        _oper.setSoapAction("http://tempuri.org/Alipay_MyWaitingQuery");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_MyWaitingQuery") == null) {
            _myOperations.put("alipay_MyWaitingQuery", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_MyWaitingQuery")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_AuthorizeCheck", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AuthorizeCheckResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_AuthorizeCheck"));
        _oper.setSoapAction("http://tempuri.org/Alipay_AuthorizeCheck");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_AuthorizeCheck") == null) {
            _myOperations.put("alipay_AuthorizeCheck", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_AuthorizeCheck")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_PayForOrder_AdvHis", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PayForOrder_AdvHisResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PayForOrder_AdvHis"));
        _oper.setSoapAction("http://tempuri.org/Alipay_PayForOrder_AdvHis");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_PayForOrder_AdvHis") == null) {
            _myOperations.put("alipay_PayForOrder_AdvHis", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_PayForOrder_AdvHis")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_PayForOrder_Adv", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PayForOrder_AdvResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PayForOrder_Adv"));
        _oper.setSoapAction("http://tempuri.org/Alipay_PayForOrder_Adv");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_PayForOrder_Adv") == null) {
            _myOperations.put("alipay_PayForOrder_Adv", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_PayForOrder_Adv")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_PayForOrder", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PayForOrderResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_PayForOrder"));
        _oper.setSoapAction("http://tempuri.org/Alipay_PayForOrder");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_PayForOrder") == null) {
            _myOperations.put("alipay_PayForOrder", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_PayForOrder")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_BookForCheck_Queueno", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_BookForCheck_QueuenoResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_BookForCheck_Queueno"));
        _oper.setSoapAction("http://tempuri.org/Alipay_BookForCheck_Queueno");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_BookForCheck_Queueno") == null) {
            _myOperations.put("alipay_BookForCheck_Queueno", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_BookForCheck_Queueno")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_BookForCheck_Queueno_List", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_BookForCheck_Queueno_ListResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_BookForCheck_Queueno_List"));
        _oper.setSoapAction("http://tempuri.org/Alipay_BookForCheck_Queueno_List");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_BookForCheck_Queueno_List") == null) {
            _myOperations.put("alipay_BookForCheck_Queueno_List", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_BookForCheck_Queueno_List")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_BookForCheck_Queueno_Query", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_BookForCheck_Queueno_QueryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_BookForCheck_Queueno_Query"));
        _oper.setSoapAction("http://tempuri.org/Alipay_BookForCheck_Queueno_Query");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_BookForCheck_Queueno_Query") == null) {
            _myOperations.put("alipay_BookForCheck_Queueno_Query", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_BookForCheck_Queueno_Query")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_MatcherUser", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_MatcherUserResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_MatcherUser"));
        _oper.setSoapAction("http://tempuri.org/Alipay_MatcherUser");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_MatcherUser") == null) {
            _myOperations.put("alipay_MatcherUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_MatcherUser")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_ReportAnalysis_Item", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_ReportAnalysis_ItemResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_ReportAnalysis_Item"));
        _oper.setSoapAction("http://tempuri.org/Alipay_ReportAnalysis_Item");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_ReportAnalysis_Item") == null) {
            _myOperations.put("alipay_ReportAnalysis_Item", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_ReportAnalysis_Item")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Mother_Kid", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Mother_KidResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Mother_Kid"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Mother_Kid");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Mother_Kid") == null) {
            _myOperations.put("alipay_Mother_Kid", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Mother_Kid")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_OtherServiceAuth", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_OtherServiceAuthResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_OtherServiceAuth"));
        _oper.setSoapAction("http://tempuri.org/Alipay_OtherServiceAuth");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_OtherServiceAuth") == null) {
            _myOperations.put("alipay_OtherServiceAuth", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_OtherServiceAuth")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alipay_Authoration_ApplyAndUser", _params, new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Authoration_ApplyAndUserResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Alipay_Authoration_ApplyAndUser"));
        _oper.setSoapAction("http://tempuri.org/Alipay_Authoration_ApplyAndUser");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alipay_Authoration_ApplyAndUser") == null) {
            _myOperations.put("alipay_Authoration_ApplyAndUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alipay_Authoration_ApplyAndUser")).add(_oper);
    }

    public AlipayServiceSoapSkeleton() {
        this.impl = new com.yfypt.webservice.alipay.AlipayServiceSoapImpl();
    }

    public AlipayServiceSoapSkeleton(com.yfypt.webservice.alipay.AlipayServiceSoap impl) {
        this.impl = impl;
    }
    public java.lang.String alipay_Bill_Download(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Bill_Download(xml);
        return ret;
    }

    public java.lang.String getPersonalCard(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getPersonalCard(xml);
        return ret;
    }

    public java.lang.String card_Bind(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.card_Bind(xml);
        return ret;
    }

    public java.lang.String card_Bind_Cancel_Other(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.card_Bind_Cancel_Other(xml);
        return ret;
    }

    public java.lang.String alipay_NewAdd(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_NewAdd(xml);
        return ret;
    }

    public java.lang.String alipay_Booking(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Booking(xml);
        return ret;
    }

    public java.lang.String alipay_AgreementId(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_AgreementId(xml);
        return ret;
    }

    public java.lang.String alipay_Regist_Record(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Regist_Record(xml);
        return ret;
    }

    public java.lang.String alipay_Regist_Record_Detail(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Regist_Record_Detail(xml);
        return ret;
    }

    public java.lang.String alipay_Regist_Dept(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Regist_Dept(xml);
        return ret;
    }

    public java.lang.String alipay_Regist(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Regist(xml);
        return ret;
    }

    public java.lang.String alipay_RegistApply(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_RegistApply(xml);
        return ret;
    }

    public java.lang.String alipay_GetOrderInfoByOrderNo(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetOrderInfoByOrderNo(xml);
        return ret;
    }

    public java.lang.String alipay_UpdateOrderChargeInfo(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_UpdateOrderChargeInfo(xml);
        return ret;
    }

    public java.lang.String alipay_GetAlipayOrder(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetAlipayOrder(xml);
        return ret;
    }

    public java.lang.String alipay_GetAlipayOrderDetail(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetAlipayOrderDetail(xml);
        return ret;
    }

    public java.lang.String alipay_GetAllAlipayOrderRecord(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetAllAlipayOrderRecord(xml);
        return ret;
    }

    public java.lang.String alipay_Cancel(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Cancel(xml);
        return ret;
    }

    public java.lang.String alipay_GetTestReportPageAddr(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetTestReportPageAddr(xml);
        return ret;
    }

    public java.lang.String alipay_GetTestReportList(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetTestReportList(xml);
        return ret;
    }

    public java.lang.String alipay_GetAllTestReportList(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetAllTestReportList(xml);
        return ret;
    }

    public java.lang.String alipay_UpdateMessageType(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_UpdateMessageType(xml);
        return ret;
    }

    public java.lang.String alipay_GetTestReportDetail(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetTestReportDetail(xml);
        return ret;
    }

    public java.lang.String alipay_GetTestReportDetail2(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetTestReportDetail2(xml);
        return ret;
    }

    public java.lang.String alipay_GetPersonInfoByAlipayID(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetPersonInfoByAlipayID(xml);
        return ret;
    }

    public java.lang.String alipay_AddAlipayPersonInfo(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_AddAlipayPersonInfo(xml);
        return ret;
    }

    public java.lang.String alipay_GetPersonInfo(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_GetPersonInfo(xml);
        return ret;
    }

    public java.lang.String alipay_SetPrefee(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_SetPrefee(xml);
        return ret;
    }

    public java.lang.String alipay_InpFee(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_InpFee(xml);
        return ret;
    }

    public java.lang.String getWaitingDept(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getWaitingDept(xml);
        return ret;
    }

    public java.lang.String fundAuthAsync(java.lang.String type, java.lang.String str) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.fundAuthAsync(type, str);
        return ret;
    }

    public java.lang.String alipay_PatStatus(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_PatStatus(xml);
        return ret;
    }

    public java.lang.String alipay_IsPreAuthorization(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_IsPreAuthorization(xml);
        return ret;
    }

    public java.lang.String alipay_Inp_Fee_PrepardFee(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Inp_Fee_PrepardFee(xml);
        return ret;
    }

    public java.lang.String alipay_RenewRegistApplyOrderNo(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_RenewRegistApplyOrderNo(xml);
        return ret;
    }

    public java.lang.String alipay_PreAuthorizationQuery(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_PreAuthorizationQuery(xml);
        return ret;
    }

    public java.lang.String alipay_AuthorizationUnFreeze(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_AuthorizationUnFreeze(xml);
        return ret;
    }

    public java.lang.String alipay_AuthorizationNewFreeze(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_AuthorizationNewFreeze(xml);
        return ret;
    }

    public java.lang.String alipay_OrderHasPay(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_OrderHasPay(xml);
        return ret;
    }

    public java.lang.String alipay_RechargeAccount(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_RechargeAccount(xml);
        return ret;
    }

    public java.lang.String alipay_RechargeAccount_Query(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_RechargeAccount_Query(xml);
        return ret;
    }

    public java.lang.String alipay_Wechat_Refund(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Wechat_Refund(xml);
        return ret;
    }

    public java.lang.String alipay_HospitalList(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_HospitalList(xml);
        return ret;
    }

    public java.lang.String alipay_DoctorInfo(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_DoctorInfo(xml);
        return ret;
    }

    public java.lang.String alipay_MyWaitingQuery(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_MyWaitingQuery(xml);
        return ret;
    }

    public java.lang.String alipay_AuthorizeCheck(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_AuthorizeCheck(xml);
        return ret;
    }

    public java.lang.String alipay_PayForOrder_AdvHis(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_PayForOrder_AdvHis(xml);
        return ret;
    }

    public java.lang.String alipay_PayForOrder_Adv(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_PayForOrder_Adv(xml);
        return ret;
    }

    public java.lang.String alipay_PayForOrder(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_PayForOrder(xml);
        return ret;
    }

    public java.lang.String alipay_BookForCheck_Queueno(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_BookForCheck_Queueno(xml);
        return ret;
    }

    public java.lang.String alipay_BookForCheck_Queueno_List(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_BookForCheck_Queueno_List(xml);
        return ret;
    }

    public java.lang.String alipay_BookForCheck_Queueno_Query(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_BookForCheck_Queueno_Query(xml);
        return ret;
    }

    public java.lang.String alipay_MatcherUser(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_MatcherUser(xml);
        return ret;
    }

    public java.lang.String alipay_ReportAnalysis_Item(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_ReportAnalysis_Item(xml);
        return ret;
    }

    public java.lang.String alipay_Mother_Kid(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Mother_Kid(xml);
        return ret;
    }

    public java.lang.String alipay_OtherServiceAuth(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_OtherServiceAuth(xml);
        return ret;
    }

    public java.lang.String alipay_Authoration_ApplyAndUser(java.lang.String xml) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.alipay_Authoration_ApplyAndUser(xml);
        return ret;
    }

}
