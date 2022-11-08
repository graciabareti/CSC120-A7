/* This is a stub for the House class
 * @Author:Gracia Bareti /Worked with & pair programmed with Rachel Tolentino
 */
import java.util.ArrayList;
/*
 * Extends house to building.
 */
public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  private boolean hasElevator;
  
/* Construct the House
 * 
 */

  public House(String name, String address, int nFloors, boolean hasDR) {
    super( name, address, nFloors);
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }
/*
 * Boolean that helps in creating dining room
 */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
  
/*
 * nResident accessor created to provide the amount of residents.
 */
  public int nResidents() {
    return this.residents.size();
  }
  /*
   * Returns the amount of residents that are moving in.
   */
  public void moveIn(String name) {
    this.residents.add(name);  
  }
  
  /**Overload method
   * @param SmithIdNum
   * @param name
   */
  public void moveIn(int SmithIdNum, String name) {
    this.residents.add(SmithIdNum, name);  
  }

/*Returns name of the person who moved out
 * 
 */
  /**
   * @param name
   * @return
   */
  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  } 
  /**Overload method
   * @param smithIdNum
   * @param name
   * @return
   */
  public int moveOut(int smithIdNum, String name){
    this.residents.remove(smithIdNum);
    this.residents.remove(name);
    return(smithIdNum);
  }
  /**
   * @param person
   * @return
   */
  public boolean isResident(String person){
    return this.residents.contains(person);
  }
  public void showOptions() {
    super.showOptions();
    System.out.println("+ isResident() \n + moveIn() \n + moveOut() \n + nResidents()\n + hasDiningRoom()");
  
}
public void goToFloor(int floorNum){
    if(this.hasElevator==true){
      super.goToFloor(floorNum);
    }
}
/*
 * Prints house
 */
  public static void main(String[] args) {
    House myhouse = new House("Gracia", "123 candy lane",5,true);
    myhouse.moveIn("Gracia");
    myhouse.goToFloor(3);
    System.out.print(myhouse.nResidents());
  }

}