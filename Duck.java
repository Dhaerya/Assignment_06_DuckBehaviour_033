abstract class Duck {
    FlyBehavior flyBehavior;
    SwimBehavior swimBehavior;

    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performSwim() {
        swimBehavior.swim();
    }
    
    abstract void display();
}