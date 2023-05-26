package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.TienDien;

public interface IXuLyTienDien {
    IXuLyTienDien bacTiepTheo (IXuLyTienDien xuLyTienDien);
    float tienDien(int kWh);
}
