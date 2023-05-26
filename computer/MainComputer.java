package bt_java.MTK.MauKhoiTao.computer;

public class MainComputer {
    public static void main(String[] args) {
        Computer c  = new Computer.Builder()
                .buildCPU("Core I9 1200")
                .buildRAM("32GB RAM Samsung 3600HZ")
                .buildStorage("1TB SSD Samsung Evo")
                .buildscreen("17 inches OLED")
                .build();
        System.out.println(c.toString());

    }
}
