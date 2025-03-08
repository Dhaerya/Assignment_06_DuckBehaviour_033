// DecoyDuck.java
class DecoyDuck extends Duck {
    DecoyDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Drown();
    }
    
    void display() {
        System.out.println("I am a Decoy Duck.");
    }
}