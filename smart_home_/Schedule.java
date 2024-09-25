import java.util.Date;

public class Schedule {
    private int deviceId;
    private Date time;
    private String command;

    public Schedule(int deviceId, Date time, String command) {
        this.deviceId = deviceId;
        this.time = time;
        this.command = command;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public Date getTime() {
        return time;
    }

    public String getCommand() {
        return command;
    }
}
