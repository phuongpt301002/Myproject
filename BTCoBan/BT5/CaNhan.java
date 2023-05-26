package bt_java.BTCoBan.BT5;

public abstract class CaNhan {
    private  String hoTen, diaChi, sDT;
    private int tuoi;

    public CaNhan(String hoTen, String diaChi, String sDT, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public abstract String HienThiTT();
}
