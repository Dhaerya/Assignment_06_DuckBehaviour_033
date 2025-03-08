package Duck;

public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        RedHeadDuck rd = new RedHeadDuck();
        RubberDuck rb = new RubberDuck();
        System.out.println("------------------------------");
        rb.display();
        rb.performQuack();
        rb.performSwim();
        rb.performFly();
        System.out.println("------------------------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("------------------------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("------------------------------");
    }
}
