package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.f88;

public class NhanVienF88 implements IXuLyKhoanVay{

    IXuLyKhoanVay capcaohon;
    String ten, chucVu;
    int hanMucVay;

    public NhanVienF88(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xuLyKhoanVay) {
        capcaohon = xuLyKhoanVay;
        return xuLyKhoanVay;
    }

    @Override
    public String xuLyVay(int tienVay) {
        if(tienVay <= hanMucVay)
            return chucVu + " " + ten + " xử lý khoản vay" ;
        else
            return capcaohon.xuLyVay(tienVay);
    }
}
