public class Detective extends Person {

    public Detective(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
   }

    public static final int SUCCESS_PERCENTAGE = 10;

    @Override
    public void printBioData() {
        System.out.println("Detective:");
        super.printBioData();
    }
}
