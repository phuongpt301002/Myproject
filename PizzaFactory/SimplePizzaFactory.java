package bt_java.MTK.MauKhoiTao.PizzaFactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Mắm Tôm")) {
            pizza = new CheesePizza();
        } else if (type.equals("Mắm Ruốc")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("Mắm Nêm")) {
            pizza = new ClamPizza();
        } else if (type.equals("Mắm NTU")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
