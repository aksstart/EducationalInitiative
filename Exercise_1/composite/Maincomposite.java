public class Maincomposite {
    public static void main(String args[]) {
        component Dabeli = new leaf("dabeli", 45);
        component Vadapav = new leaf("vadapav", 50);
        component pizza = new leaf("pizza", 100);

        composite menu = new composite("Menu");

        menu.addComponent(Dabeli);
        menu.addComponent(Vadapav);
        menu.addComponent(pizza);

        menu.showPrice();
    }

}
