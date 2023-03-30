public class Main {
    public static void main(String[] args) {
        DeviceBus bus = new DeviceBus();
        bus.addObserver(new Discord());
        KeyboardCustomizer kb = new KeyboardCustomizer();
        bus.addObserver(kb);
        bus.notifyObservers(new PeripheralDevice(PeripheralType.Camera));
        bus.notifyObservers(new PeripheralDevice(PeripheralType.Keyboard));
        bus.removeObserver(kb);
        bus.notifyObservers(new PeripheralDevice(PeripheralType.Keyboard));
    }
}