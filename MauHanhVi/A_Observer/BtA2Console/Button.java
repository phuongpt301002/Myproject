package bt_java.MTK.MauHanhVi.A_Observer.BtA2Console;

public class Button {
    private I_Button button;
    private int count = 0;

    //Nút nhấn
    public void attach(I_Button button){
        this.button = button;
    }
    //Sự kiện Click
    public void detach (){
        count++;
        if(button != null){
            button.onClick();
        }
    }
    public int getCount(){
        return count;
    }
}
