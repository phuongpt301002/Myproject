package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.f88;

public class MainF88 {
    public static void main(String[] args) {
        IXuLyKhoanVay gaccong = new NhanVienF88("Tuyển","Gác cổng",1000000);
        IXuLyKhoanVay giuxe = new NhanVienF88("Anh Tuấn","Giữ xe", 10000000);
        IXuLyKhoanVay thuky = new NhanVienF88("Diễm Kiều", "Thư Ký", 50000000);
        IXuLyKhoanVay truongphong = new NhanVienF88("Tiến","Trưởng Phòng", 50000000);
        IXuLyKhoanVay giamdoc = new GiamDocF88("Phương",100000000);

        gaccong.capCaoHon(giuxe)
                .capCaoHon(thuky)
                .capCaoHon(truongphong)
                .capCaoHon(giamdoc);

        System.out.println(gaccong.xuLyVay(200000000));
    }
}
