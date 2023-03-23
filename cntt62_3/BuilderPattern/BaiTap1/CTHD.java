package creational.factory.cntt62_3.BuilderPattern.BaiTap1;

public class CTHD {
    String SanPham, SoLuong, DonGia, ChietKhau;
    public CTHD (String SanPham, String SoLuong, String DonGia, String ChietKhau){
        this.SanPham = SanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }
    public String display(){
        return "San Pham: " + SanPham + "\n"
                + "So Luong: " + SoLuong + "\n"
                + "Don Gia: " + DonGia + "\n"
                + "Chiet Khau: " + ChietKhau + "\n";
    }
}
