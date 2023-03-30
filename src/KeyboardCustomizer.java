public class KeyboardCustomizer implements Observer {
    @Override
    public void handleEvent(PeripheralDevice dev) {
        if (dev.getType() == PeripheralType.Keyboard)
            System.out.println("[KeyboardCustomizer] A new device can be customized!");
    }
}
