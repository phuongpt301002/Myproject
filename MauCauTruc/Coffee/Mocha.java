package bt_java.MTK.MauCauTruc.Coffee;

public class Mocha extends CondimentDecorator{
    public Mocha(String description, Beverage compoment) {
        super(description, compoment);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    int cost() {
        return 5000 + compoment.cost();
    }
}
