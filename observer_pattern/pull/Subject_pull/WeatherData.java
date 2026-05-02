package Subject_pull;

import Observer_pull.observer;
import Subject_pull.subject;

public class WeatherData implements subject {
    float temp, press, hum;

    public void subscribeObserver(observer o){
        l.add(o);
    }
    
    public void unsubscribeObserver(observer o){
        l.remove(o);
    }

    public void notifyObservers(){
        for(observer o: l){
            o.update();
        }
    }

    public float getTemp(){
        return this.temp;
    }

    public float getPress(){
        return this.press;
    }

    public float getHum(){
        return this.hum;
    }

    public void setMeasurements(float temp, float press, float hum){
        this.temp = temp;
        this.press = press;
        this.hum = hum;
        notifyObservers();
    }
}
