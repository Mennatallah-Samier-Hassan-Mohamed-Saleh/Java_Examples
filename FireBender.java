// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a Fire Bender
 */
public class FireBender extends Bender {
    private static int firePoints;
    public static final int DEFAULT_STRENGTHLEVEL = 60;
    public static final int DEFAULT_HEALTH = 50;

    /**
     * This is a constructor that takes in 3 parameters
     * @param name first variable
     * @param strengthLevel second variable
     * @param health third variable
    */
    public FireBender(String name, int strengthLevel, int health) {
        super(name, strengthLevel, health);
    }

    /**
     * This is a constructor that takes in 1 parameter
     * @param name first variable
    */
    public FireBender(String name) {
        this(name, DEFAULT_STRENGTHLEVEL, DEFAULT_HEALTH);
    }

    /**
     * @return int
     */
    public static int getFirePoints() {
        return firePoints;
    }

    /**
     * @param newFirePoints newFirePoints
     */
    public static void setFirePoints(int newFirePoints) {
        firePoints = newFirePoints;
    }

    /**
     * @param b the Bender to attack with
     */
    public void attack(Bender b) {
        if (this.health > 5) {
            int initHealth = b.getHealth();
            int newHealth = initHealth - this.strengthLevel;
            if (newHealth <= 0) {
                firePoints += b.getStrengthLevel();
                b.setHealth(0);
                b.setStrengthLevel(0);
            } else {
                b.setHealth(newHealth);
                if (newHealth < 20) {
                    firePoints += b.getStrengthLevel();
                }
            }
        }

    }

    /**
     * @param b the list of Benders to attack
     */
    public void flameCircle(Bender[] b) {
        for (Bender i:b) {
            int initHealth = i.getHealth();
            int newHealth = initHealth - 10;
            if (newHealth < 0) {
                i.setHealth(0);
            } else {
                i.setHealth(newHealth);
                firePoints += 5;
            }
        }

    }
}
