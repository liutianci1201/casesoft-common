package com.casesoft.common.hub.entity;



import java.util.List;

@Deprecated
 public class BoxDtl implements java.io.Serializable {

	private static final long serialVersionUID = 1369118938344073964L;
	private String id;
	private String cartonId;
	private String taskId;
	private String ownerId;
	private String deviceId;

	private Integer token;
	private String sku;
	private Integer qty;
	private String styleId;
	private String colorId;
	private String sizeId;
	private String srcTaskId;
	private String styleName;
	private String colorName;
	private String sizeName;
	private Integer type;// 0:出库1：入库3：盘点
	private String storage2Name;
	private String unit2Name;
	public BoxDtl() {
	}
	private String code;
	private String cartonScanTime;
	protected List<String> codeList;
 	protected List<String> epcList;
	private Integer skuCount;
	private Integer preQty;

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

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Integer getToken() {
		return token;
	}

	public void setToken(Integer token) {
		this.token = token;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}

	public String getColorId() {
		return colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
	}

	public String getSizeId() {
		return sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	public String getSrcTaskId() {
		return srcTaskId;
	}

	public void setSrcTaskId(String srcTaskId) {
		this.srcTaskId = srcTaskId;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getSizeName() {
		return sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getStorage2Name() {
		return storage2Name;
	}

	public void setStorage2Name(String storage2Name) {
		this.storage2Name = storage2Name;
	}

	public String getUnit2Name() {
		return unit2Name;
	}

	public void setUnit2Name(String unit2Name) {
		this.unit2Name = unit2Name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCartonScanTime() {
		return cartonScanTime;
	}

	public void setCartonScanTime(String cartonScanTime) {
		this.cartonScanTime = cartonScanTime;
	}

	public List<String> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

	public List<String> getEpcList() {
		return epcList;
	}

	public void setEpcList(List<String> epcList) {
		this.epcList = epcList;
	}

	public Integer getSkuCount() {
		return skuCount;
	}

	public void setSkuCount(Integer skuCount) {
		this.skuCount = skuCount;
	}

	public Integer getPreQty() {
		return preQty;
	}

	public void setPreQty(Integer preQty) {
		this.preQty = preQty;
	}
}