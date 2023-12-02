// I worked on the assignment alone, using only course-provided materials.
public class Frog {
    public static final int DEFAULT_AGE = 5;
    public static final double DEFAULT_TONGUESPEED = 5.00;
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";

    /* Constructors */
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int) (ageInYears * 12), tongueSpeed);
    }

    public Frog(String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUESPEED);
    }

    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        if ((1 < this.age) && (this.age < 7)) {
            this.isFroglet = true;
        } else {
            this.isFroglet = false;
        }
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void grow(int numMonths) {
        for (int i = 1; i <= numMonths; i = i + 1) {
            if ((1 < this.age) && (this.age < 7)) {
                this.isFroglet = true;
            } else {
                this.isFroglet = false;
            }
            if (this.age < 12) {
                this.tongueSpeed += 1.00;
            }
            if (this.age >= 30) {
                if (this.tongueSpeed > 5) {
                    this.tongueSpeed -= 1.00;
                }

            }
            this.age += 1;
        }

    }

    public void grow() {
        this.age += 1;
        if ((1 < this.age) && (this.age < 7)) {
            this.isFroglet = true;
        } else {
            this.isFroglet = false;
        }
        if (this.age <= 12) {
            this.tongueSpeed += 1.00;
        }
        if (this.age >= 30) {
            if (this.tongueSpeed > 5) {
                this.tongueSpeed -= 1.00;
            }

        }
    }

    public void eat(Fly inputFly) {
        if (inputFly.isDead()) {
            return;
        } else {
            // Fly is caught
            if (this.tongueSpeed > inputFly.getSpeed()) {
                inputFly.setMass(0.00);

                if (inputFly.getMass() >= 0.5 * this.age) {
                    this.grow(1);
                }

            } else {
                inputFly.grow(1);
            }

        }

    }

    public String toString() {
        String tongueSpeedDouble = String.format("%.2f", this.tongueSpeed);
        if (this.isFroglet) {
            return "My name is " + this.name + " and I’m a rare froglet! I’m "
                + this.age + " months old and my tongue has a speed of "
                + tongueSpeedDouble + ".";
        } else {
            return "My name is " + this.name + " and I’m a rare frog. I’m "
                + this.age + " months old and my tongue has a speed of "
                + tongueSpeedDouble + ".";
        }

    }

}
