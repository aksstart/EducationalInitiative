public class Light extends SmartDevice {
    private boolean status;

    public Light(int id) {
        super(id, "light");
        this.status = false;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println("Light " + id + " is On.");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println("Light " + id + " is Off.");
    }
}
