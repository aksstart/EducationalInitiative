
public class leaf implements component {
    int price;
    String itemname;

    leaf(String name, int price) {
        this.itemname = name;
        this.price = price;
    }

    public void showPrice() {
        System.out.println("leaf" + "-> " + itemname + ":" + price);
    }

    public int getPrice() {
        return price;
    }
}
