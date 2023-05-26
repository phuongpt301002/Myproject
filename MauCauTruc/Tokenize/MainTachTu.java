package bt_java.MTK.MauCauTruc.Tokenize;

public class MainTachTu {
    public static void main(String[] args) {
        Tokenize t1 = new TachTu("Tôi và Kiều là 2 con gà");
        t1 = new StopWord(t1);
        System.out.println(t1.tokenzize());
    }
}
