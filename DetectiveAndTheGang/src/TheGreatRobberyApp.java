
public class TheGreatRobberyApp {
    public static void main(String[] args) throws Exception {
        City city = new City();
        Gang theGang = new Gang();
        Police police = new Police();
        theGang.printGangInfo();
        police.getSherlockHolmes().printBioData();
            
        do {
            theGang.letsRob(city.getBuildings());
        } while (!police.catchCriminals(theGang));
    }
}
