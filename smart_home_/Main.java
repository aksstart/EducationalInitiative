import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SmartHomeSystem smartHomeSystem = new SmartHomeSystem();
        
        // Creating devices using Factory Method
        SmartDevice light = SmartDeviceFactory.createDevice("light", 1);
        SmartDevice thermostat = SmartDeviceFactory.createDevice("thermostat", 2);
        SmartDevice doorLock = SmartDeviceFactory.createDevice("door lock", 3);

        // Adding devices to the system
        smartHomeSystem.addDevice(light);
        smartHomeSystem.addDevice(thermostat);
        smartHomeSystem.addDevice(doorLock);

        // Example commands
        smartHomeSystem.turnOn(1);
        smartHomeSystem.turnOff(1);
        
        // Adding a schedule
        Date scheduleTime = new Date(System.currentTimeMillis() + 5000); // 5 seconds later
        Schedule schedule = new Schedule(2, scheduleTime, "turn on");
        smartHomeSystem.setSchedule(schedule);
        
        // Running scheduled tasks
        smartHomeSystem.runSchedules();
    }
}
