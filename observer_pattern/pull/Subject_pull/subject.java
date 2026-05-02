package Subject_pull;

import java.util.ArrayList;
import java.util.List;

import Observer_pull.observer;

public interface subject {
    public List<observer> l = new ArrayList<>();
    
    public void subscribeObserver(observer o);
    public void unsubscribeObserver(observer o);
    public void notifyObservers();
}
