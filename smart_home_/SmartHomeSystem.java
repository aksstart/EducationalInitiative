import java.util.*;

public class SmartHomeSystem {
    private Map<Integer, SmartDevice> devices;
    private List<Schedule> schedules;
    private List<Trigger> triggers;
    private List<Observer> observers;

    public SmartHomeSystem() {
        devices = new HashMap<>();
        schedules = new ArrayList<>();
        triggers = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.put(device.getId(), device);
        notifyObservers();
    }

    public void removeDevice(int deviceId) {
        if (devices.containsKey(deviceId)) {
            devices.remove(deviceId);
            notifyObservers();
        }
    }

    public void turnOn(int deviceId) {
        if (devices.containsKey(deviceId)) {
            devices.get(deviceId).turnOn();
            notifyObservers();
        }
    }

    public void turnOff(int deviceId) {
        if (devices.containsKey(deviceId)) {
            devices.get(deviceId).turnOff();
            notifyObservers();
        }
    }

    public void setSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void addTrigger(Trigger trigger) {
        triggers.add(trigger);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(devices);
        }
    }

    // For simplicity, this method will run scheduled tasks
    public void runSchedules() {
        Timer timer = new Timer();
        for (Schedule schedule : schedules) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    executeCommand(schedule.getDeviceId(), schedule.getCommand());
                }
            }, schedule.getTime());
        }
    }

    private void executeCommand(int deviceId, String command) {
        switch (command.toLowerCase()) {
            case "turn on":
                turnOn(deviceId);
                break;
            case "turn off":
                turnOff(deviceId);
                break;
            // Add other command cases as needed
        }
    }

    // Other functionalities...
}
