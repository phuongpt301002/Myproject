package bt_java.BTCoBan.BT5;

public class mainBT5 {
    public static void main(String[] args) {
        LopHoc LH = new LopHoc();

        HocSinh hs1  = new HocSinh("Phùng Thị Phượng","Ninh Hòa - Khánh Hòa", "0976731371",20, "62CNTT3","Ngủ");
        HocSinh hs2  = new HocSinh("Nguyễn Thị Diễm Kiều","Đông Hòa - Phú Yên", "0164294125",20, "62CNTT3","Ngủ");
        HocSinh hs3  = new HocSinh("Phan Minh Tiến","Tuy Hòa - Phú Yên", "0394248212",20, "62CNTT3","Ngủ");

        GiaoVien gv1 = new GiaoVien("Huỳnh Tuấn Anh","Nha Trang - Khánh Hòa","0769731371",40,"Mẫu Thiết Kế","Công Nghệ Phần Mềm");
        GiaoVien gv2 = new GiaoVien("Nguyễn Huỳnh Huy","Đâu đó - Phú Yên","01234862223",26,"Mạng Máy Tính","Mạng Máy Tính và Truyền Thông");
        GiaoVien gv3 = new GiaoVien("Lê Thị Bích Hằng","Nha Trang - Khánh Hòa","099999999",35,"Công Nghệ XML","Công Nghệ Phần Mềm");

        LH.themHocSinh(hs1);
        LH.themHocSinh(hs2);
        LH.themHocSinh(hs3);

        LH.themGVGD(gv1);
        LH.themGVGD(gv2);
        LH.themGVGD(gv3);

        LH.inDSHS();
        LH.inDSGVGD();

        LH.xoaHS("Vũ Lê Hoàng Nam");
        LH.xoaGVGD("Nguyễn Huỳnh Huy");

        LH.inDSHS();
        LH.inDSGVGD();

    }
}
