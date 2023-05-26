package bt_java.BTCoBan.baitap3;

public class SinhVienBiz extends SinhVienNTU {
    double diemMarketing, diemSale;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSale)/3;
    }
    public String getHocLuc(){
        double diem=getDiem();
        if(diem<5)
            return  "Yếu";
        if(diem<6.5)
            return "Trung Bình";
        if(diem<7.5)
            return "Khá";
        if(diem<9)
            return  "Giỏi";
        return "Xuất Xắc";

    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("\nĐiểm:" + getDiem());
        System.out.println("Học lực: "+ getHocLuc());
    }
}
