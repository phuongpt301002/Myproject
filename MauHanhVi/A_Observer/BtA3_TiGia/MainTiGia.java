package bt_java.MTK.MauHanhVi.A_Observer.BtA3_TiGia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        System.out.println("Lần 1: ");
        t.notifyTiGia(5);
        a.huyDangKy();
        System.out.println("Lần 2: ");
        t.notifyTiGia(-5);
    }
}
