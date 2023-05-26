package bt_java.MTK.MauHanhVi.A_Observer.BtA5_ATM;

public class TaiKhoan implements ATM.IATM{
    ATM atm;
    int soDu;
    String ten;

    public TaiKhoan(ATM atm, int soDu, String ten) {
        this.atm = atm;
        this.soDu = soDu;
        this.ten = ten;
    }

    public void duaTheVaoATM(){
        atm.attach(this);

    }

    public void rutTheKhoiATM(){

        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soDu > soTienRut) return true;
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if (thanhCong){
            System.out.println("Giao dịch thành công");
            System.out.println("So du ban dau:" + soDu);
            soDu -= soTienRut;
            System.out.println("so du con lai: "+ soDu);
            System.out.println("Ban da rut: "+ soTienRut + "đ");
        }
        else{
            System.out.println("giao dịch không thanh công");
            System.out.println("so tien ban dau" + soDu);
        }
    }
}
