// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 *          This class is an example of a Vet
 */
public class Vet {
    /**
     * @param pet pet to compare
     */
    public static void inspectPet(Pet pet) {
        if ((pet instanceof Dog)) {
            Dog doggy = (Dog) pet;
            doggy.bark();
        } else {
            pet.toString();
        }
    }

    /**
     * @param pet pet to compare
     */
    public static void treatPet(Pet pet) {
        if (pet instanceof Narwhal) {
            System.out.println("Sorry, we cannot treat" + pet.getName());
        } else if (pet instanceof Dog) {
            Dog doggy = (Dog) pet;
            System.out.println("Welcome to the vet" + doggy.getName());
            doggy.treat();
            System.out.println("Wow what a cute dog!");
            giveDogTreat(doggy);
        } else if (pet instanceof Cat) {
            Cat doggy = (Cat) pet;
            System.out.println("Welcome to the vet" + doggy.getName());
            doggy.treat();
        }
    }

    /**
     * @param dog dog to adjust
     */
    public static void giveDogTreat(Dog dog) {
        int newPain = dog.getPainLevel() - 2;
        dog.setPainLevel(newPain);
    }
}
