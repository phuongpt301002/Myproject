package bt_java.MTK.MauKhoiTao.HoaDon;

import java.util.ArrayList;

public class HoaDonHeader {
    public static void main(String[] args) {
        ArrayList<CTHD> cthd = new ArrayList<>();
        HoaDon hd = new HoaDon.HoaDonHeader()
                .addMaHD("0001")
                .addNgayBan("20/2/2023")
                .addTenKh("Phung Thi Phuong")
                .hoaDonHeader();
        cthd.add(new CTHD("TV", "20 Cai", "5000000", "5%"));
        hd.xuatHD(cthd);

    }
}
