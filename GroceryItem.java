// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a GroceryItem
 */
public abstract class GroceryItem implements Describable, Comparable<GroceryItem> {
    protected String name;
    protected int itemCode;
    protected double price;

    /**
     * This is a constructor that takes in 3 parameters
     * @param name first variable
     * @param itemCode second variable
     * @param price third variable
    */
    public GroceryItem(String name, int itemCode, double price) {
        this.name = name;
        this.itemCode = itemCode;
        this.price = price;
    }

    /**
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int
     */
    public int getItemCode() {
        return this.itemCode;
    }

    /**
     * @param itemCode itemCode
     */
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return double
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * @param price price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @param other other element
     * @return int
     */
    @Override
    public int compareTo(GroceryItem other) {
        int x = (int) (price - other.getPrice());
        return -x;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return itemCode + ":" + describe();
    }
}
