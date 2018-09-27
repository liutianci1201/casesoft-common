package com.casesoft.common.hub.util;

public class Constant {

    public class TaskType {
        public final static int Inbound = 1;
        public final static int Outbound = 0;
        public final static int Inventory = 3;
        public final static int Else = -1;
    }

    public final static class Folder {
        public final static String Epc_Init_File_Folder = "\\initFile\\";
        public final static String Epc_Init_Zip_File_Folder = "\\initFileZip\\";
        public final static String Report_File_Folder = "\\report\\";
        public final static String Product_File_Folder = "\\productZip\\";
    }

    public final static class TagSerial {
        public final static int EPC_Prefix_Length = 6;
        public final static String Xinshuang = "00";
        public final static String Burton = "01";
        public final static String Aoyang = "02";
        public final static String Jinjiang = "03";
        public final static String Auchan = "04";
        public final static String HodoMan = "05";
        public final static String SpecialCloud = "06";
        public final static String Hanuman = "07";
        public final static String Tiantan = "08";
        public final static String Playlounge = "09";
        public final static String MetersBonWe = "10";
        public final static String NewBroadcast = "11";
        public final static String Exhibition = "12";
        public final static String Leverstyle = "13";
        public final static String Kingthy = "14";
        public final static String ELand = "15";
        public final static String Ellassay = "17";
        public final static String neoen = "18";
        public final static String Ivykki = "19";
        public final static String Glm = "20";
        public final static String Heyi = "21";
        public final static String YangBaoBao = "22";
        public final static String MaSiFeiEr = "23";
        public final static String AncientStone = "24";
        public final static String LiHuaHall = "25";
        public final static String ERDOS = "26";
        public final static String Lanbao = "27";
        public final static String EIFINI = "28";
        public final static String LIFEIDEA = "29";
        public final static String POLO_SPORTS = "30";
        public final static String SENMEI = "31";
        public final static String HUANYAN = "32";
        public final static String OUBO = "33";
        public final static String YUNCHUANG = "34";
        public final static String MIGAO = "36";
        public final static String SHUNZA = "37";

    }


    public static final class UnitType {
        public static final int Vender = 0;//供应商
        public static final int Headquarters = 1;//总部
        public static final int Agent = 2;//代理商，经销商，分销商
        public static final int Factory = 3;//加工厂
        public static final int Shop = 4;//门店

        public static final int NetShop = 5;//网店

        public static final int SampleRoom = 6;//样衣间
        public static final int Department = 7;//部门

        public static final int Warehouse = 9;//
    }


    public static final class Token {
        public final static int Label_Data_Birth = 1;
        public final static int Label_Data_Write = 2;//标签初始化
        public final static int Label_Data_Detect = 3;
        public final static int Label_Data_Receive = 4;//品牌商标签接收
        public final static int Label_Data_Send = 5;//品牌商将标签发放给供应商
        public final static int Label_Data_Feedback = 6;//供应商接收到标签

        public final static int Factory_Box_Send = 7;//加工厂装箱发货
        public final static int Factory_Paper = 51;//加工厂纸样
        public final static int Factory_Cut = 52;//加工厂裁剪
        public final static int Factory_SubConstant = 53;//加工厂分包
        public final static int Factory_Stitch = 54;//加工厂缝纫
        public final static int Factory_OutSource = 55;//加工厂外包出
        public final static int Factory_InBound = 56;//加工厂外包入
        public final static int Factory_StitchChecked = 57;//加工厂缝纫后质检   
        public final static int Factory_Wash = 58;//加工厂水洗
        public final static int Factory_WashChecked = 59;//加工厂水洗后质检
        public final static int Factory_CheckBack = 60;//加工厂质检返工
        public final static int Factory_Pack = 61;//加工厂包装
        public final static int Factory_Out = 62;//加工厂发货
        public final static int Factory_dye = 63;//加工厂染色

        public final static int Storage_Inbound = 8;//采购入库
        public final static int Storage_Refund_Outbound = 26;//退货给供应商（采购退货）
        public final static int Storage_Inventory = 9;
        public final static int Storage_Outbound = 10;//仓库发给门店
        public final static int Storage_Refund_Inbound = 23;//门店退给总部
        public final static int Storage_Transfer_Outbound = 24;
        public final static int Storage_Transfer_Inbound = 25;
        public final static int Storage_Adjust_Outbound = 28;
        public final static int Storage_Adjust_Inbound = 29;

        public final static int Storage_Outbound_agent = 37;//仓库给代理商发货
        public final static int Storage_Inbound_agent_refund = 38;//代理商退仓

        public final static int Storage_Other_Outbound = 32;

        public final static int Storage_UniqueCode_Refund_In = 39;
        public final static int Storage_UniqueCode_Transfer_In = 40;

        public final static int Shop_Inbound = 14;//门店入库
        public final static int Shop_Sales = 15;
        public final static int Shop_Inventory = 16;
        public final static int Shop_Transfer_Outbound = 18;
        public final static int Shop_Transfer_Inbound = 19;
        public final static int Shop_Sales_refund = 17;
        public final static int Shop_Refund_Outbound = 27;
        public final static int Shop_Adjust_Outbound = 30;
        public final static int Shop_Adjust_Inbound = 31;

        public final static int Shop_Other_Outbound = 33;
        public final static int Shop_TransferSale_Outbound = 50;
        public final static int Storage_Merger_Outbound = 51;//仓库合并出库单
    }

    public final static class Bill {
        public final static String Inbound_Prefix = "WIB";
        public final static String Outbound_Prefix = "WOB";

        public final static String Refund_Inbound_Prefix = "RIB";
        public final static String Refund_Outbound_Prefix = "ROB";

        public final static String Transfer_Inbound_Prefix = "TIB";
        public final static String Transfer_Outbound_Prefix = "TOB";

        public final static String Tag_Init_Prefix = "TIB";// 标签初始化任务号前缀

        public final static String EPayBill_Prefix = "EPB";// 电商销售单(消费者O2O电商支付单)前缀
    }


    public final static class Sys {

        public final static String Company_Name = "凯施智联软件科技";

        public final static int Menu_Code_Min_Length = 2;

        public final static String User_Menu_Session = "menuSession";

        public static final String Role_Id_String = "roleId";

        public static final String All_Authorize = "所有权限";

        public static final int Parent_Menu_Length = 6;

        public static final String Menu_Component_Separator = "_";

        public static final String Menu_Id_String = "menuId";

        public static final String Storage_Code_Prefix = "S";

        public static final String Device_KC_Prefix = "KC";
    }
}
