// MallardDuck.java
class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new Fly();
        swimBehavior = new Swim();
    }
    
    void display() {
        System.out.println("I am a Mallard Duck.");
    }
}