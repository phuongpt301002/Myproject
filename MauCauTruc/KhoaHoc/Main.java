package bt_java.MTK.MauCauTruc.KhoaHoc;

public class Main {
    public static void main(String[] args) {
        KeHoachHocTap hk1 = new MonHoc("Mẫu thiết kế", 3, 900);
        KeHoachHocTap hk2 = new MonHoc("XML", 3, 900);
        QuanLyHocPhan hk = new QuanLyHocPhan();
        hk.add(hk1);
        hk.add(hk2);
        System.out.println(hk.getHocPhi());
        System.out.println(hk.getSoTC());
        System.out.println(hk.getMonHoc());
    }
}
