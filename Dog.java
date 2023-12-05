// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 *          This class is an example of a Dog
 */
public class Dog extends Pet implements Treatable {
    private String breed;

    public static final String DEFAULT_NAME = "Buzz";
    public static final int DEFAULT_AGE = 6;
    public static final int DEFAULT_PAINLEVEL = 3;

    /**
     * This is a constructor that takes in 4 parameters
     * @param name      first variable
     * @param age       second variable
     * @param painLevel third variable
     * @param breed     fourth variable
     */
    public Dog(String name, int age, int painLevel, String breed) {
        super(name, age, painLevel);
        this.breed = breed;
    }

    /**
     * This is a constructor that takes in 1 parameter
     * @param breed first variable
     */
    public Dog(String breed) {
        this(DEFAULT_NAME, DEFAULT_AGE, DEFAULT_PAINLEVEL, breed);
    }

    /**
     * @return String
     */
    public String getBreed() {
        return this.breed;
    }

    /**
     * @param breed breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @param p p
     */
    public void playWith(Pet p) {
        if ((p instanceof Dog)) {
            int newPain = this.getPainLevel() - 3;
            System.out.println("Woof! I love playing with other dogs so much that my pain level went from "
                    + this.getPainLevel() + " to " + newPain);
            this.setPainLevel(newPain);
        } else if ((p instanceof Cat)) {
            Cat doggy = (Cat) p;
            if (doggy.getHasStripes()) {
                int newPain = this.getPainLevel() + 2;
                this.setPainLevel(newPain);
                System.out.println("AHHH! I thought you were a tiger!");
            } else {
                int newPain = this.getPainLevel() - 1;
                System.out.println("Woof. Cats without stripes are okay since they made my pain level go from"
                        + this.getPainLevel() + " to " + newPain);
                this.setPainLevel(newPain);

            }
        }
    }

    /**
     *
     */
    public void treat() {
        int newPain = this.getPainLevel() - 3;
        this.setPainLevel(newPain);
    }

    /**
     *
     */
    public void bark() {
        System.out.println("bark bark");
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "My name is " + super.getName() + "and I am " + super.getAge()
                + ", and I am a " + breed + ".On a scale of one to ten my pain level is"
                + super.getPainLevel() + ".My age in human years is "
                + Treatable.convertDogToHumanYears(super.getAge());
    }

    /**
     * @param o Object to compare with
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) {
            return false;
        }
        Dog doggy = (Dog) o;
        return ((super.equals(doggy)) && (doggy.getBreed().equals(breed)));
    }

}
