package creational.factory.cntt62_3.BuilderPattern.BaiTap5;

public class MainBook {
    public static void main(String[] args) {
        Book b = new Book.Builder()
                .buildtuade(" Hai con thằn lằn con \n")
                .buildsotrang(" 100 \n")
                .buildtacgia(" Ai mà biết \n ")
                .buildDSchuong("\nChương 1: Tự mà suy nghĩ \n" +
                        "Chương 2: Vịt con \n")
                .build();
        System.out.println(b.toString());
    }
}
