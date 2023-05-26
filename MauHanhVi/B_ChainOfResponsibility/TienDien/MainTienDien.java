package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.TienDien;

public class MainTienDien {
    public static void main(String[] args) {
        IXuLyTienDien bac1 = new TienDien(0,50,1678);
        IXuLyTienDien bac2 = new TienDien(50,100,1734);
        IXuLyTienDien bac3 = new TienDien(100,200,2014);
        IXuLyTienDien bac4 = new TienDien(200,300,2536);
        IXuLyTienDien bac5 = new TienDien(300,400,2834);
        IXuLyTienDien bac6 = new TienDien(400,Integer.MAX_VALUE,2927);
        IXuLyTienDien sinhhoat = new TienDien(Integer.MIN_VALUE,Integer.MAX_VALUE,2461);
        bac1.bacTiepTheo(bac2)
                .bacTiepTheo(bac3)
                .bacTiepTheo(bac4)
                .bacTiepTheo(bac5)
                .bacTiepTheo(bac6);
        System.out.println(bac1.tienDien(100));

    }
}
