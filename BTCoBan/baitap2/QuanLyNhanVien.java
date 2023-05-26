package bt_java.BTCoBan.baitap2;

public class QuanLyNhanVien implements IQuanLy {
    private NhanVien[] dsNhanVien;
    private int soLuong;

    public QuanLyNhanVien() {
        dsNhanVien = new NhanVien[100];
        soLuong = 0;
    }

    @Override
    public void them(NhanVien nv) {
        dsNhanVien[soLuong] = nv;
        soLuong++;
    }

    @Override
    public void inDS() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(dsNhanVien[i].getThongTin() + ", Thưởng: " + dsNhanVien[i].tinhThuong());
        }
    }
}