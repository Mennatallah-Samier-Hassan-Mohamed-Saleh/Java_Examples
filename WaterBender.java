// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 * This class is an example of a Water Bender
 */
public class WaterBender extends Bender {
    private boolean healer;
    private static int waterPoints;

    public static final int DEFAULT_STRENGTHLEVEL = 40;
    public static final int DEFAULT_HEALTH = 80;
    public static final boolean DEFAULT_HEALER = false;

    /**
     * This is a constructor that takes in 4 parameters
     * @param name first variable
     * @param strengthLevel second variable
     * @param health third variable
     * @param healer fourth variable
    */
    public WaterBender(String name, int strengthLevel, int health, boolean healer) {
        super(name, strengthLevel, health);
        this.healer = healer;
    }

    /**
     * This is a constructor that takes in 1 parameter
     * @param name first variable
    */
    public WaterBender(String name) {
        this(name, DEFAULT_STRENGTHLEVEL, DEFAULT_HEALTH, DEFAULT_HEALER);
    }

    /**
     * @return int
     */
    public static int getWaterPoints() {
        return waterPoints;
    }

    /**
     * @param newWaterPoints newWaterPoints
     */
    public static void setWaterPoints(int newWaterPoints) {
        waterPoints = newWaterPoints;
    }

    /**
     * @return boolean
     */
    public boolean getHealer() {
        return this.healer;
    }

    /**
     * @param healer healer
     */
    public void setHealer(boolean healer) {
        this.healer = healer;
    }

    /**
     * @param b the Bender to attack with
     */
    public void attack(Bender b) {
        if (this.health > 0) {
            int initHealth = b.getHealth();
            int newHealth = initHealth - this.strengthLevel;
            if (newHealth < 0) {
                b.setHealth(0);
                b.setStrengthLevel(0);
            } else {
                b.setHealth(newHealth);
                if (newHealth < 20) {
                    waterPoints = b.getStrengthLevel();
                }
            }
        }

    }

    /**
     * @param wb the Bender wanted to be healed
     */
    public void heal(WaterBender wb) {
        if (!(this.healer)) {
            return;
        } else {
            int initHealth = wb.getHealth();
            initHealth += 20;
            wb.setHealth(initHealth);
            int initStrenghLevel = wb.getStrengthLevel();
            initStrenghLevel += 20;
            wb.setStrengthLevel(initStrenghLevel);
        }
    }

    /**
     * @param o Object to compare with
     * @return boolean
     */
    public boolean equals(Object o) {
        if (!(o instanceof WaterBender)) {
            return false;
        }
        WaterBender doggy = (WaterBender) o;
        return (super.equals(doggy) && (doggy.getHealer() == healer));
    }

    /**
     * @return String
     */
    public String toString() {
        String ability = "cannot";
        if (this.healer) {
            ability = "can";
        }
        return super.toString() + "  With my waterbending, I "
            + ability + " heal others.";
    }
}
