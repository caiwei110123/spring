package pattern.observer.code;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题抽象类
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public void notifys(){
        for (Observer obj :observers) {
            obj.update();
        }
    }
}
