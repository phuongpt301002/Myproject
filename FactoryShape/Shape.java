package bt_java.MTK.MauKhoiTao.FactoryShape;

public abstract class Shape {
    private String brush;
    private String paper;
    private String frame;

    public String getBrush() {
        return brush;
    }

    public String getPaper() {
        return paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public abstract String draw();
}
