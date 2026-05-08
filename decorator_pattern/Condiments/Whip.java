package Condiments;

import Beverage.Beverage;

public class Whip extends Condiment{
    public Whip(Beverage ub){
        this.uderlyingBeverage = ub;
    }

    public int getCost(){
        return uderlyingBeverage.getCost()+ 4;
    }

    public String getDescription(){
        return uderlyingBeverage.getDescription() + " ,Whip";
    }
}
