import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Cafe("Campus Center", "100 Elm Street Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Nielson Library", "7 Nielsen Drive  Northampton, MA 01063", 5));
        myMap.addBuilding(new Building("Burton Hall", "46 College Lane Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Sabin Reed", "46 College Lane Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Wright Hall", "20 College Lane Northampton, MA 01063", 3));
        myMap.addBuilding(new Building("Seeyle Hall", "2 Seeyle Drive Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Wuertle Center", "146 Elm Street Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Parsons Annex", "19 Roundhill Road Northampton, MA 01063", 4, false));
        myMap.addBuilding(new Building("Botanical Garden", "16 College Lane Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Hillyer Library", "20 Elm Street Northampton, MA 01063", 4));
        System.out.println(myMap);
    }
    
}
