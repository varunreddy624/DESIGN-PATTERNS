package Displays_pull;

import Display_pull.display;
import Observer_pull.observer;
import Subject_pull.WeatherData;

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

    public void update(){
        this.temp = wd.getTemp();
        this.press = wd.getPress();
        this.hum = wd.getHum();
        show();
    }
}
