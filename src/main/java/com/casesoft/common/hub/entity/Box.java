package com.casesoft.common.hub.entity;

import java.util.Date;
import java.util.List;

@Deprecated
public class Box implements java.io.Serializable {

	private static final long serialVersionUID = -3800986314768352699L;

	private String id;
	private String cartonId;
	private String taskId;
	private Integer seqNo;
	private String ownerId;
	private Integer token;
	private String deviceId;
	private Integer totEpc;
	private Integer totSku;
	private Integer totStyle;
	private Date scanTime;

	private String floorId;
	private String srcTaskId;
	private List<BoxDtl> boxDtls;
	private String tokenName;
	private String unitName;
	private Float weight;
	private Integer type;// 0:出库1：入库3：盘点
	private Integer cartonTotEpc;

	private Integer cartonTotSku;

	private Integer cartonTotStyle;

	private String cartonScanTime;

	private String taskDeviceId;

	private List<BoxDtl>skuItemList;
	private List<Record> recordList;

	public List<Record> getRecordList() {
		return recordList;
	}

	public void setRecordList(List<Record> recordList) {
		this.recordList = recordList;
	}

	/** default constructor */
	public Box() {
	}

	public Box(String cartonId, String taskId, String ownerId) {
		super();
		this.cartonId = cartonId;
		this.taskId = taskId;
		this.ownerId = ownerId;
	}

	/** full constructor */
	public Box(String cartonId, String taskId, Integer seqNo, String ownerId,
			Integer token, String deviceId, Integer totEpc, Integer totSku,
			Integer totStyle) {
		this.cartonId = cartonId;
		this.taskId = taskId;
		this.seqNo = seqNo;
		this.ownerId = ownerId;
		this.token = token;
		this.deviceId = deviceId;
		this.totEpc = totEpc;
		this.totSku = totSku;
		this.totStyle = totStyle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCartonId() {
		return cartonId;
	}

	public void setCartonId(String cartonId) {
		this.cartonId = cartonId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Integer getTotEpc() {
		return totEpc;
	}

	public void setTotEpc(Integer totEpc) {
		this.totEpc = totEpc;
	}

	public Integer getTotSku() {
		return totSku;
	}

	public void setTotSku(Integer totSku) {
		this.totSku = totSku;
	}

	public Integer getTotStyle() {
		return totStyle;
	}

	public void setTotStyle(Integer totStyle) {
		this.totStyle = totStyle;
	}

	public Date getScanTime() {
		return scanTime;
	}

	public void setScanTime(Date scanTime) {
		this.scanTime = scanTime;
	}

	public String getFloorId() {
		return floorId;
	}

	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public String getSrcTaskId() {
		return srcTaskId;
	}

	public void setSrcTaskId(String srcTaskId) {
		this.srcTaskId = srcTaskId;
	}

	public List<BoxDtl> getBoxDtls() {
		return boxDtls;
	}

	public void setBoxDtls(List<BoxDtl> boxDtls) {
		this.boxDtls = boxDtls;
	}

	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getCartonTotEpc() {
		return cartonTotEpc;
	}

	public void setCartonTotEpc(Integer cartonTotEpc) {
		this.cartonTotEpc = cartonTotEpc;
	}

	public Integer getCartonTotSku() {
		return cartonTotSku;
	}

	public void setCartonTotSku(Integer cartonTotSku) {
		this.cartonTotSku = cartonTotSku;
	}

	public Integer getCartonTotStyle() {
		return cartonTotStyle;
	}

	public void setCartonTotStyle(Integer cartonTotStyle) {
		this.cartonTotStyle = cartonTotStyle;
	}

	public String getCartonScanTime() {
		return cartonScanTime;
	}

	public void setCartonScanTime(String cartonScanTime) {
		this.cartonScanTime = cartonScanTime;
	}

	public String getTaskDeviceId() {
		return taskDeviceId;
	}

	public void setTaskDeviceId(String taskDeviceId) {
		this.taskDeviceId = taskDeviceId;
	}

	public List<BoxDtl> getSkuItemList() {
		return skuItemList;
	}

	public void setSkuItemList(List<BoxDtl> skuItemList) {
		this.skuItemList = skuItemList;
	}
}