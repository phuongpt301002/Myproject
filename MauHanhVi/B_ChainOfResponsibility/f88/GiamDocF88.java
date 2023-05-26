package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.f88;

public class GiamDocF88 implements IXuLyKhoanVay{
    String ten;
    int hanMucVay;

    public GiamDocF88(String ten, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xuLyKhoanVay) {
        return null;
    }

    @Override
    public String xuLyVay(int tienVay) {
        if(tienVay <= hanMucVay)
            return "Giám đốc " + ten + " xử lý khoản vay";
        else
            return "Ra ngân hàng mà vay";
    }
}
