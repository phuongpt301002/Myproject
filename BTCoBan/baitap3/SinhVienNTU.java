package bt_java.BTCoBan.baitap3;

public abstract class SinhVienNTU {
    String hoTen, nganh;

    public SinhVienNTU(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    //sau khi khai bao cac phuong thuc khoi tao, getter, setter dat o cuoi cunng

    public abstract double getDiem();

    public void xuat(){

        System.out.println("Họ tên: "+ hoTen);
        System.out.printf("Ngành: "+ nganh);
    }
    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }


}
