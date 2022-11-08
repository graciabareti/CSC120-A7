/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Set;
/*
 * Extends Library to building.
 */
public class Library extends Building{
private Hashtable<String, Boolean> collection;
private boolean hasElevator;
/* Creates library.
 * 
 */

    public Library(String name, String address, int nFloors, boolean hasElevator) {
     super(name, address, nFloors);
      this.collection=new Hashtable<String, Boolean>();
      this.hasElevator =hasElevator;
      System.out.println("You have built a library: 📖");
    }
    /*
 * Overload
 */
    public Library(String name) {
      hasElevator= false; 
      nFloors=1;
      address="Unknown";
      this.name=name;
      this.collection=new Hashtable<String, Boolean>();
     }
    /*
     * Creates title.
     */
    public void addTitle(String title){
      this.collection.put(title,true);
    }
    /*
     * Returns removed title.
     */
    public String removeTitle(String title){
      this.collection.remove(title);
      return title;
    }
    public void checkOut(String title){
      this.collection.replace(title,true, false);
    }
    

    public void returnBook(String title){
      this.collection.replace(title, false, true);
    }
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);

    }// returns true if the title appears as a key in the Library's collection
    public boolean isAvailable(String title){
      return this.collection.get(title);
    }
    //override
    public boolean isAvailable(String title, String name){
      if(this.name==name){
        return this.collection.get(title);
      }
      else return false;
    }
    
    //returns true if the title is currently available, false otherwise.
    public void printCollection(){
      System.out.print("***** My Collection *****");
      Set <String> title=collection.keySet();
      for(String key: title){
        if(collection.get(key)==true){
          System.out.println("The book"+key+"is available");
        }
        else{
          System.out.println("The book"+key+"is unavailable");  
        }
      }}
      public void goToFloor(int floorNum){
        if(this.hasElevator == true){
          super.goToFloor(floorNum);
        }
      }

    // prints out the entire collection in an easy-to-read way( including checkout status)
    public static void main(String[] args) {
      Library myLib = new Library("young","prospect", 4,false);
      System.out.println(myLib);
      myLib.addTitle("New Story");
      System.out.println(myLib.collection);

    
    }
    
  }