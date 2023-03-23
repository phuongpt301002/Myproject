package creational.factory.cntt62_3.BuilderPattern.Bai6;

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
