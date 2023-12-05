// I worked on the assignment alone, using only course-provided materials.
import java.util.Arrays;
/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a Grocery
 */
public class Grocery {
    private GroceryItem[] shelf;

    /**
    * This is a constructor that takes no arguments
    */
    public Grocery() {
        this.shelf = new GroceryItem[0];
    }

    /**
     * This is a constructor that takes in 1 parameter
     * @param shelfInput first variable
    */
    public Grocery(GroceryItem[] shelfInput) {
        Arrays.sort(shelfInput);
        this.shelf = shelfInput;
    }

    /**
     * @return GroceryItem[]
     */
    public GroceryItem[] getShelf() {
        return this.shelf;
    }

    /**
     * @param shelf shelf
     */
    public void setShelf(GroceryItem[] shelf) {
        this.shelf = shelf;
    }

    /**
     *
     */
    public void browseItems() {
        for (GroceryItem i:shelf) {
            System.out.println(i.toString());
        }
    }

    /**
     * @param newItem item to be added
     */
    public void addGroceryItem(GroceryItem newItem) {
        int sizeOfShelf = this.shelf.length;
        GroceryItem[] newShelf = new GroceryItem[sizeOfShelf + 1];
        for (int i = 0; i < sizeOfShelf; i++) {
            newShelf[i] = shelf[i];
        }
        newShelf[sizeOfShelf] = newItem;
        Arrays.sort(newShelf);
        shelf = newShelf;
    }

    /**
     * @param code code to serach for
     * @return GroceryItem
     */
    public GroceryItem getGroceryItem(int code) {
        int sizeOfShelf = shelf.length - 1;
        if ((code >= 0) && (code <= sizeOfShelf)) {
            return shelf[code];
        } else {
            return null;
        }
    }

    /**
     * @return int
     */
    public int getNumberOfItems() {
        return shelf.length;
    }

}
