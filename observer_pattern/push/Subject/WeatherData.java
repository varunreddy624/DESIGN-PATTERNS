package Subject;

import Observer.observer;
import Subject.subject;

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
            o.update(temp, press, hum);
        }
    }

    public void setMeasurements(float temp, float press, float hum){
        this.temp = temp;
        this.press = press;
        this.hum = hum;
        notifyObservers();
    }
}
