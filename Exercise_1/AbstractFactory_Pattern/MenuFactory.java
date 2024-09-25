public class MenuFactory extends AbstractFactory {
    public Menu1 getMenu(String Menutype) {
        if (Menutype.equalsIgnoreCase("Pizza"))
            return new Pizza();
        else if (Menutype.equalsIgnoreCase("VadaPav")) {
            return new VadaPav();
        } else if (Menutype.equalsIgnoreCase("Dabeli")) {
            return new Dabeli();
        }
        return null;
    }

}
