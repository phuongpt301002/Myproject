package bt_java.MTK.MauKhoiTao.FactoryShape;

public class Rectangle extends Shape{
    @Override
    public String draw() {
        setBrush("Bút mực");
        setFrame("Hình chữ nhật");
        setPaper("Giấy màu");
        return getBrush() + " - " + getPaper() + " - " + getFrame();
    }
}
