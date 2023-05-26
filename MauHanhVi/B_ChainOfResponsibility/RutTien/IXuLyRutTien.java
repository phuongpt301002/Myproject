package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.RutTien;

public interface IXuLyRutTien {
    IXuLyRutTien menhgiaKeTiep(IXuLyRutTien xuLyRutTien);

    void rutTien(int soTien);
}
