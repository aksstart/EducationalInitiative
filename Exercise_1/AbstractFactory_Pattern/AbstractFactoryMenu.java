public class AbstractFactoryMenu {
    public static void main(String[] args) {
        AbstractFactory obj1 = FactoryProducer.getFactory("Menu");

        Menu1 obj2 = obj1.getMenu("Pizza");

        obj2.pay();
        obj2.item();
        obj2.token();
    }
}