// I worked on the assignment alone, using only course-provided materials.
public class Fly {
    private double mass;
    private double speed;
    public static final double DEFAULT_MASS = 5.00;
    public static final double DEFAULT_SPPED = 10.00;

    // constructors
    public Fly() {
        this(DEFAULT_MASS);
    }

    public Fly(double mass) {
        this(mass, DEFAULT_SPPED);
    }

    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    /* Methods */
    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void grow(int addMass) {
        for (int i = 1; i <= addMass; i = i + 1) {
            if (this.mass < 20) {
                this.speed += 1.00;
            } else {
                this.speed = this.speed - 0.50;
            }
            this.mass += 1.00;
        }

    }

    public boolean isDead() {
        return this.mass == 0;
    }

    public String toString() {
        String speedDouble = String.format("%.2f", this.speed);
        String massDouble = String.format("%.2f", this.mass);
        if (this.isDead()) {
            return "I’m dead, but I used to be a fly with a speed of " + speedDouble + ".";
        } else {
            return "I’m a speedy fly with " + speedDouble + " speed and " + massDouble + " mass.";

        }

    }

}
