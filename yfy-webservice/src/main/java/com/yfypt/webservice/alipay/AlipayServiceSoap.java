/**
 * AlipayServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.yfypt.webservice.alipay;

public interface AlipayServiceSoap extends java.rmi.Remote {

    /**
     * 支付宝账单下载
     */
    public java.lang.String alipay_Bill_Download(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 绑定卡列表
     */
    public java.lang.String getPersonalCard(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 绑定就诊卡
     */
    public java.lang.String card_Bind(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 取消绑定(AgreementID)
     */
    public java.lang.String card_Bind_Cancel_Other(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 新增支付宝账户
     */
    public java.lang.String alipay_NewAdd(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预约
     */
    public java.lang.String alipay_Booking(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取账号绑卡协议号
     */
    public java.lang.String alipay_AgreementId(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 挂号预约列表
     */
    public java.lang.String alipay_Regist_Record(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 账号挂号预约明细
     */
    public java.lang.String alipay_Regist_Record_Detail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 当日挂号科室
     */
    public java.lang.String alipay_Regist_Dept(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 挂号/取消挂号
     */
    public java.lang.String alipay_Regist(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 挂号申请
     */
    public java.lang.String alipay_RegistApply(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 根据订单号取订单内容
     */
    public java.lang.String alipay_GetOrderInfoByOrderNo(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 根据订单号更新订单支付状态
     */
    public java.lang.String alipay_UpdateOrderChargeInfo(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取病人最新待付费项目
     */
    public java.lang.String alipay_GetAlipayOrder(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取订单明细内容
     */
    public java.lang.String alipay_GetAlipayOrderDetail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取患者所有交易记录
     */
    public java.lang.String alipay_GetAllAlipayOrderRecord(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 取消关注
     */
    public java.lang.String alipay_Cancel(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取报告页面地址
     */
    public java.lang.String alipay_GetTestReportPageAddr(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取报告列表
     */
    public java.lang.String alipay_GetTestReportList(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取五大类所有报告列表
     */
    public java.lang.String alipay_GetAllTestReportList(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 更新推送报告的未读状态
     */
    public java.lang.String alipay_UpdateMessageType(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取报告明细
     */
    public java.lang.String alipay_GetTestReportDetail(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取报告明细2
     */
    public java.lang.String alipay_GetTestReportDetail2(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 根据AgreementID获取信息
     */
    public java.lang.String alipay_GetPersonInfoByAlipayID(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 根据AgreementID修改信息
     */
    public java.lang.String alipay_AddAlipayPersonInfo(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 根据AgreementID修改信息
     */
    public java.lang.String alipay_GetPersonInfo(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预授权成功后返回授权金额
     */
    public java.lang.String alipay_SetPrefee(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 住院费用日结明细
     */
    public java.lang.String alipay_InpFee(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取候诊队列部门
     */
    public java.lang.String getWaitingDept(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预授权异步接口
     */
    public java.lang.String fundAuthAsync(java.lang.String type, java.lang.String str) throws java.rmi.RemoteException;

    /**
     * 获取病人在院状态
     */
    public java.lang.String alipay_PatStatus(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 是否预授权[未用]
     */
    public java.lang.String alipay_IsPreAuthorization(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预交金缴费查询
     */
    public java.lang.String alipay_Inp_Fee_PrepardFee(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 更新预授权OrderNo，RequestNo
     */
    public java.lang.String alipay_RenewRegistApplyOrderNo(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 我的预授权查询
     */
    public java.lang.String alipay_PreAuthorizationQuery(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预授权解冻
     */
    public java.lang.String alipay_AuthorizationUnFreeze(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预授权新增
     */
    public java.lang.String alipay_AuthorizationNewFreeze(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 订单是否支付
     */
    public java.lang.String alipay_OrderHasPay(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 一卡通充值
     */
    public java.lang.String alipay_RechargeAccount(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 查询是否有退费
     */
    public java.lang.String alipay_RechargeAccount_Query(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 微信申请退款
     */
    public java.lang.String alipay_Wechat_Refund(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取院区列表
     */
    public java.lang.String alipay_HospitalList(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 专家介绍
     */
    public java.lang.String alipay_DoctorInfo(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 我的候诊查询
     */
    public java.lang.String alipay_MyWaitingQuery(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 我的微信授权状态查询
     */
    public java.lang.String alipay_AuthorizeCheck(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 主动支付医嘱
     */
    public java.lang.String alipay_PayForOrder_AdvHis(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 选择支付医嘱
     */
    public java.lang.String alipay_PayForOrder_Adv(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 支付医嘱
     */
    public java.lang.String alipay_PayForOrder(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预约检查取号
     */
    public java.lang.String alipay_BookForCheck_Queueno(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预约检查列表
     */
    public java.lang.String alipay_BookForCheck_Queueno_List(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 预约检查列表
     */
    public java.lang.String alipay_BookForCheck_Queueno_Query(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 匹配支付宝用户
     */
    public java.lang.String alipay_MatcherUser(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取可解析项目列表
     */
    public java.lang.String alipay_ReportAnalysis_Item(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 获取婴儿床位信息
     */
    public java.lang.String alipay_Mother_Kid(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 第三方服务授权
     */
    public java.lang.String alipay_OtherServiceAuth(java.lang.String xml) throws java.rmi.RemoteException;

    /**
     * 用户身份及应用权限判断
     */
    public java.lang.String alipay_Authoration_ApplyAndUser(java.lang.String xml) throws java.rmi.RemoteException;
}
