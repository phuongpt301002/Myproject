package bt_java.MTK.MauHanhVi.A_Observer.BtA1_StreamData;

public class Monhoc {
    String maMH, tenMH;
    int soTC;

    public Monhoc(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    @Override
    public String toString() {
        return "Mã MH: " + maMH + "\n" +
                "Tên MH: " + tenMH + "\n" +
                "Số TC: " + soTC;
    }
}
