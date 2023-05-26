package bt_java.BTCoBan.baitap2;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();

        NhanVien nv1 = new NhanVien("Nguyen Van A", 22, "Ha No", 10000000, 180);
        NhanVien nv2 = new NhanVien("Tran Thi B", 25, "Ho Chi Minh", 12000000, 220);
        NhanVien nv3 = new NhanVien("Le Van C", 30, "Da Nang", 15000000, 150);
        NhanVien nv4 = new NhanVien("Pham Thi D", 28, "Hai Phong", 8000000, 80);
        NhanVien nv5 = new NhanVien("Hoang Van E", 35, "Can Tho", 18000000, 250);

        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);

        qlnv.inDS();
    }
}
