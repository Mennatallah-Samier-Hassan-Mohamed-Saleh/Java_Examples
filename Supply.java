// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a Supply
 */
public class Supply extends GroceryItem {
    private String blurb;
    /**
     * This is a constructor that takes in 4 parameters
     * @param name first variable
     * @param itemCode second variable
     * @param price third variable
     * @param blurb fourth variable
    */
    public Supply(String name, int itemCode, double price, String blurb) {
        super(name, itemCode, price);
        this.blurb = blurb;
    }

    /**
     * @return String
     */
    public String getBlurb() {
        return this.blurb;
    }

    /**
     * @param blurb blurb
     */
    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    /**
     * @return String
     */
    public String describe() {
        return "The item looks like " + blurb;
    }
}
