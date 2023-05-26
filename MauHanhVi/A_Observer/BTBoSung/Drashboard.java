package bt_java.MTK.MauHanhVi.A_Observer.BTBoSung;

public class Drashboard implements PlayerData.IDrashboard {
    PlayerData playerData;

    public Drashboard(PlayerData playerData){
        this.playerData = playerData;
        playerData.attach(this);
    }

    public void thoat(){
        playerData.detach(this);
    }

    @Override
    public void capNhap(int thoiGian, int countdown, float grade) {
        System.out.println("Thời gian còn lại:" + thoiGian);
        System.out.println("Lượt chơi còn lại: " + countdown);
        System.out.println("Điểm: "+ grade);
    }
}
