package bt_java.MTK.MauKhoiTao.PizzaFactory;
import java.util.ArrayList;
abstract public class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Chuẩn bị " + name);
    }

    public void bake() {
        System.out.println("Nướng " + name);
    }

    public void cut() {
        System.out.println("Cắt " + name);
    }

    public void box() {
        System.out.println("Bỏ dô hộp " + name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
