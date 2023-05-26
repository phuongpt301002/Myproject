package bt_java.MTK.MauCauTruc.BieuThuc;

public abstract class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    float giaTri() {
        return bieuThuc.giaTri();
    }

    @Override
    String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
