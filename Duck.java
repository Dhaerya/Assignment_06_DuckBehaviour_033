package Duck;

public abstract class Duck {
    Quackbehaviour quackbehaviour;
    SwinBehaviour swinBehaviour;
    Fly flybehave;

    // public void setSwinBehaviour(SwinBehaviour SwinBehaviour){
    //     this.swinBehaviour = swinBehaviour;
    // }

    public void performFly(){
        flybehave.fly();
    }

    public void performSwim(){
        swinBehaviour.swim();
    }

    abstract public void display();

    public void setQuackbehaviour(Quackbehaviour quackbehaviour){
        this.quackbehaviour = quackbehaviour;
    }

    public void performQuack(){
        quackbehaviour.quack();
    }

}
