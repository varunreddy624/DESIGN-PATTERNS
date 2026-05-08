package Condiments;

import Beverage.Beverage;

public class Soy extends Condiment{

    public Soy(Beverage ub){
        this.uderlyingBeverage = ub;
    }

    public int getCost(){
        return uderlyingBeverage.getCost() + 5;
    }

    public String getDescription(){
        return uderlyingBeverage.getDescription() + " ,soy ";
    }
}
