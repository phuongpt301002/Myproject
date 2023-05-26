package bt_java.MTK.MauCauTruc.Coffee;

public class Soy extends CondimentDecorator{
    public Soy(String description, Beverage compoment) {
        super(description, compoment);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    int cost() {
        return 10000 + compoment.cost();
    }
}
