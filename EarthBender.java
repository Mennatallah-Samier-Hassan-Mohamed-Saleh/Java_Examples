// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a Earth Bender
 */
public class EarthBender extends Bender {
    private boolean earthArmor;
    private static int earthPoints;

    public static final int DEFAULT_STRENGTHLEVEL = 40;
    public static final int DEFAULT_HEALTH = 100;
    public static final boolean DEFAULT_EARTHARMOR = false;

    /**
     * This is a constructor that takes in 4 parameters
     * @param name first variable
     * @param strengthLevel second variable
     * @param health third variable
     * @param earthArmor fourth variable
    */
    public EarthBender(String name, int strengthLevel, int health, boolean earthArmor) {
        super(name, strengthLevel, health);
        this.earthArmor = earthArmor;
    }

    /**
     * This is a constructor that takes in 1 parameter
     * @param name first variable
    */
    public EarthBender(String name) {
        this(name, DEFAULT_STRENGTHLEVEL, DEFAULT_HEALTH, DEFAULT_EARTHARMOR);
    }

    /**
     * @return int
     */
    public static int getEarthPoints() {
        return earthPoints;
    }

    /**
     * @param newEarthPoints newEarthPoints
     */
    public static void setEarthPoints(int newEarthPoints) {
        earthPoints = newEarthPoints;
    }

    /**
     * @return boolean
     */
    public boolean getEarthArmor() {
        return this.earthArmor;
    }

    /**
     * @param earthArmor earthArmor
     */
    public void setEarthArmor(boolean earthArmor) {
        this.earthArmor = earthArmor;
    }

     /**
     * @param b the Bender to attack with
     */
    public void attack(Bender b) {
        if (this.health > 0) {
            if ((b instanceof EarthBender)) {
                return;
            }
            int initHealth = b.getHealth();
            int newHealth = initHealth - this.strengthLevel;
            if (this.earthArmor) {
                newHealth -= 20;
                this.earthArmor = false;
            }
            if (newHealth <= 0) {
                earthPoints += b.getStrengthLevel();
                b.setHealth(0);
                b.setStrengthLevel(0);
            } else {
                b.setHealth(newHealth);
                if (newHealth < 20) {
                    earthPoints += b.getStrengthLevel();
                }
            }
        }

    }

    /**
     *
     */
    public void buildArmor() {
        this.setEarthArmor(true);
    }
}
