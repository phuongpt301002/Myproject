package bt_java.MTK.MauKhoiTao.FactoryShape;

public class MainShape {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        //System.out.println("Loại bút - Loại giấy - Hình");
        Shape s = shapeFactory.createShape(ShapeType.tron);
        System.out.println(s.draw());
        Shape s1 = shapeFactory.createShape(ShapeType.hcn);
        System.out.println(s1.draw());
        Shape s2 = shapeFactory.createShape(ShapeType.htg);
        System.out.println(s2.draw());
    }
}
