package bt_java.MTK.MauHanhVi.A_Observer.BTBoSung;

public class Main {
    public static void main(String[] args) {
        PlayerData p = new PlayerData(10,3,100);
        Drashboard d = new Drashboard(p);
        p.attach(d);
        p.capNhapThongTin(5,2,200);
        p.detach(d);
        d.thoat();

    }
}
