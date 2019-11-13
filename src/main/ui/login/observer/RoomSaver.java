package ui.login.observer;

import java.util.Observable;
import java.util.Observer;

public class RoomSaver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Room " + arg + " no longer available.");
    }
}
