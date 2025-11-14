/**
 * The Washer class provides construction and methods for a washer object.
 */

public class Washer {
    // Initialize private instance variables
    private int age;
    private String company;
    private int numLoads;
    private boolean works;
    private boolean rock;

    /**
     * First constructor with all parameters
     * @param age The age of the washer in years
     * @param company The name of the washer's manufacturing company
     * @param numLoads The number of loads the washer has completed
     * @param works Whether the washer is currently operational
     */
    public Washer(int age, String company, int numLoads, boolean works) {
        // Set instance variables to parameter values
        this.age = age;
        this.company = company;
        this.numLoads = numLoads;
        this.works = works;
    }

    /**
     * Second constructor with limited parameters
     * @param company The name of the washer's manufacturing company
     * @param works Whether the washer is currently operational
     */
    public Washer(String company, boolean works) {
        // Set instance variables, defaulting age and numLoads
        this.age = 0;
        this.company = company;
        this.numLoads = 0;
        this.works = works;
    }

    /** 
     * Returns a string resentation of the Washer object when printed
     * The string includes all instance variable values
     * @return A formatted string representing the Washer object
     */
    public String toString() {
        return "Washer = {" +
            "\n\tage = " + age +
            "\n\tcompany = \"" + company + "\"" +
            "\n\tnumLoads = " + numLoads +
            "\n\tworks = " + works +
            "\n}";
    }

    /**
     * Getter for age
     * @return The age of the washer in years
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter for company
     * @return The name of the washer's manufacturing company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Getter for numLoads
     * @return The number of loads the washer has completed
     */
    public int getNumLoads() {
        return numLoads;
    }

    /**
     * Getter for works
     * @return Whether the washer is currently operational
     */
    public boolean getWorks() {
        return works;
    }

    /**
     * Getter for rock
     * @return The presence of a rock in the washer
     */
    public boolean getRock() {
        return rock;
    }
    /**
     * Simulates waiting a year by printing progress, 
     * then incrementing the age of the washer by 1
     */
    public void waitAYear() {
        waitPrint(10);
        age += 1;
    }
    /**
     * Simulates placing a rock in the washer
     * Sets rock to true and prints a sound effect
     */
    public void placeRockIn() {
        System.out.println("thunk");
        rock = true;
    }

    /**
     * Simulates removing a rock from the washer
     * Sets rock to false and prints a sound effect
     */
    public void takeRockOut() {
        System.out.println("grumble");
        rock = false;
    }
    /**
     * Simulates starting the washer to clean clothes
     * If the washer works, it prints sound effects and cleans the clothes
     * If the washer does not work, it prints silence
     * If there is a rock in the washer, it breaks the washer
     * @param clothes The Clothes object to be cleaned
     */
    public void startWasher(Clothes clothes) {
        if (works){
            System.out.println("beeep");
            if (rock){
                System.out.println("thunka thunka thunka CLANK THUD BEEEEEP");
                works = false;
            }
            else{
                waitPrint(5);
                numLoads += 1;
                clothes.cleanWash();
                System.out.println("whirrrrrr beeep");
            }
        }
        else {
            System.out.println("silence...");
        }
    }
    /**
     * Helper method to simulate waiting for a specified number of seconds
     * @param seconds The number of seconds to wait 
     */
    private void psuedoWait(double seconds) {
        // initializes long (for accurate storage) variable storing nanoseconds
        long startTime = System.nanoTime();
        // while loop that checks nanoTime until it runs into (seconds * 10^9) nanoseconds
        while ((System.nanoTime() - startTime) < seconds*1000000000.0){
        }
    }

    /**
     * Helper method to simulate waiting for a specified number of seconds,
     * with printed progress indication
     * @param seconds The number of seconds to wait 
     */
    private void psuedoWaitPrint(int seconds){
        // iterates from 1 to seconds
        for (int i = 1; i <= seconds; i++){
            // iterates from 1 to 4
            for (int j = 1; j <= 4; j++){
                // adds a period without new line
                System.out.print(".");
                // waits quarter second
                psuedoWait(0.25);
            }
        // clears line in terminal
        System.out.print("\r"); 
        System.out.print("    "); 
        System.out.print("\r");
        }
    }
}
