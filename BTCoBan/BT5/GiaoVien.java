package bt_java.BTCoBan.BT5;

public class GiaoVien extends CaNhan{
    private String monHoc, toBoMon;

    public GiaoVien(String hoTen, String diaChi, String sDT, int tuoi, String monHoc, String toBoMon) {
        super(hoTen, diaChi, sDT, tuoi);
        this.monHoc = monHoc;
        this.toBoMon = toBoMon;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return "Họ và tên: " + getHoTen() + "\n" +
                "Tuổi: " + getTuoi() + "\n" +
                "Địa chỉ: " + getDiaChi() + "\n" +
                "Số điện thoại: " + getsDT() + "\n" +
                "Môn học: " + monHoc + "\n" +
                "Tổ bộ môn: " + toBoMon + "\n";
    }
}
