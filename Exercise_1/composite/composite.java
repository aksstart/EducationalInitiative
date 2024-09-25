import java.util.ArrayList;
import java.util.List;

public class composite implements component {
    String itemname;
    List<component> components = new ArrayList<>();

    public composite(String name) {
        super();
        this.itemname = name;
    }

    public void addComponent(component com) {
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println("Composite -> " + itemname + ": Price " + getPrice());
        System.out.println("leaf of " + itemname);
        for (component c : components) {
            c.showPrice();
        }

    }

    @Override
    public int getPrice() {
        int p = 0;
        for (component c : components) {
            p += c.getPrice();
        }
        return p;
    }

}
