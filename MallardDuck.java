package Duck;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackbehaviour = new Quack();
        swinBehaviour = new Swimwithlegs();
        };
    

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I am Mallard Duck");
    }
    
}