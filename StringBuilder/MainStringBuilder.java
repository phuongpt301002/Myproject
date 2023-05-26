package bt_java.MTK.MauKhoiTao.StringBuilder;

public class MainStringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder.MyStringBuilder()
                .addString("Hello World")
                .addFloat((float) 10.0)
                .addBool(true)
                .myStringBuilder();
        System.out.println(s.toString());
    }
}
