import Beverage.Decaf;
import Beverage.Espresso;
import Beverage.Beverage;
import Condiments.Soy;
import Condiments.Whip;

public class driver {

    public static void main(String args[]){
        Beverage b1 = new Decaf();
        Beverage b2 = new Soy(b1);
        Beverage b3 = new Whip(b2);

        System.out.println(b3.getDescription() + ":" + b3.getCost());

        Beverage b4 = new Espresso();
        Beverage b5 = new Whip(b4);
        Beverage b6 = new Whip(b5);
        Beverage b7 = new Soy(b6);

        System.out.println(b7.getDescription() + ":" + b7.getCost());
    }
}
