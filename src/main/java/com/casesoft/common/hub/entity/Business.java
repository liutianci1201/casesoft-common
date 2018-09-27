package com.casesoft.common.hub.entity;

import java.util.Date;
import java.util.List;

 @Deprecated
public class Business implements java.io.Serializable {

	private static final Long serialVersionUID = 6072395948739316396L;
	private String id;//出库任务编号
	private Integer status;//对接状态
	private String deviceId;//设备号
	private String ownerId;
	private Integer token;//出库方式
	private Date beginTime;//开始时间
	private Date endTime;//结束时间
	private Integer totEpc;//总数量
	private Integer totStyle;//款数
	private Integer totSku;//SKU数
	private Integer totCarton;//箱数


	private String billId;

	private String billNo;//ERP单号
	private String srcTaskId;

	private String srcBillNo;
	private String operator;
	private Integer locked;
	private List<BusinessDtl> dtlList;
	private List<Box> boxList;

  	private List<Record> recordList;
	private Integer totTime;//扫描时长
	private String origId;//出库仓库
	private String origName;
	private String origUnitId;//出库组织
	private String deviceName;//设备名
	private String origUnitName;
 	private Float totPreCase;
 	private Bill bill;
	private String destId;//接收仓库
	private String destUnitId; //接收方组织
	private Integer type;// 0:出库1：入库3：盘点
	private String destName;
	private String destUnitName;
	private Integer totBillQty;
	private String way;//单据模式B 任务模式T 唯一码单据模式U
 
	public String remark;
 
	private Float totPrice;
 	private Float totPuPrice;
 	private String taskType;

 	private String filePath;

	 public String getFilePath() {
		 return filePath;
	 }

	 public void setFilePath(String filePath) {
		 this.filePath = filePath;
	 }

	 public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Integer getToken() {
		return token;
	}

	public void setToken(Integer token) {
		this.token = token;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getTotEpc() {
		return totEpc;
	}

	public void setTotEpc(Integer totEpc) {
		this.totEpc = totEpc;
	}

	public Integer getTotStyle() {
		return totStyle;
	}

	public void setTotStyle(Integer totStyle) {
		this.totStyle = totStyle;
	}

	public Integer getTotSku() {
		return totSku;
	}

	public void setTotSku(Integer totSku) {
		this.totSku = totSku;
	}

	public Integer getTotCarton() {
		return totCarton;
	}

	public void setTotCarton(Integer totCarton) {
		this.totCarton = totCarton;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getSrcTaskId() {
		return srcTaskId;
	}

	public void setSrcTaskId(String srcTaskId) {
		this.srcTaskId = srcTaskId;
	}

	public String getSrcBillNo() {
		return srcBillNo;
	}

	public void setSrcBillNo(String srcBillNo) {
		this.srcBillNo = srcBillNo;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public List<BusinessDtl> getDtlList() {
		return dtlList;
	}

	public void setDtlList(List<BusinessDtl> dtlList) {
		this.dtlList = dtlList;
	}

	public List<Box> getBoxList() {
		return boxList;
	}

	public void setBoxList(List<Box> boxList) {
		this.boxList = boxList;
	}

	public List<Record> getRecordList() {
		return recordList;
	}

	public void setRecordList(List<Record> recordList) {
		this.recordList = recordList;
	}

	public Integer getTotTime() {
		return totTime;
	}

	public void setTotTime(Integer totTime) {
		this.totTime = totTime;
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

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getOrigUnitName() {
		return origUnitName;
	}

	public void setOrigUnitName(String origUnitName) {
		this.origUnitName = origUnitName;
	}

	public Float getTotPreCase() {
		return totPreCase;
	}

	public void setTotPreCase(Float totPreCase) {
		this.totPreCase = totPreCase;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public String getDestId() {
		return destId;
	}

	public void setDestId(String destId) {
		this.destId = destId;
	}

	public String getDestUnitId() {
		return destUnitId;
	}

	public void setDestUnitId(String destUnitId) {
		this.destUnitId = destUnitId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}

	public String getDestUnitName() {
		return destUnitName;
	}

	public void setDestUnitName(String destUnitName) {
		this.destUnitName = destUnitName;
	}

	public Integer getTotBillQty() {
		return totBillQty;
	}

	public void setTotBillQty(Integer totBillQty) {
		this.totBillQty = totBillQty;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getTotPrice() {
		return totPrice;
	}

	public void setTotPrice(Float totPrice) {
		this.totPrice = totPrice;
	}

	public Float getTotPuPrice() {
		return totPuPrice;
	}

	public void setTotPuPrice(Float totPuPrice) {
		this.totPuPrice = totPuPrice;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
}