// RubberDuck.java
class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new FloatSwim();  // Corrected class name
    }
    
    void display() {
        System.out.println("I am a Rubber Duck.");
    }
}
