// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 *          This class is an example of a Narwhal
 */
public class Narwhal extends Pet {
    private int hornLength;
    public static final String DEFAULT_NAME = "Jelly";
    public static final int DEFAULT_AGE = 19;
    public static final int DEFAULT_PAINLEVEL = 2;
    public static final int DEFAULT_HORNLENGTH = 7;

    /**
     * This is a constructor that takes in 4 parameters
     * @param name       first variable
     * @param age        second variable
     * @param painLevel  third variable
     * @param hornLength fourth variable
     */
    public Narwhal(String name, int age, int painLevel, int hornLength) {
        super(name, age, painLevel);
        this.hornLength = hornLength;
    }
    /**
     *
     */
    public Narwhal() {
        this(DEFAULT_NAME, DEFAULT_AGE, DEFAULT_PAINLEVEL, DEFAULT_HORNLENGTH);
    }

    /**
     * @return int
     */
    public int getHornLength() {
        return this.hornLength;
    }

    /**
     * @param hornLength hornLength
     */
    public void setHornLength(int hornLength) {
        this.hornLength = hornLength;
    }

    /**
     * @param p p
     */
    public void playWith(Pet p) {
        if ((p instanceof Narwhal)) {
            System.out.println("“Who needs dogs and cats when we have each other");
            int newPain = this.getPainLevel() - 2;
            this.setPainLevel(newPain);
        } else {
            System.out.println("I live in the ocean so I can’t play with you");
            int newPain = this.getPainLevel() + 1;
            this.setPainLevel(newPain);
        }
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "I have a horn that is "
                + hornLength + " feet long";
    }

    /**
     * @param o Object to compare with
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Narwhal)) {
            return false;
        }
        Narwhal doggy = (Narwhal) o;
        return ((super.equals(doggy)) && (doggy.getHornLength() == hornLength));
    }

}
