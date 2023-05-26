package bt_java.MTK.MauCauTruc.Coffee;

public abstract class CondimentDecorator extends Beverage{
    Beverage compoment;

    public CondimentDecorator(String description, Beverage compoment) {
        super(description);
        this.compoment = compoment;
    }

    @Override
    public String getDescription() {
        return compoment.getDescription();
    }

}

