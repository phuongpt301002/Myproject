package bt_java.MTK.MauHanhVi.A_Observer.BtA1_StreamData;
import java.util.ArrayList;
import java.util.List;

public class Stream<T> {
    List<StreamListener<T>> listeners = new ArrayList();

    void listen (StreamListener<T> listener){
        listeners.add(listener);
    }
    public void addEvent(T t){
        for(var listener:listeners)
            listener.handle(t);
    }

    public static interface StreamListener<T>{
        void handle(T t);
    }
}