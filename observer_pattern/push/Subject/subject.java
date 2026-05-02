package Subject;

import java.util.ArrayList;
import java.util.List;

import Observer.observer;

public interface subject {
    public List<observer> l = new ArrayList<>();
    
    public void subscribeObserver(observer o);
    public void unsubscribeObserver(observer o);
    public void notifyObservers();
}
