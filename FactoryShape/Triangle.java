package bt_java.MTK.MauKhoiTao.FactoryShape;

public class Triangle extends Shape{
    @Override
    public String draw() {
        setBrush("Bút lông");
        setFrame("Hình tam giác");
        setPaper("Giấy A4");
        return getBrush() + " - " + getPaper() + " - " + getFrame();
    }
}
