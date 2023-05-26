package bt_java.MTK.MauCauTruc.KhoaHoc;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHocPhan extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();

    @Override
    public String getMonHoc() {
        StringBuilder builder = new StringBuilder();

        for(KeHoachHocTap keHoachHocTap1 : list){
            builder.append("\n-").append(keHoachHocTap1.getMonHoc());
        }
        return builder.toString();
    }

    @Override
    public int getSoTC() {
        int soTC = 0;
        for(KeHoachHocTap keHoachHocTap : list)
            soTC += keHoachHocTap.getSoTC();
        return soTC;
    }

    @Override
    public int getHocPhi() {
        int hocPhi = 0;
        for(KeHoachHocTap keHoachHocTap : list)
            hocPhi += keHoachHocTap.getHocPhi();
        return hocPhi;
    }

    @Override
    public void add(KeHoachHocTap keHoachHocTap) {

        list.add(keHoachHocTap);
    }
}
