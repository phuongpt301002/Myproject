package bt_java.BTCoBan.BT4;

public class XeNoiThanh  extends ChuyenXe{
    String soTuyen, soKM;

    public XeNoiThanh(String maSoChuyen, String taiXe, String soXe, int doanhThu, String soTuyen, String soKM) {
        super(maSoChuyen, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "So tuyen: " + soTuyen + "\n" +
                "So KM: " + soKM;
    }
}
