package bt_java.MTK.MauHanhVi.A_Observer.BtA1_StreamData;

import java.util.ArrayList;
import java.util.List;


public class DataAccess {
    List<Monhoc> list = new ArrayList();
    Stream<List<Monhoc>> stream;

    public DataAccess(Stream<List<Monhoc>> stream) {
        this.stream = stream;
    }

    public void add(Monhoc mh){
        list.add(mh);
        stream.addEvent(list);
    }
    public void remove(String maMH){
        for(var monHoc : list){
            if(maMH == monHoc.maMH)
                list.remove(monHoc);
        }
        stream.addEvent(list);
    }
    void update(String maMH, String tenMH, int soTC){
        for(var monHoc : list){
            if(maMH == monHoc.maMH){
                monHoc.maMH = maMH;
                monHoc.tenMH = tenMH;
                monHoc.soTC = soTC;
            }
        }
        stream.addEvent(list);
    }

}
