package bt_java.MTK.MauCauTruc.BieuThuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc b1 = new BieuThucDonGian(12);

        b1 = new Tru(b1, 13);
        b1 = new Cong(b1, 3);
        System.out.println(b1.giaTri());
        System.out.println(b1.bieuThuc());

    }
}
