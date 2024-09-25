public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Me")) {
            return new MenuFactory();
        }
        return null;
    }

}
