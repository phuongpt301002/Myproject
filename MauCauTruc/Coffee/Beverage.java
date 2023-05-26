package bt_java.MTK.MauCauTruc.Coffee;

public abstract class Beverage {
    String description;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract int cost();
}
