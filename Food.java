// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a Food
 */
public class Food extends GroceryItem {
    private int age;
    private int expiration;

    /**
     * This is a constructor that takes in 5 parameters
     * @param name first variable
     * @param itemCode second variable
     * @param price third variable
     * @param age fourth variable
     * @param expiration fifth variable
    */
    public Food(String name, int itemCode, double price, int age, int expiration) {
        super(name, itemCode, price);
        this.age = age;
        this.expiration = expiration;
    }

    /**
     * @return int
     */
    public int getAge() {
        return this.age;
    }

    /**
     * @param age age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return int
     */
    public int getExpiration() {
        return this.expiration;
    }

    /**
     * @param expiration expiration
     */
    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    /**
     * @return int
     */
    public int calculateMonthsRemaining() {
        return (expiration - age);
    }
    /**
     * @return String
     */
    public String describe() {
        int timeRemaining = calculateMonthsRemaining();
        return "The food is " + age + " months old and has "
                + timeRemaining + " months remaining before it expires.";
    }

}
