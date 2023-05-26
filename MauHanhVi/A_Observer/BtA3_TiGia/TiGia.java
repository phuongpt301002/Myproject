package bt_java.MTK.MauHanhVi.A_Observer.BtA3_TiGia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<I_TheoDoiTiGia> observers = new ArrayList();

    public void attach(I_TheoDoiTiGia o){
        if(!observers.contains(o))
            observers.add(o);

    }

    public void detach(I_TheoDoiTiGia o){
        if(observers.contains(o))
            observers.remove(o);
    }

    public void notifyTiGia (float delta){
        for(var obs: observers)
            obs.capNhapTiGia(delta);

    }
    static public interface I_TheoDoiTiGia{

        void capNhapTiGia(float delta);
    }
}
