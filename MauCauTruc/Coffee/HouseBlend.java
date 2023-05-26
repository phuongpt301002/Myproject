package bt_java.MTK.MauCauTruc.Coffee;

public  class HouseBlend extends Beverage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    int cost() {
        return 20000;
    }
}
