/* This is a stub for the Cafe class */
public class Cafe extends Building {
    
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
   
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces= 120;
        this.nSugarPackets= 100;
        this.nCreams= 100;
        this.nCups= 100;

        System.out.println("You have built a cafe: ☕");
    }

    /**
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces ==0 || this.nSugarPackets == 0 || this.nCreams==0 || this.nCups==0);
            restock(10,10,10,10);
        

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
    }
    
    /**
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
            this.nCoffeeOunces += nCoffeeOunces;
            this.nSugarPackets += nSugarPackets;
            this.nCreams += nCreams;
            this.nCups += nCups;
    }

    /**
     * Overload
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     */
    private void restock(double nCoffeeOunces, double nSugarPackets, double nCreams){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams +=nCreams;
    }
    /**
     * overload
     * @param nCoffeeOunces
     * @param nSugarPackets
     */
    private void restock(double nCoffeeOunces, double nSugarPackets){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
    }
    /* (non-Javadoc)
     * @see Building#showOptions()
     */
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + restock() \n +  sellCoffee() \n + enter() \n + exit()\n ");
    }
    public void goToFloor(int floorNum){
        if(floorNum !=1){
            System.out.println("Warning: You do not have access to other floors");
        }
    }
    //print statement for testing
    /**
     * @param args
     */
    public static void main(String[] args) {
        Cafe shop= new Cafe("Bareti Cafe", "2024 Graduation Ave",6);
        System.out.println(shop);
        shop.sellCoffee(12,6,2);
        shop.showOptions();
    }
    
}
