package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.tang();
        System.out.println("S1, count: "+s1.getCount());
        s2.tang();
        s1.tang();
        System.out.println("S1, count: "+s1.getCount());
        System.out.println("S2, count: "+s2.getCount());
    }
}
