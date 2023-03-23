package bt_java.duck.behavioral;

public class MainDuck {
    public static void main(String[] args) {
        Duck vq = new VitQuay();
        vq.setFlyBehavior(new BayTrenLoQuay());
        vq.setQuackBehavior(new MuteQuack());
        vq.display();
    }
}
