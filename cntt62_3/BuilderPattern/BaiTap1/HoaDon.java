package creational.factory.cntt62_3.BuilderPattern.BaiTap1;
import java.util.ArrayList;
public class HoaDon {
    String MaHD, NgayBan, TenKH;
    ArrayList<CTHD> cthd;

    public static class HoaDonHeader{
        String MaHD, NgayBan, TenKH;

        public HoaDonHeader(){
        }
        public HoaDonHeader addMaHD (String MaHD){
            this.MaHD = MaHD;
            return this;
        }
        public HoaDonHeader addNgayBan (String NgayBan){
            this.NgayBan = NgayBan;
            return this;
        }
        public HoaDonHeader addTenKh (String TenKH){
            this.TenKH = TenKH;
            return this;
        }
        public HoaDon hoaDonHeader(){
            return new HoaDon(this);
        }
    }

    public HoaDon(HoaDonHeader hoaDonHeader) {
        this.MaHD = hoaDonHeader.MaHD;
        this.NgayBan = hoaDonHeader.NgayBan;;
        this.TenKH = hoaDonHeader.TenKH;
    }
    public void xuatHD (ArrayList<CTHD> cthd) {
        System.out.println("Thong tin hoa don:  \n"
                        + "+ MaHD: " + MaHD + "\n"
                        + "+ Ngay Ban: " + NgayBan + "\n"
                        + "+ TenKH: " + TenKH + "\n"
                        + "\n");
        System.out.println("Chi tiet hoa don: ");
        for (int i = 0; i < cthd.size(); i++)
            System.out.println(cthd.get(i).display());
    }

}
