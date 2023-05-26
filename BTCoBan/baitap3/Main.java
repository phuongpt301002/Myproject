package bt_java.BTCoBan.baitap3;

import java.sql.Array;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SinhVienBiz sv2 = new SinhVienBiz("Huỳnh Văn A", "Kinh tế", 8, 8);
        SinhVienIT sv3 = new SinhVienIT("Lê Thị Hằng", "Công nghệ phần mềm", 9, 9, 8);
        sv2.xuat();
        sv3.xuat();
    }
}
