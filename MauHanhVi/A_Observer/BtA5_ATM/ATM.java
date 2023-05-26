package bt_java.MTK.MauHanhVi.A_Observer.BtA5_ATM;

public class ATM {
    //Khai báo observers
    private IATM tk_atm;
    public void attach(IATM tk_atm){
        this.tk_atm = tk_atm;
    }
    public void detach(IATM t){
        if(this.tk_atm == t)
            tk_atm = null;
    }
    private boolean kiemTraTienRut(int soTienRut){
        if(tk_atm == null)
            return false;
        else
            return true;
    }

    public void rutTien(int soTienRut){
        if(this.tk_atm != null){
            if(kiemTraTienRut(soTienRut)){
                tk_atm.nhanThongBao(soTienRut,kiemTraTienRut(soTienRut));
            }
        } else {
            System.out.println("Bạn chưa cho thẻ vào");
        }
    }

    //Khai báo giao diện
    public static interface IATM{
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienRut, boolean thanhCong);

    }
}
