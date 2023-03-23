package creational.factory.cntt62_3.BuilderPattern.Bai2;

public class MainStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder m = new MyStringBuilder()
                .add("Hello World")
                .add((float) 10.0)
                .add(true);
        System.out.println(m.toString());


    }
}
