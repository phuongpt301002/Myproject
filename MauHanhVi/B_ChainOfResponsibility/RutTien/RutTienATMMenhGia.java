package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.RutTien;

public class RutTienATMMenhGia implements IXuLyRutTien {
    int menhGia;
    IXuLyRutTien keTiep;

    public RutTienATMMenhGia(int menhGia) {
        this.menhGia = menhGia;
    }


    @Override
    public IXuLyRutTien menhgiaKeTiep(IXuLyRutTien xuLyRutTien) {
        keTiep = xuLyRutTien;
        return xuLyRutTien;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        if (soTo > 0) {
            System.out.println(soTo + " tờ " + menhGia);
        }
        int phanDu = soTien % menhGia;
        if (phanDu > 0) {
            keTiep.rutTien(phanDu);
        }
    }
}

