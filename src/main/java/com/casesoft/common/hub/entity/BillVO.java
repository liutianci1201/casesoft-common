package com.casesoft.common.hub.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Created by john
 * @author john
 * @since 2018-07-02
 * HUB3.0接口
 */
@Deprecated
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillVO implements java.io.Serializable {
    private String id;
    private String ownerId;
    private String billNo;
    private Integer type;// token值
    private String billType;// 手动创建，配货单、订货单等
    private Date billDate;

    private String unit2Id;// 收货方ID
    private String storage2Id;
    private String storage2Name;// 收货仓库
    private String unit2Name;

    private String storageId;
    private String storageName;// 发货仓库
    private String unitId;// 发货方ID
    private String unitName;// 发货方
    private String address;// 发货地址

    private String deliverNo;
    private String deliverType;

    private Integer isOrderBox = 0;
    private Integer totQty=0;
    private Integer skuQty=0;
    private Integer boxQty=0;

    private Integer status = 0;// 对接状态0:未对接，1：验收中，2：已中止
    private String oprId;// 操作者Id（owner组织下的操作者）
    private Integer actQty=0;
    private Integer actSkuQty=0;
    private Integer actBoxQty=0;

    private String taskId;
    private String srcBillNo;

    private String remark;

    // 电商单据增加字段
    private String client;// 客户
    private String phone1;
    private String phone2;
    private String mobile1;
    private String mobile2;
    private String payInfo;
    private String payTime;
    private Float totPrice=0.0f;
    private Float totPrePrice=0.0f;
    private Float totPuPrice=0.0f;
    private Integer payState;// 0:未确认1：已确认(未支付)2.已支付
    private Integer initQty=0;
    private Integer scanQty=0;
    private Integer manualQty=0;
    private String consignee;//收货人
    private String phoneNumber;//联系电话
    private String address2;// 收货地址
    private Integer preManualQty=0;

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

    @JSONField(format = "yyyy-MM-dd")
    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getUnit2Id() {
        return unit2Id;
    }

    public void setUnit2Id(String unit2Id) {
        this.unit2Id = unit2Id;
    }

    public String getStorage2Id() {
        return storage2Id;
    }

    public void setStorage2Id(String storage2Id) {
        this.storage2Id = storage2Id;
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

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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
}
