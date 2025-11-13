/**
 * The Clothes class provides construction and methods for a clothes object.
 */

public class Clothes {
    // Initialize private instance variable
    private boolean clean;

    /**
    * Constructor with clean parameter
    * @param clean Whether the clothes are clean
    */
    public Clothes(boolean clean) {
        // Set instance variable to parameter value
        this.clean = clean;
    }

    /**
     * Getter for clean
     * @return Whether the clothes are clean
     */
    public boolean isClean() {
        return clean;
    }

    /** 
     * Returns a string resentation of the Clothes object when printed
     * @return A formatted string representing the Clothes object
     */
    public String toString() {
        return "Clothes = {" +
            "\n\tclean = " + clean +
            "\n}";
    }
    /**
     * Simulates cleaning the clothes by setting clean to true
     * Only ment to be called by the Washer class, but I couldn't enforce that.
     * Something about package defualt access modifier???
     */
    public void cleanWash() {
        clean = true;
    }
}
