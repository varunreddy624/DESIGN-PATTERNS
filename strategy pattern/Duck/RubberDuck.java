package Duck;

import FlyBehavior.NoFly;
import QuackBehavior.HighQuack;

public class RubberDuck extends duck {
    public RubberDuck(){
        setFlyBehavior(new NoFly());
        setQuackBehavior(new HighQuack());
    }
}
