// I worked on the assignment alone, using only course-provided materials.
/**
 * @author Mennatallah Saleh
 * @version 1.0
 *          This class is an example of a Treatable
 */
public interface Treatable {
    /**
     * @param dogAge dogAge
     * @return int
     */
    static int convertDogToHumanYears(int dogAge) {
        int humagAge = (int) (16 * Math.log(dogAge) + 31);
        return humagAge;
    }

    /**
     * @param catAge catAge
     * @return int
     */
    static int convertCatToHumanYears(int catAge) {
        int humagAge = (int) (9 * Math.log(catAge) + 18);
        return humagAge;
    }
    /**
     *
     */
    void treat();

}
