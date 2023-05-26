package bt_java.MTK.MauCauTruc.Coffee;

public class Whip extends CondimentDecorator{
    public Whip(String description, Beverage compoment) {
        super(description, compoment);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    int cost() {
        return 15000 + compoment.cost();
    }
}
