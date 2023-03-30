public class Discord implements Observer {
    @Override
    public void handleEvent(PeripheralDevice dev) {
        PeripheralType type = dev.getType();
        if (type == PeripheralType.Camera || type == PeripheralType.Microphone) {
            System.out.println("[Discord] Found a suitable device: " + dev.getType());
        }
    }
}
