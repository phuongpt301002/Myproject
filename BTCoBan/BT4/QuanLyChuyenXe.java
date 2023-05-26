package bt_java.BTCoBan.BT4;

import java.util.ArrayList;
import java.util.List;
public class QuanLyChuyenXe {
    List<ChuyenXe> ds = new ArrayList<>();

    public void them(ChuyenXe c){
        for(ChuyenXe cx:ds)
            if(cx.maSoChuyen == c.maSoChuyen)
                return;
        ds.add(c);
    }

    public int doanhThuXeNgoaiThanh() {
        int tong = 0;
        for(ChuyenXe c:ds)
            if(c instanceof XeNgoaiThanh)
                tong += c.doanhThu;
        return tong;
    }

    public int doanhThuXeNoiThanh() {
        int tong = 0;
        for(ChuyenXe c:ds)
            if(c instanceof XeNoiThanh)
                tong += c.doanhThu;
        return tong;
    }

    public int TongDoanhThu() {
        int tong = doanhThuXeNgoaiThanh() + doanhThuXeNoiThanh();
        return tong;
    }

    public void inDS() {
        for(ChuyenXe c:ds){
            System.out.println(c.toString());
        }
    }

}
