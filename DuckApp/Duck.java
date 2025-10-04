package DuckApp;
public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.err.println("All ducks float, even decoys!");
    }
   
    public void setFlyingBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}