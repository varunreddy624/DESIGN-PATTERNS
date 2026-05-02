package Displays_pull;

import Display_pull.display;
import Observer_pull.observer;
import Subject_pull.WeatherData;

public class WeatherStatsDisplay implements display, observer {
    public float temp,press,hum;
    public Subject_pull.WeatherData wd;

    public WeatherStatsDisplay(WeatherData wd){
        this.wd = wd;
        wd.subscribeObserver(this);
    }


    public void show(){
        System.out.println("stats are also same as temp, pre, hum is: " + temp + " " +  press + " " + hum);
    }    
    
    public void update(){
        this.temp = wd.getTemp();
        this.press = wd.getPress();
        this.hum = wd.getHum();
        show();
    }
}
