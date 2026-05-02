package Displays;

import Display.display;
import Observer.observer;
import Subject.WeatherData;

public class CurrentDisplay implements display, observer{

    public float temp,press,hum;
    public WeatherData wd;
    
    public CurrentDisplay(WeatherData wd){
        this.wd = wd;
        wd.subscribeObserver(this);
    }


    public void show(){
        System.out.println("Current temp, pre, hum is: " + temp + " " +  press + " " + hum);
    }    

    public void update(float temp, float press, float hum){
        this.temp = temp;
        this.press = press;
        this.hum = hum;
        show();
    }
}
