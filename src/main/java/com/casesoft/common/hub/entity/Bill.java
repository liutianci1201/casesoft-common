package com.casesoft.common.hub.entity;

import java.util.Date;
import java.util.List;

@Deprecated
public class Bill implements java.io.Serializable {

	private static final long serialVersionUID = -5758318718336546699L;

	private String id;
	private String ownerId;
	private String billNo;
	private Integer type;// token值
	private String billType;// 手动创建，配货单、订货单等
	private Date billDate;

	private String destUnitId;// 收货方组织ID
	private String destUnitName;//
	private String destId;
	private String destName;// 收货仓库
	private String address2;// 收货地址

	private String origId;//发货仓库
	private String origName;// 发货仓库
	private String origUnitId;// 发货方组织ID
	private String origUnitName;// 发货方
	private String address;// 发货地址

	private String deliverNo;
	private String deliverType;

	private Integer isOrderBox = 0;
	private Integer totQty;
	private Integer skuQty;
	private Integer boxQty;

	private Integer status = 0;// 对接状态0:未对接，1：验收中，2：已中止
	private String oprId;// 操作者Id（owner组织下的操作者）
	private Integer actQty;
	private Integer actSkuQty;
	private Integer actBoxQty;

	private String taskId;
	private String srcBillNo;

	private String remark;

	private String consignee;//收货人
	private String phoneNumber;//联系电话

	// 电商单据增加字段
	private String client;// 客户
	private String phone1;
	private String phone2;
	private String mobile1;
	private String mobile2;
	private String payInfo;
	private String payTime;
	private Float totPrice;
	private Float totPrePrice;
	private Float totPuPrice;
	private Integer payState;// 0:未确认1：已确认(未支付)2.已支付
	private Integer initQty=0;
	private Integer scanQty=0;
	private Integer manualQty=0;

	private Integer preManualQty=0;

	private List<BillDtl> dtlList;
	/**
	 * 物流信息
	 * */
	private String logistical;//物流名称
	private String trackNo;//物流单号

	private List<Record> records;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getDestUnitId() {
		return destUnitId;
	}

	public void setDestUnitId(String destUnitId) {
		this.destUnitId = destUnitId;
	}

	public String getDestUnitName() {
		return destUnitName;
	}

	public void setDestUnitName(String destUnitName) {
		this.destUnitName = destUnitName;
	}

	public String getDestId() {
		return destId;
	}

	public void setDestId(String destId) {
		this.destId = destId;
	}

	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getOrigId() {
		return origId;
	}

	public void setOrigId(String origId) {
		this.origId = origId;
	}

	public String getOrigName() {
		return origName;
	}

	public void setOrigName(String origName) {
		this.origName = origName;
	}

	public String getOrigUnitId() {
		return origUnitId;
	}

	public void setOrigUnitId(String origUnitId) {
		this.origUnitId = origUnitId;
	}

	public String getOrigUnitName() {
		return origUnitName;
	}

	public void setOrigUnitName(String origUnitName) {
		this.origUnitName = origUnitName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDeliverNo() {
		return deliverNo;
	}

	public void setDeliverNo(String deliverNo) {
		this.deliverNo = deliverNo;
	}

	public String getDeliverType() {
		return deliverType;
	}

	public void setDeliverType(String deliverType) {
		this.deliverType = deliverType;
	}

	public Integer getIsOrderBox() {
		return isOrderBox;
	}

	public void setIsOrderBox(Integer isOrderBox) {
		this.isOrderBox = isOrderBox;
	}

	public Integer getTotQty() {
		return totQty;
	}

	public void setTotQty(Integer totQty) {
		this.totQty = totQty;
	}

	public Integer getSkuQty() {
		return skuQty;
	}

	public void setSkuQty(Integer skuQty) {
		this.skuQty = skuQty;
	}

	public Integer getBoxQty() {
		return boxQty;
	}

	public void setBoxQty(Integer boxQty) {
		this.boxQty = boxQty;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getOprId() {
		return oprId;
	}

	public void setOprId(String oprId) {
		this.oprId = oprId;
	}

	public Integer getActQty() {
		return actQty;
	}

	public void setActQty(Integer actQty) {
		this.actQty = actQty;
	}

	public Integer getActSkuQty() {
		return actSkuQty;
	}

	public void setActSkuQty(Integer actSkuQty) {
		this.actSkuQty = actSkuQty;
	}

	public Integer getActBoxQty() {
		return actBoxQty;
	}

	public void setActBoxQty(Integer actBoxQty) {
		this.actBoxQty = actBoxQty;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getSrcBillNo() {
		return srcBillNo;
	}

	public void setSrcBillNo(String srcBillNo) {
		this.srcBillNo = srcBillNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getMobile1() {
		return mobile1;
	}

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(String payInfo) {
		this.payInfo = payInfo;
	}

	public String getPayTime() {
		return payTime;
	}

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public Float getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(Float totPrice) {
		this.totPrice = totPrice;
	}

	public Float getTotPrePrice() {
		return totPrePrice;
	}

	public void setTotPrePrice(Float totPrePrice) {
		this.totPrePrice = totPrePrice;
	}

	public Float getTotPuPrice() {
		return totPuPrice;
	}

	public void setTotPuPrice(Float totPuPrice) {
		this.totPuPrice = totPuPrice;
	}

	public Integer getPayState() {
		return payState;
	}

	public void setPayState(Integer payState) {
		this.payState = payState;
	}

	public Integer getInitQty() {
		return initQty;
	}

	public void setInitQty(Integer initQty) {
		this.initQty = initQty;
	}

	public Integer getScanQty() {
		return scanQty;
	}

	public void setScanQty(Integer scanQty) {
		this.scanQty = scanQty;
	}

	public Integer getManualQty() {
		return manualQty;
	}

	public void setManualQty(Integer manualQty) {
		this.manualQty = manualQty;
	}

	public Integer getPreManualQty() {
		return preManualQty;
	}

	public void setPreManualQty(Integer preManualQty) {
		this.preManualQty = preManualQty;
	}

	public List<BillDtl> getDtlList() {
		return dtlList;
	}

	public void setDtlList(List<BillDtl> dtlList) {
		this.dtlList = dtlList;
	}

	public String getLogistical() {
		return logistical;
	}

	public void setLogistical(String logistical) {
		this.logistical = logistical;
	}

	public String getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}
}
