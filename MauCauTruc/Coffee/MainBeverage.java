package bt_java.MTK.MauCauTruc.Coffee;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new DarkRoast("Cà phê") ;
        b = new Milk(" Sữa tươi",b);

        System.out.println(b.cost());
        System.out.println(b.getDescription());
    }
}
