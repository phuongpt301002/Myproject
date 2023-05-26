package bt_java.MTK.MauCauTruc.KhoaHoc;

public class MonHoc extends KeHoachHocTap{
    String tenMH;
    int soTC;
    int hocPhi;

    public MonHoc(String tenMH, int soTC, int hocPhi) {
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public String getMonHoc() {
        return tenMH;
    }

    @Override
    public int getSoTC() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return hocPhi;
    }

    @Override
    public void add(KeHoachHocTap keHoachHocTap) {
        System.out.println("Tên môn học: " + tenMH);
        System.out.println("Số tín chỉ: "+ soTC);
        System.out.println("Học Phí: "+ hocPhi);

    }
}
