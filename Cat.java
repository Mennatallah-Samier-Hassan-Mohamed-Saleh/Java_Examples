// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 *          This class is an example of a Cat
 */
public class Cat extends Pet implements Treatable {
    private boolean hasStripes;

    public static final String DEFAULT_NAME = "Purrfect”";
    public static final int DEFAULT_AGE = 4;
    public static final int DEFAULT_PAINLEVEL = 9;

    /**
     * This is a constructor that takes in 4 parameters
     * @param name      first variable
     * @param age       second variable
     * @param painLevel third variable
     * @param hasStripes     fourth variable
     */
    public Cat(String name, int age, int painLevel, boolean hasStripes) {
        super(name, age, painLevel);
        this.hasStripes = hasStripes;
    }

    /**
     * This is a constructor that takes in 1 parameter
     * @param hasStripes first variable
     */
    public Cat(boolean hasStripes) {
        this(DEFAULT_NAME, DEFAULT_AGE, DEFAULT_PAINLEVEL, hasStripes);
    }

    /**
     * @return boolean
     */
    public boolean getHasStripes() {
        return this.hasStripes;
    }

    /**
     * @param hasStripes hasStripes
     */
    public void setHasStripes(boolean hasStripes) {
        this.hasStripes = hasStripes;
    }

    /**
     * @param p p
     */
    public void playWith(Pet p) {
        if ((p instanceof Cat)) {
            Cat doggy = (Cat) p;
            if (doggy.getHasStripes() == hasStripes) {
                int newPain = this.getPainLevel() - 4;
                this.setPainLevel(newPain);
                System.out.println("Meow! I love playing with other cats with the same pattern as me");
            } else {
                int newPain = this.getPainLevel() - 2;
                this.setPainLevel(newPain);
                System.out.println("Meow! I love playing with other cats without the same pattern as me");

            }
        } else if ((p instanceof Dog)) {
            int newPain = this.getPainLevel() + 1;
            this.setPainLevel(newPain);
            System.out.println("Meow. Go away " + p.getName() + "! I don’t like playing with Dogs!");
        }
    }


    /**
     *
     */
    public void treat() {
        int newPain = this.getPainLevel() - 1;
        this.setPainLevel(newPain);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return  super.toString() + "My age in human years is "
                + Treatable.convertCatToHumanYears(super.getAge());
    }

    /**
     * @param o Object to compare with
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat)) {
            return false;
        }
        Cat doggy = (Cat) o;
        return ((super.equals(doggy)) && (doggy.getHasStripes() == hasStripes));
    }

}
