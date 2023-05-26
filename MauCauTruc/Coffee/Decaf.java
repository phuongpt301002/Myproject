package bt_java.MTK.MauCauTruc.Coffee;

public class Decaf extends Beverage{
    public Decaf(String description) {
        super(description);
    }

    @Override
    int cost() {
        return 30000;
    }
}
