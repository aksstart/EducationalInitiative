public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id, int temperature) {
        super(id, "thermostat");
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        // Thermostat specific turn on logic
        System.out.println("Thermostat " + id + " is turned On.");
    }

    @Override
    public void turnOff() {
        // Thermostat specific turn off logic
        System.out.println("Thermostat " + id + " is turned Off.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + id + " set to " + temperature + " degrees.");
    }
}
