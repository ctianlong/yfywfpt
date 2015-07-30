package com.yfy.webservice.alipaybook;
 
public class BookSoapProxy implements com.yfy.webservice.alipaybook.BookSoap {
  private String _endpoint = null;
  private com.yfy.webservice.alipaybook.BookSoap bookSoap = null;
  
  public BookSoapProxy() {
    _initBookSoapProxy();
  }
   
  public BookSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookSoapProxy();
  }
  
  private void _initBookSoapProxy() {
    try {
      bookSoap = (new com.yfy.webservice.alipaybook.BookLocator()).getBookSoap();
      if (bookSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookSoap != null)
      ((javax.xml.rpc.Stub)bookSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.yfy.webservice.alipaybook.BookSoap getBookSoap() {
    if (bookSoap == null)
      _initBookSoapProxy();
    return bookSoap;
  }
  
  public java.lang.String YYSendLab(java.lang.String callType, java.lang.String xmlMessage) throws java.rmi.RemoteException{
    if (bookSoap == null)
      _initBookSoapProxy();
    return bookSoap.YYSendLab(callType, xmlMessage);
  }
  
  
}