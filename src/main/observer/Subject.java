package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<RoomObserver> observers = new ArrayList<>();

    public void addObserver(RoomObserver roomObserver) {
        if (!observers.contains(roomObserver)) {
            observers.add(roomObserver);
        }
    }

    public void notifyObservers(RoomObserver roomObserver) {
        for (RoomObserver observer : observers) {
            observer.update(roomObserver);
        }
    }
}
