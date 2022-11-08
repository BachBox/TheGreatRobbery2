public class City {
    //Initial an array of Buildings
    private Building[] buildings = new Building[4];

    //Add Buildings and Items in constructor.
    public City() {
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter", 1.5);
        bankItems[1] = new Item("Stamp", 2.5);
        buildings[0] = new Building("Bank", bankItems);

        Item[] masionItems = new Item[2];
        masionItems[0] = new Item("Pair of fancy shoes", 25.0);
        masionItems[1] = new Item("Broken glass", 0.1);
        buildings[1] = new Building("Mansion", masionItems);

        Item[] postOfficeItems = new Item[2];
        postOfficeItems[0] = new Item("Letter to Kendall", 1.0);
        postOfficeItems[1] = new Item("Pencil", 2.0);
        buildings[2] = new Building("Post Office", postOfficeItems);

        Item[] supermarketItems = new Item[2];
        supermarketItems[0] = new Item("Bread", 2.5);
        supermarketItems[1] = new Item("A bag of tea", 6.5);
        buildings[3] = new Building("Supermarket", supermarketItems); 
    }   

    public Building[] getBuildings() {
        return buildings;
    }

    
}