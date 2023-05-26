package bt_java.MTK.MauCauTruc.File;

public class Main {
    public static void main(String[] args) {
        AbstractFile hocki1 = new File("MauCauTruc.pdf");
        AbstractFile txt = new Folder("HocKi1");
        txt.add(hocki1);
        System.out.println(txt.getTree());
    }
}
