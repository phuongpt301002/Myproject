package bt_java.duck.behavioral;

public class VitQuay  extends Duck{
    @Override
    public void display(){
        System.out.println("Tôi là vịt quay Bắc Kinh");
        performFly();
        performQuack();
        swim();
    }
}
