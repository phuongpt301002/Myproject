package bt_java.MTK.MauCauTruc.Coffee;

public class DarkRoast extends Beverage{

    public DarkRoast(String description) {
        super(description);
    }

    @Override
    int cost() {
        return 15000;
    }
}
