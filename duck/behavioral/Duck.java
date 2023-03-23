package bt_java.duck.behavioral;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void display();
    public void performFly(){
        System.out.println(flyBehavior.fly());
    }

    public void performQuack(){
        System.out.println(quackBehavior.quack());
    }

    public void swim(){

    }
    public IFlyBehavior getFlyBehavior(){
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior(){
        return quackBehavior;
}

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

