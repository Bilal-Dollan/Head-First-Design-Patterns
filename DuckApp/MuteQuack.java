public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.err.println("<<Silence>>");
    }
}
