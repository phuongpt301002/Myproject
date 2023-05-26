package bt_java.MTK.MauCauTruc.BieuThuc;

public  class BieuThucDonGian extends BieuThuc{
    float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    float giaTri() {
        return toanHang;
    }

    @Override
    String bieuThuc() {
        return "Biểu thức: " + toanHang;
    }
}
