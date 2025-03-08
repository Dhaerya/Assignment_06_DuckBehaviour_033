package Duck;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackbehaviour = new Squeak();
        swinBehaviour = new Floating();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I am a Rubber Duck!!");
    }
    
}
