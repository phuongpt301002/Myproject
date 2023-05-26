package bt_java.MTK.MauCauTruc.Coffee;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage compoment) {
        super(description, compoment);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    int cost() {
        return 2000 + compoment.cost();
    }



}
