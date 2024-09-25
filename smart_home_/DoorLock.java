public class DoorLock extends SmartDevice {
    private boolean locked;

    public DoorLock(int id) {
        super(id, "door lock");
        this.locked = true;
    }

    @Override
    public void turnOn() {
        locked = true;
        System.out.println("Door " + id + " is Locked.");
    }

    @Override
    public void turnOff() {
        locked = false;
        System.out.println("Door " + id + " is Unlocked.");
    }
}
