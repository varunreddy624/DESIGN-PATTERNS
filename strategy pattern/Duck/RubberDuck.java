package Duck;

import FlyBehavior.NoFly;
import QuackBehavior.HighQuack;

public class RubberDuck extends Duck {
    public RubberDuck(){
        setFlyBehavior(new NoFly());
        setQuackBehavior(new HighQuack());
    }
}
