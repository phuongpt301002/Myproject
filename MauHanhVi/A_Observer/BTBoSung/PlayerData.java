package bt_java.MTK.MauHanhVi.A_Observer.BTBoSung;

public class PlayerData{
    private IDrashboard db;
    int thoiGian, countdown;
    float grade;

    public PlayerData(int thoiGian, int countdown, float grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
    }
    public void attach(IDrashboard db){
        this.db = db;
    }

    public void detach(IDrashboard d){
        if(this.db == d)
            db = null;
    }

    public void capNhapThongTin (int thoiGian, int countdown, float grade){

        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;

        db.capNhap(thoiGian,countdown,grade);
    }

    public static interface IDrashboard{
        void capNhap(int thoiGian, int countdown, float grade);
    }
}
