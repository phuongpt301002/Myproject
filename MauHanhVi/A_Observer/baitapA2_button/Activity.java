package bt_java.MTK.MauHanhVi.A_Observer.baitapA2_button;

public class Activity implements MyButton.OnClickListener {
    MyButton button;
    int count = 0;

    public Activity(MyButton button) {
        this.button = button;
        this.button.attach(this);
    }

    @Override
    public void onClick() {
        count++;
        System.out.println("Bạn click lần thứ " + count + " lần ");
    }
}
