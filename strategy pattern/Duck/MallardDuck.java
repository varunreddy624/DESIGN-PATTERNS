package Duck;

import FlyBehavior.ModerateFly;
import QuackBehavior.NoQuack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyBehavior(new ModerateFly());
        setQuackBehavior(new NoQuack());
    }
}
