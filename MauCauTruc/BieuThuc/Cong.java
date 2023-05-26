package bt_java.MTK.MauCauTruc.BieuThuc;

public class Cong extends BieuThucDecorator {
    float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return Math.abs(super.giaTri() + toanHang);
    }

    @Override
    String bieuThuc() {
        return "(" + super.bieuThuc() + ") + " + toanHang;
    }
}
