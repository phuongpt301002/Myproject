package bt_java.MTK.MauHanhVi.A_Observer.BtA5_ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan phuong = new TaiKhoan(atm, 100000000,"Phượng");
        System.out.println("-----Thực hiện giao dịch-----");
        phuong.duaTheVaoATM();
        atm.rutTien(200000);
        phuong.rutTheKhoiATM();



    }

}
