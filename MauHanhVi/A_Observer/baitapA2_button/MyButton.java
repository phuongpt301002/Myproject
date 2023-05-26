package bt_java.MTK.MauHanhVi.A_Observer.baitapA2_button;

public class MyButton {

    OnClickListener listener;

    public void attach(OnClickListener listener){
        this.listener = listener;
    }

    public void click(){
        if(listener != null)
            listener.onClick();
    }

    public static interface OnClickListener{
        void onClick();
    }
}
