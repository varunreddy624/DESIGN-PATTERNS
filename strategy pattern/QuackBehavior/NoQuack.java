package QuackBehavior;

public class NoQuack implements QuackBehavior{
    public void quack(){
        System.err.println("I can't quack :(");
    }
}
