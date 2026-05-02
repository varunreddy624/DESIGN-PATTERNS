import Duck.MallardDuck;
import Duck.RubberDuck;
import Duck.duck;

class driver {
    public static void main(String[] args) {
        duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}