package bt_java.MTK.MauKhoiTao.FactoryShape;

public class Circle extends Shape{
    @Override
    public String draw() {
        setBrush("Bút chì");
        setFrame("Hình tròn");
        setPaper("Giấy vở");
        return getBrush() + " - " + getPaper() + " - " + getFrame();
    }
}
