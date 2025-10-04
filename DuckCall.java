import DuckApp.Quack;
import DuckApp.QuackBehavior;

public class DuckCall {
    public void quack(){
        QuackBehavior qb = new Quack();
        qb.quack();
    }
    
    public static void main(String[] args) {
        DuckCall dc = new DuckCall();
        dc.quack();
    }
}
