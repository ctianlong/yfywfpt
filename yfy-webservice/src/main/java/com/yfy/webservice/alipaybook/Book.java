/**
 * Book.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yfy.webservice.alipaybook;

public interface Book extends javax.xml.rpc.Service {
    public java.lang.String getBookSoapAddress();

    public com.yfy.webservice.alipaybook.BookSoap getBookSoap() throws javax.xml.rpc.ServiceException;

    public com.yfy.webservice.alipaybook.BookSoap getBookSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
