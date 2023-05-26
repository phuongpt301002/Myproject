package bt_java.BTCoBan.baitap1;

public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getThongTin() {
        return "Tên: " + ten +
                ", Tuổi: " + tuoi +
                ", Địa chỉ: " + diaChi +
                ", Tiền lương: " + tienLuong +
                ", Tổng số giờ làm: " + tongSoGioLam;
    }

    public double tinhThuong() {
        double thuong = 0;
        if (tongSoGioLam >= 200) {
            thuong = tienLuong * 0.2;
        } else if (tongSoGioLam >= 100) {
            thuong = tienLuong * 0.1;
        }
        return thuong;
    }
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Nguyen Van A", 25, "Ha Noi", 5000000, 180);
        System.out.println(nhanVien1.getThongTin());
        System.out.println("Tiền thưởng: " + nhanVien1.tinhThuong());
        NhanVien nhanVien2 = new NhanVien();
        nhanVien2.setTen("Tran Thi B");
        nhanVien2.setTuoi(30);
        nhanVien2.setDiaChi("Ho Chi Minh");
        nhanVien2.setTienLuong(8000000);
        nhanVien2.setTongSoGioLam(220);
        System.out.println(nhanVien2.getThongTin());
        System.out.println("Tiền thưởng: " + nhanVien2.tinhThuong());
    }
}
