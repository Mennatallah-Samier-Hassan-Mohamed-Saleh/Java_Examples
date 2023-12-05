// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 *          This class is an example of a Pet
 */
public abstract class Pet {
    private String name;
    private int age;
    private int painLevel;

    /**
     * This is a constructor that takes in 3 parameters
     * @param name      first variable
     * @param age       second variable
     * @param painLevel third variable
     */
    public Pet(String name, int age, int painLevel) {
        this.name = name;
        if ((age > 1) && (age < 100)) {
            this.age = age;
        } else if (age < 1) {
            this.age = 1;
        } else if (age > 100) {
            this.age = 100;
        }
        if ((painLevel > 1) && (painLevel < 10)) {
            this.painLevel = painLevel;
        } else if (painLevel < 1) {
            this.painLevel = 1;
        } else if (painLevel > 10) {
            this.painLevel = 10;
        }
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
    public int getAge() {
        return this.age;
    }

    /**
     * @param age age
     */
    public void setAge(int age) {
        if ((age > 1) && (age < 100)) {
            this.age = age;
        } else if (age < 1) {
            this.age = 1;
        } else if (age > 100) {
            this.age = 100;
        }
    }

    /**
     * @return int
     */
    public int getPainLevel() {
        return this.painLevel;
    }

    /**
     * @param painLevel painLevel
     */
    public void setPainLevel(int painLevel) {
        if ((painLevel > 1) && (painLevel < 10)) {
            this.painLevel = painLevel;
        } else if (painLevel < 1) {
            this.painLevel = 1;
        } else if (painLevel > 10) {
            this.painLevel = 10;
        }
    }

    /**
     * @param p p
     */
    public abstract void playWith(Pet p);

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "My name is " + name + "and I am " + age
                + " .On a scale of one to ten my pain level is"
                + painLevel + ".";
    }

    /**
     * @param o Object to compare with
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pet)) {
            return false;
        }
        Pet doggy = (Pet) o;
        return ((doggy.getName().equals(name))
                && (doggy.getAge() == age) && (doggy.getPainLevel() == painLevel));
    }

}
