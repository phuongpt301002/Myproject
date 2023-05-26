package bt_java.MTK.MauKhoiTao.FactoryShape;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory(){}

    public static ShapeFactory getInstance() {
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    public Shape createShape (ShapeType shapeType){
        switch (shapeType){
            case hcn: return new Rectangle();
            case tron: return new Circle();
            case htg: return new Triangle();
        }
        return null;
    }
}
