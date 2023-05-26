package bt_java.BTCoBan.baitap3;

public class SinhVienIT extends SinhVienNTU{
    double diemJava, diemCss, diemHTML;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() {
        return (2*diemJava+diemHTML+diemCss)/4;
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
        System.out.println("\nĐiểm: " + getDiem());
        System.out.println("Học lực: "+ getHocLuc());
    }
}

