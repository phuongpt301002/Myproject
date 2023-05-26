package bt_java.MTK.MauKhoiTao.dataAccess;

public class SanPham {
    String MaSP, TenSP;
    int SoLuong, DonGia;

    public SanPham(String maSP, String tenSP, int soLuong, int donGia) {
        MaSP = maSP;
        TenSP = tenSP;
        SoLuong = soLuong;
        DonGia = donGia;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "MaSP='" + MaSP + '\'' +
                ", TenSP='" + TenSP + '\'' +
                ", SoLuong=" + SoLuong +
                ", DonGia=" + DonGia +
                '}';
    }
}
