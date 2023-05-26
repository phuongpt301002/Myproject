package bt_java.MTK.MauHanhVi.A_Observer.BtA2Console;

public class Activity implements I_Button{
    private Button button;

    public Activity(Button button) {
        this.button = button;
        this.button.attach(this);
    }

    @Override
    public void onClick() {
        System.out.println("Bạn click lần thứ " + button.getCount());
    }
}
