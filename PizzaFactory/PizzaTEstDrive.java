package bt_java.MTK.MauKhoiTao.PizzaFactory;

public class PizzaTEstDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("Mắm Tôm");
        System.out.println("Tôi muốn 1 " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("Mắm NTU");
        System.out.println("Tôi muốn 1 " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
