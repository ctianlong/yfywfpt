/**
 * CRMWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zfb.webservice.crmwebservice;

public interface CRMWebServiceSoap extends java.rmi.Remote {
    public void pushTemplateMessage(java.lang.String msgType, java.lang.String userID, java.lang.String agreementID, java.lang.String first, java.lang.String remark, java.lang.String keywords, java.lang.String actionName, java.lang.String urlParas, java.lang.String rptType) throws java.rmi.RemoteException;
    public java.lang.String pushMatcherMessage(java.lang.String msgType, java.lang.String mobileNo, java.lang.String identityCard, java.lang.String first, java.lang.String remark, java.lang.String keywords) throws java.rmi.RemoteException;
    public void pushEvaluateMessage(java.lang.String userID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String visitDate) throws java.rmi.RemoteException;
    public void pushPayForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String payMentID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType) throws java.rmi.RemoteException;
    public void pushNewPreAuthorForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType, java.lang.String outOrderNo, java.lang.String outRequestNo, java.lang.String freezeFee) throws java.rmi.RemoteException;
    public void pushPreAuthorForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType, java.lang.String auth_no, java.lang.String out_request_no, java.lang.String amount, java.lang.String remark, java.lang.String mixfee) throws java.rmi.RemoteException;
    public void sendReportForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, java.lang.String patId, java.lang.String reqNo, java.lang.String applyNo, java.lang.String techNo, java.lang.String type, java.lang.String id, java.lang.String isRead) throws java.rmi.RemoteException;
    public java.lang.String unbindMedicalCardForAlipay(java.lang.String agreementID, java.lang.String cardNo, java.lang.String alipayUserID) throws java.rmi.RemoteException;
    public java.lang.String refundSingleToAlipayUser(java.lang.String alipay_trade_no, java.lang.String refund_batch_no, java.lang.String refund_fee, java.lang.String refund_reason) throws java.rmi.RemoteException;
    public java.lang.String doPreAuthorizationFreeze(java.lang.String outOrderNo, java.lang.String outRequestNo, java.lang.String freezeFee) throws java.rmi.RemoteException;
    public java.lang.String doPreAuthorizationUnFreeze(java.lang.String authNo, java.lang.String outRequestNo, java.lang.String amount, java.lang.String remark) throws java.rmi.RemoteException;
    public java.lang.String doPreAuthorizationFreezeApply(java.lang.String authNo, java.lang.String outRequestNo, java.lang.String amount, java.lang.String remark) throws java.rmi.RemoteException;
    public java.lang.String doPreAuthorizationQuery(java.lang.String authNo, java.lang.String outOrderNo) throws java.rmi.RemoteException;
    public java.lang.String doPreAuthorizationPay(java.lang.String authNo, java.lang.String bodyDesc, java.lang.String subjectDesc, java.lang.String buyerId, java.lang.String outTradeNo, java.lang.String totalFee) throws java.rmi.RemoteException;
    public java.lang.String doSingleTradeQuery(java.lang.String outOrderNo) throws java.rmi.RemoteException;
    public java.lang.String refundToAlipayUser(java.lang.String[] alipay_trade_no, java.lang.String refund_batch_no, java.lang.String[] refund_fee, java.lang.String[] refund_reason, java.lang.String count) throws java.rmi.RemoteException;
}
