package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.RutTien;

public class MainRutTien {
    public static void main(String[] args) {
        IXuLyRutTien  mg500 = new  RutTienATMMenhGia(500);
        IXuLyRutTien  mg100 = new  RutTienATMMenhGia(100);
        IXuLyRutTien  mg50 = new  RutTienATMMenhGia(50);
        IXuLyRutTien  mg10 = new  RutTienATMMenhGia(10);
        IXuLyRutTien  mg1 = new  RutTienATMMenhGia(1);
        mg500.menhgiaKeTiep(mg100)
                .menhgiaKeTiep(mg50)
                .menhgiaKeTiep(mg10)
                .menhgiaKeTiep(mg1);

//        System.out.println(mg100.rutTien(293));
    }
}
