package bt_java.BTCoBan.BT4;
public class BT4Main {
    public static void main(String[] args) {
        XeNoiThanh xenoi1 = new XeNoiThanh("1","Tai", "1",5000,"67890","23321");
        XeNoiThanh xenoi2 = new XeNoiThanh("2","Phat", "2",7000,"09323","23321");
        XeNoiThanh xenoi3 = new XeNoiThanh("3","Minh", "3",6000,"12343","23321");
        XeNgoaiThanh xengoai1 = new XeNgoaiThanh("4","Hoa", "4",1243,"214235",322312);
        XeNgoaiThanh xengoai2= new XeNgoaiThanh("5","Tien", "5",2352,"12421",102214123);
        XeNgoaiThanh xengoai3 = new XeNgoaiThanh("6","Vu", "6",5474,"1242323",124124);
        QuanLyChuyenXe cxm = new QuanLyChuyenXe();
        cxm.them(xenoi1);
        cxm.them(xenoi2);
        cxm.them(xenoi3);
        cxm.them(xengoai1);
        cxm.them(xengoai2);
        cxm.them(xengoai3);
        cxm.inDS();
        System.out.println("Doanh thu xe noi thanh: " + cxm.doanhThuXeNoiThanh());
        System.out.println("Doanh thu xe noi thanh: " + cxm.doanhThuXeNgoaiThanh());
        System.out.println("Tong doanh thu: " + (cxm.doanhThuXeNoiThanh() + cxm.doanhThuXeNgoaiThanh()));
    }

}
