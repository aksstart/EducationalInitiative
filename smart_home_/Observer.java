import java.util.Map;

public interface Observer {
    void update(Map<Integer, SmartDevice> devices);
}
