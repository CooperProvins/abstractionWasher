/**
 * The App class tests the washer and Clothes classes.
 */

public class App {
    /**
     * The main method tests the washer and Clothes classes.
     */
    public static void main(String[] args) throws Exception {
        Washer myWasher = new Washer(5, "LG", 150, true); // Initialize a Washer object
        Clothes myClothes = new Clothes(false); // Initialize a Clothes object

        // Print initial states of both, utilizing the toString methods
        System.out.println(myWasher);
        System.out.println(myClothes);

        myWasher.startWasher(myClothes); // Start the washer with the clothes (cleaning them)
        myWasher.waitAYear(); // Simulate waiting a year

        // Print final states of both after washing
        System.out.println(myWasher);
        System.out.println(myClothes);
    }
}
