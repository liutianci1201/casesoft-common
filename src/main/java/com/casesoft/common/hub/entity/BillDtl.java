package com.casesoft.common.hub.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Deprecated
public class BillDtl implements Serializable {

	private static final Long serialVersionUID = 5901956985596784358L;

	private String id;
	private String billId;
	private String billNo;
	private String sku;
	private String styleId;
	private String colorId;
	private String sizeId;
	private String unitId;// 仓库id

	private Integer qty=0;
	private Integer actQty=0;
	private String unitName;// 仓库
	// 电商单据增加字段
	private String remark;
	private int type;
	
	private String styleName;
	private String colorName;
	private String sizeName;

	private String image;
	private Float price;
	private Float discount;
	private Float prePrice;
	private Integer initQty=0;
	private Integer scanQty=0;
	private Integer manualQty=0;//本次

	private Integer preManualQty=0;//累计
 
	private String barcode;

	
	private String destId;
	
	private String destName;
	
	private Date billDate;

	
	private String consignee;//收货人
	
	private String phoneNumber;//联系电话
	
	private String address;// 发货地址
	 
	private List<String> codeList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
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

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getActQty() {
		return actQty;
	}

	public void setActQty(Integer actQty) {
		this.actQty = actQty;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Float getPrePrice() {
		return prePrice;
	}

	public void setPrePrice(Float prePrice) {
		this.prePrice = prePrice;
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

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
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

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}
}
