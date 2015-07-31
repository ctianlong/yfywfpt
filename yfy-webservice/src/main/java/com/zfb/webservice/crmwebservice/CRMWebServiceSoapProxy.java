package com.zfb.webservice.crmwebservice;

public class CRMWebServiceSoapProxy implements com.zfb.webservice.crmwebservice.CRMWebServiceSoap {
  private String _endpoint = null;
  private com.zfb.webservice.crmwebservice.CRMWebServiceSoap cRMWebServiceSoap = null;
  
  public CRMWebServiceSoapProxy() {
    _initCRMWebServiceSoapProxy();
  }
  
  public CRMWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCRMWebServiceSoapProxy();
  }
  
  private void _initCRMWebServiceSoapProxy() {
    try {
      cRMWebServiceSoap = (new com.zfb.webservice.crmwebservice.CRMWebServiceLocator()).getCRMWebServiceSoap();
      if (cRMWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cRMWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cRMWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cRMWebServiceSoap != null)
      ((javax.xml.rpc.Stub)cRMWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.zfb.webservice.crmwebservice.CRMWebServiceSoap getCRMWebServiceSoap() {
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap;
  }
  
  public void pushTemplateMessage(java.lang.String msgType, java.lang.String userID, java.lang.String agreementID, java.lang.String first, java.lang.String remark, java.lang.String keywords, java.lang.String actionName, java.lang.String urlParas, java.lang.String rptType) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    cRMWebServiceSoap.pushTemplateMessage(msgType, userID, agreementID, first, remark, keywords, actionName, urlParas, rptType);
  }
  
  public java.lang.String pushMatcherMessage(java.lang.String msgType, java.lang.String mobileNo, java.lang.String identityCard, java.lang.String first, java.lang.String remark, java.lang.String keywords) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.pushMatcherMessage(msgType, mobileNo, identityCard, first, remark, keywords);
  }
  
  public void pushEvaluateMessage(java.lang.String userID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String visitDate) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    cRMWebServiceSoap.pushEvaluateMessage(userID, title, desc, actionName, visitDate);
  }
  
  public void pushPayForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String payMentID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    cRMWebServiceSoap.pushPayForAlipay(userID, agreementID, payMentID, title, desc, actionName, isPush, payType);
  }
  
  public void pushNewPreAuthorForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType, java.lang.String outOrderNo, java.lang.String outRequestNo, java.lang.String freezeFee) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    cRMWebServiceSoap.pushNewPreAuthorForAlipay(userID, agreementID, title, desc, actionName, isPush, payType, outOrderNo, outRequestNo, freezeFee);
  }
  
  public void pushPreAuthorForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, int payType, java.lang.String auth_no, java.lang.String out_request_no, java.lang.String amount, java.lang.String remark, java.lang.String mixfee) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    cRMWebServiceSoap.pushPreAuthorForAlipay(userID, agreementID, title, desc, actionName, isPush, payType, auth_no, out_request_no, amount, remark, mixfee);
  }
  
  public void sendReportForAlipay(java.lang.String userID, java.lang.String agreementID, java.lang.String title, java.lang.String desc, java.lang.String actionName, java.lang.String isPush, java.lang.String patId, java.lang.String reqNo, java.lang.String applyNo, java.lang.String techNo, java.lang.String type, java.lang.String id, java.lang.String isRead) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    cRMWebServiceSoap.sendReportForAlipay(userID, agreementID, title, desc, actionName, isPush, patId, reqNo, applyNo, techNo, type, id, isRead);
  }
  
  public java.lang.String unbindMedicalCardForAlipay(java.lang.String agreementID, java.lang.String cardNo, java.lang.String alipayUserID) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.unbindMedicalCardForAlipay(agreementID, cardNo, alipayUserID);
  }
  
  public java.lang.String refundSingleToAlipayUser(java.lang.String alipay_trade_no, java.lang.String refund_batch_no, java.lang.String refund_fee, java.lang.String refund_reason) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.refundSingleToAlipayUser(alipay_trade_no, refund_batch_no, refund_fee, refund_reason);
  }
  
  public java.lang.String doPreAuthorizationFreeze(java.lang.String outOrderNo, java.lang.String outRequestNo, java.lang.String freezeFee) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.doPreAuthorizationFreeze(outOrderNo, outRequestNo, freezeFee);
  }
  
  public java.lang.String doPreAuthorizationUnFreeze(java.lang.String authNo, java.lang.String outRequestNo, java.lang.String amount, java.lang.String remark) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.doPreAuthorizationUnFreeze(authNo, outRequestNo, amount, remark);
  }
  
  public java.lang.String doPreAuthorizationFreezeApply(java.lang.String authNo, java.lang.String outRequestNo, java.lang.String amount, java.lang.String remark) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.doPreAuthorizationFreezeApply(authNo, outRequestNo, amount, remark);
  }
  
  public java.lang.String doPreAuthorizationQuery(java.lang.String authNo, java.lang.String outOrderNo) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.doPreAuthorizationQuery(authNo, outOrderNo);
  }
  
  public java.lang.String doPreAuthorizationPay(java.lang.String authNo, java.lang.String bodyDesc, java.lang.String subjectDesc, java.lang.String buyerId, java.lang.String outTradeNo, java.lang.String totalFee) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.doPreAuthorizationPay(authNo, bodyDesc, subjectDesc, buyerId, outTradeNo, totalFee);
  }
  
  public java.lang.String doSingleTradeQuery(java.lang.String outOrderNo) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.doSingleTradeQuery(outOrderNo);
  }
  
  public java.lang.String refundToAlipayUser(java.lang.String[] alipay_trade_no, java.lang.String refund_batch_no, java.lang.String[] refund_fee, java.lang.String[] refund_reason, java.lang.String count) throws java.rmi.RemoteException{
    if (cRMWebServiceSoap == null)
      _initCRMWebServiceSoapProxy();
    return cRMWebServiceSoap.refundToAlipayUser(alipay_trade_no, refund_batch_no, refund_fee, refund_reason, count);
  }
  
  
}