package bt_java.MTK.MauHanhVi.B_ChainOfResponsibility.VeSo;

public class Main {
    public static void main(String[] args) {
        String[] boSoGiaiDacBiet = {"123"};
        String[] boSoGiaiNhat = {"124"};
        String[] boSoGiaiNhi = {"152"};
        String[] boSoGiaiBa = {"125", "126"};
        String[] boSoGiaiBon = {"127", "128", "129"};
        String[] boSoGiaiNam = {"130", "131", "132", "133"};
        String[] boSoGiaiSau = {"134", "135", "136", "137", "138"};
        String[] boSoGiaiBay = {"139", "140", "141", "142", "143", "144"};
        String[] boSoGiaiTam = {"145", "146", "147", "148", "149", "150", "151"};
        IDoVeSo giaidacbiet = new Giai("Giải Đặc Biệt", new String[]{"123123"});
        IDoVeSo giainhat = new Giai("Giải Nhất", new String[]{"123124"});
        IDoVeSo giainhi = new Giai("Giải Nhì", new String[]{"124126"});
        IDoVeSo giaiba = new Giai("Giải Ba", new String[]{"123100"});
        IDoVeSo giaibon = new Giai("Giải Bốn", new String[]{"869689"});
        IDoVeSo giainam = new Giai("Giải Năm", new String[]{"266130"});
        IDoVeSo giaisau = new Giai("Giải Sáu", new String[]{"097567"});
        IDoVeSo giaibay = new Giai("Giải Bảy", new String[]{"096435"});
        IDoVeSo giaitam = new GiaiTam(new String[]{"121212"});
        giaidacbiet.giaithaphon(giainhat)
                        .giaithaphon(giainhi)
                        .giaithaphon(giaiba)
                        .giaithaphon(giaibon)
                        .giaithaphon(giainam)
                        .giaithaphon(giaisau)
                        .giaithaphon(giaibay)
                        .giaithaphon(giaitam);
        System.out.println(giaidacbiet.doVe("123124"));
    }
}
