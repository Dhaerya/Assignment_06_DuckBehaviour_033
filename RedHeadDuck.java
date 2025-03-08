package Duck;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        quackbehaviour = new Quack();
        swinBehaviour = new Swimwithlegs();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I am RedHead Duck");
    }
    
}
