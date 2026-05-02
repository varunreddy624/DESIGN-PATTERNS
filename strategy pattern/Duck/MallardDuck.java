package Duck;

import FlyBehavior.ModerateFly;
import QuackBehavior.NoQuack;

public class MallardDuck extends duck {
    public MallardDuck(){
        setFlyBehavior(new ModerateFly());
        setQuackBehavior(new NoQuack());
    }
}
