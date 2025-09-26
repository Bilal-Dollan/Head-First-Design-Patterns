public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    public void display(){
        System.err.println("I'm a real Mallard duck");
    }
}
