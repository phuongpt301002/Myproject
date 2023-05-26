package bt_java.MTK.MauCauTruc.BieuThuc;

public  class Nhan extends BieuThucDecorator {
    int toanHang;

    public Nhan(BieuThuc bieuThuc, int toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return Math.abs(super.giaTri() * toanHang);
    }

    @Override
    String bieuThuc() {
        return "(" + super.bieuThuc() + ") *" + toanHang;
    }
}