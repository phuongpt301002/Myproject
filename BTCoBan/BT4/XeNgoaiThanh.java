package bt_java.BTCoBan.BT4;

public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDi;

    public XeNgoaiThanh(String maSoChuyen, String taiXe, String soXe, int doanhThu, String noiDen, int soNgayDi) {
        super(maSoChuyen, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Noi den" + noiDen + "\n" +
                "So ngay di" + soNgayDi;
    }
}
