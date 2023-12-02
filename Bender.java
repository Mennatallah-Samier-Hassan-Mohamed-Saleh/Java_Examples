/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a Bender
 */
public abstract class Bender {
    private String name;
    private int strengthLevel;
    private int health;

    /**
     * This is a constructor that takes in 3 Strings
     * @param name first variable
     * @param strengthLevel second variable
     * @param health third variable
    */
    public Bender(String name, int strengthLevel, int health) {
        this.name = name;
        this.strengthLevel = strengthLevel;
        this.health = health;
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
    public int getStrengthLevel() {
        return this.strengthLevel;
    }

    /**
     * @param strengthLevel strengthLevel
     */
    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    /**
     * @return int
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * @param health health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @param i value to be added to health
     */
    public void recover(int i) {
        if (!(this.health != 0)) {
            this.health += i;
        }
    }

    /**
     * @param b specific for each class
     */
    public abstract void attack(Bender b);

    /**
     * @param o Object to compare with
     * @return boolean
     */
    public boolean equals(Object o) {
        if (!(o instanceof Bender)) {
            return false;
        }
        Bender doggy = (Bender) o;
        return ((doggy.name.equals(name)) && (doggy.strengthLevel == strengthLevel) && (doggy.health == health));
    }

    /**
     * @return String
     */
    public String toString() {
        return "My name is " + this.name + ". I am a bender. My strength level is "
                + this.strengthLevel + " and my current health is " + this.health + ".";

    }

}