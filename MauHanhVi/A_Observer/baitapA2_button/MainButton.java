package bt_java.MTK.MauHanhVi.A_Observer.baitapA2_button;

public class MainButton {
    public static void main(String[] args) {
        MyButton button = new MyButton();
        Activity activity = new Activity(button);
        button.listener.onClick();
        button.listener.onClick();
    }
}
