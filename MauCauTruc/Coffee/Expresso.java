package bt_java.MTK.MauCauTruc.Coffee;

public class Expresso extends Beverage{
    public Expresso(String description) {
        super(description);
    }

    @Override
    int cost() {
        return 25000;
    }
}
