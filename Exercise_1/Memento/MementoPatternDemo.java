//This is a class.  

public class MementoPatternDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker careTaker = new Caretaker();

        originator.setState("Rs 50 of dabeli");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Rs 40 of Vadapav");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current amount to be paid : " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Previous amount to be left" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
    }

}
// End of the MementoPatternDemo class.
