import java.util.Random;

public class Police {
    private Detective sherlockHolmes;

    // Add an instance of Detective for Police class.
    Police() {
        Item[] sherItems = new Item[3];
        sherItems[0] = new Item("Revolver", 500.0);
        sherItems[1] = new Item("Magnifying glasss", 10.0);
        sherItems[2] = new Item("Cigar", 100.0);
        sherlockHolmes = new Detective("Sherlock Holmes", "The greatest detective", 1965, "Chess", sherItems);
    }

    public Detective getSherlockHolmes() {
        return sherlockHolmes;
    }

    // Catch the Gang and recover stolen items
    public boolean catchCriminals(Gang gang) {
        if (areCriminalCaught()) {
            System.out.println(sherlockHolmes.getName() + " managed to catch the gang");
            if (gang.getSumRobbedValue() > 0) {
                System.out.println("The stolen items are recovered: ");
                System.out.println("The value are estimated to $ " + gang.getSumRobbedValue());
            } else
                System.out.println("The gang couldn't steal anything.");
            return true;
        } else {
            System.out.println(sherlockHolmes.getName() + " couldn't catch the criminals!");
            System.out.println("They managed to steal items valued $ " + gang.getSumRobbedValue());
            return false;
        }
    }

    // Helper function: Are criminals caught or not?
    private boolean areCriminalCaught() {
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextInt(101) >= Detective.SUCCESS_PERCENTAGE)
            return false;
        return true;
    }
}
