import Duck.MallardDuck;
import Duck.RubberDuck;
import Duck.Duck;

class driver {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}