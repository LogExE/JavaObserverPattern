import java.util.ArrayList;

public class DeviceBus implements Observable {
    ArrayList<Observer> observers;

    public DeviceBus() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers(PeripheralDevice dev) {
        for (Observer obs : observers)
            obs.handleEvent(dev);
    }
}
