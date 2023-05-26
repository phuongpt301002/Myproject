package bt_java.MTK.MauHanhVi.A_Observer.Topic;

import java.util.ArrayList;
import java.util.List;

public class Topic_1 {
    I_ThanhVien iThanhVien;
    List<I_ThanhVien> listThanhVien = new ArrayList<>();
    List<TinTuc> listTin = new ArrayList<>();

    public void attach(I_ThanhVien thanhVien){
       if(!listThanhVien.contains(iThanhVien)){ // thành viên ko có ds thì thêm vào
           listThanhVien.add(iThanhVien);
       }
    }

    public void detach(I_ThanhVien nt){
        if(listThanhVien.contains(iThanhVien)) //thành viên đã có trong ds rồi thì ko thêm đc nữa
            listThanhVien.remove(iThanhVien);
    }

    public void taoMoi(TinTuc t){
        for(I_ThanhVien thanhVien : listThanhVien){
            thanhVien.capNhap(t);
        }
    }

    public void capNhap(TinTuc t){

    }

    public static interface I_ThanhVien{
        void capNhap(TinTuc t);
    }
}
