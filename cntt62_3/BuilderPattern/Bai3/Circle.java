package creational.factory.cntt62_3.BuilderPattern.Bai3;

import creational.singleton.Singleton;

public class Circle {
    private static Circle instance;

    private Circle(){
    }
    public static Circle getInstance(){
        if(instance == null)
            instance = new Circle();
        return instance;
    }



}
