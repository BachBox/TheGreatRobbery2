import java.util.Random;

public class Gang {
    private Criminal[] criminals = new Criminal[2];
    private Random randomNumberGenerator = new Random();
    private double sumRobbedValue;

    Gang() {
        Item[] robItems = new Item[2];
        robItems[0] = new Item("Knife", 10.5);
        robItems[1] = new Item("Half rotten apple", 0.0);
        Criminal rob = new Criminal("Rob", "The eagle", 1970, "Breaking prison", robItems);
        criminals[0] = rob;

        Item[] bobbyItems = new Item[2];
        bobbyItems[0] = new Item("Baseball", 20.5);
        bobbyItems[1] = new Item("Toothpick", 0.5);
        Criminal bobby = new Criminal("Bobby", "The muscle", 1972, "Knock Out", bobbyItems);
        criminals[1] = bobby;
    }

    public double getSumRobbedValue() {
        return sumRobbedValue;
    }

    public void printGangInfo() {
        for (Criminal criminal : criminals) {
            System.out.println("----------------");
            criminal.printBioData();
        }
    }

    // The gang choose random building in the city and start rob
    public void letsRob(Building[] buildings) {
        int randomBuildingIndex = randomNumberGenerator.nextInt(buildings.length);
        System.out.println("--------------");
        if (isSuccessfulRobbery()) {
            System.out.println("The gang managed to rob the following items from the "
                    + buildings[randomBuildingIndex].getName() + ":");
            for (Item item : buildings[randomBuildingIndex].getItems()) {
                sumRobbedValue += item.getValue();
                System.out.println("-" + item.getName());
            }
        } else {
            System.out.println("The gang try to rob " + buildings[randomBuildingIndex].getName() + " but they fail.");
        }
    }

    // helper function, return whether the gang robbed success or not?
    private boolean isSuccessfulRobbery() {
        int randomNumber = randomNumberGenerator.nextInt(101);
        int sumarizedSuccessChange = criminals.length * Criminal.SUCCESS_PERCENTAGE;
        if (randomNumber >= sumarizedSuccessChange)
            return false;
        return true;
    }
}
