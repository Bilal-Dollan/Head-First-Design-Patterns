package DuckApp;
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyingBehavior(new FlyRocketPowerd());
        model.performFly();
    }
}