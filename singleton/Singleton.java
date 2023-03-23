package creational.singleton;

public class Singleton {
    private static Singleton instance;
    int count = 0;

    private Singleton(){
    }

    public  void tang(){
        count++;
    }
    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public int getCount() {
        return count;
    }
}

