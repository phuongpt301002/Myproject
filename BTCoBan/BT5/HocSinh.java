package bt_java.BTCoBan.BT5;

public class HocSinh extends CaNhan{
    private String lop, nangKhieu;

    public HocSinh(String hoTen, String diaChi, String sDT, int tuoi, String lop, String nangKhieu) {
        super(hoTen, diaChi, sDT, tuoi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        return "Họ và tên: " + getHoTen() + "\n" +
                "Tuổi: " + getTuoi() + "\n" +
                "Địa chỉ: " + getDiaChi() + "\n" +
                "Số điện thoại: " + getsDT() + "\n" +
                "Lớp: " + lop + "\n" +
                "Năng khiếu: " + nangKhieu + "\n";
    }
}
