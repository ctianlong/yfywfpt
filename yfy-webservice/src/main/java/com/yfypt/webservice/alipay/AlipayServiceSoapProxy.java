package com.yfypt.webservice.alipay;

public class AlipayServiceSoapProxy implements com.yfypt.webservice.alipay.AlipayServiceSoap {
  private String _endpoint = null;
  private com.yfypt.webservice.alipay.AlipayServiceSoap alipayServiceSoap = null;
  
  public AlipayServiceSoapProxy() {
    _initAlipayServiceSoapProxy();
  }
  
  public AlipayServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initAlipayServiceSoapProxy();
  }
  
  private void _initAlipayServiceSoapProxy() {
    try {
      alipayServiceSoap = (new com.yfypt.webservice.alipay.AlipayServiceLocator()).getAlipayServiceSoap();
      if (alipayServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)alipayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)alipayServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (alipayServiceSoap != null)
      ((javax.xml.rpc.Stub)alipayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yfypt.webservice.alipay.AlipayServiceSoap getAlipayServiceSoap() {
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap;
  }
  
  public java.lang.String alipay_Bill_Download(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Bill_Download(xml);
  }
  
  public java.lang.String getPersonalCard(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.getPersonalCard(xml);
  }
  
  public java.lang.String card_Bind(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.card_Bind(xml);
  }
  
  public java.lang.String card_Bind_Cancel_Other(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.card_Bind_Cancel_Other(xml);
  }
  
  public java.lang.String alipay_NewAdd(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_NewAdd(xml);
  }
  
  public java.lang.String alipay_Booking(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Booking(xml);
  }
  
  public java.lang.String alipay_AgreementId(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_AgreementId(xml);
  }
  
  public java.lang.String alipay_Regist_Record(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Regist_Record(xml);
  }
  
  public java.lang.String alipay_Regist_Record_Detail(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Regist_Record_Detail(xml);
  }
  
  public java.lang.String alipay_Regist_Dept(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Regist_Dept(xml);
  }
  
  public java.lang.String alipay_Regist(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Regist(xml);
  }
  
  public java.lang.String alipay_RegistApply(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_RegistApply(xml);
  }
  
  public java.lang.String alipay_GetOrderInfoByOrderNo(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetOrderInfoByOrderNo(xml);
  }
  
  public java.lang.String alipay_UpdateOrderChargeInfo(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_UpdateOrderChargeInfo(xml);
  }
  
  public java.lang.String alipay_GetAlipayOrder(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetAlipayOrder(xml);
  }
  
  public java.lang.String alipay_GetAlipayOrderDetail(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetAlipayOrderDetail(xml);
  }
  
  public java.lang.String alipay_GetAllAlipayOrderRecord(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetAllAlipayOrderRecord(xml);
  }
  
  public java.lang.String alipay_Cancel(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Cancel(xml);
  }
  
  public java.lang.String alipay_GetTestReportPageAddr(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetTestReportPageAddr(xml);
  }
  
  public java.lang.String alipay_GetTestReportList(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetTestReportList(xml);
  }
  
  public java.lang.String alipay_GetAllTestReportList(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetAllTestReportList(xml);
  }
  
  public java.lang.String alipay_UpdateMessageType(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_UpdateMessageType(xml);
  }
  
  public java.lang.String alipay_GetTestReportDetail(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetTestReportDetail(xml);
  }
  
  public java.lang.String alipay_GetTestReportDetail2(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetTestReportDetail2(xml);
  }
  
  public java.lang.String alipay_GetPersonInfoByAlipayID(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetPersonInfoByAlipayID(xml);
  }
  
  public java.lang.String alipay_AddAlipayPersonInfo(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_AddAlipayPersonInfo(xml);
  }
  
  public java.lang.String alipay_GetPersonInfo(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_GetPersonInfo(xml);
  }
  
  public java.lang.String alipay_SetPrefee(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_SetPrefee(xml);
  }
  
  public java.lang.String alipay_InpFee(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_InpFee(xml);
  }
  
  public java.lang.String getWaitingDept(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.getWaitingDept(xml);
  }
  
  public java.lang.String fundAuthAsync(java.lang.String type, java.lang.String str) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.fundAuthAsync(type, str);
  }
  
  public java.lang.String alipay_PatStatus(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_PatStatus(xml);
  }
  
  public java.lang.String alipay_IsPreAuthorization(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_IsPreAuthorization(xml);
  }
  
  public java.lang.String alipay_Inp_Fee_PrepardFee(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Inp_Fee_PrepardFee(xml);
  }
  
  public java.lang.String alipay_RenewRegistApplyOrderNo(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_RenewRegistApplyOrderNo(xml);
  }
  
  public java.lang.String alipay_PreAuthorizationQuery(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_PreAuthorizationQuery(xml);
  }
  
  public java.lang.String alipay_AuthorizationUnFreeze(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_AuthorizationUnFreeze(xml);
  }
  
  public java.lang.String alipay_AuthorizationNewFreeze(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_AuthorizationNewFreeze(xml);
  }
  
  public java.lang.String alipay_OrderHasPay(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_OrderHasPay(xml);
  }
  
  public java.lang.String alipay_RechargeAccount(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_RechargeAccount(xml);
  }
  
  public java.lang.String alipay_RechargeAccount_Query(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_RechargeAccount_Query(xml);
  }
  
  public java.lang.String alipay_Wechat_Refund(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Wechat_Refund(xml);
  }
  
  public java.lang.String alipay_HospitalList(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_HospitalList(xml);
  }
  
  public java.lang.String alipay_DoctorInfo(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_DoctorInfo(xml);
  }
  
  public java.lang.String alipay_MyWaitingQuery(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_MyWaitingQuery(xml);
  }
  
  public java.lang.String alipay_AuthorizeCheck(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_AuthorizeCheck(xml);
  }
  
  public java.lang.String alipay_PayForOrder_AdvHis(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_PayForOrder_AdvHis(xml);
  }
  
  public java.lang.String alipay_PayForOrder_Adv(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_PayForOrder_Adv(xml);
  }
  
  public java.lang.String alipay_PayForOrder(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_PayForOrder(xml);
  }
  
  public java.lang.String alipay_BookForCheck_Queueno(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_BookForCheck_Queueno(xml);
  }
  
  public java.lang.String alipay_BookForCheck_Queueno_List(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_BookForCheck_Queueno_List(xml);
  }
  
  public java.lang.String alipay_BookForCheck_Queueno_Query(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_BookForCheck_Queueno_Query(xml);
  }
  
  public java.lang.String alipay_MatcherUser(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_MatcherUser(xml);
  }
  
  public java.lang.String alipay_ReportAnalysis_Item(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_ReportAnalysis_Item(xml);
  }
  
  public java.lang.String alipay_Mother_Kid(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Mother_Kid(xml);
  }
  
  public java.lang.String alipay_OtherServiceAuth(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_OtherServiceAuth(xml);
  }
  
  public java.lang.String alipay_Authoration_ApplyAndUser(java.lang.String xml) throws java.rmi.RemoteException{
    if (alipayServiceSoap == null)
      _initAlipayServiceSoapProxy();
    return alipayServiceSoap.alipay_Authoration_ApplyAndUser(xml);
  }
  
  
}