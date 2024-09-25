public class Pizza implements Menu1 {
    public void pay() {
        System.out.println("the cost of Pizza is 90");
    }

    @Override
    public void item() {
        System.out.println("the item is pizza");
    }

    @Override
    public void token() {
        System.out.println("your token number is 1");
    }

}
