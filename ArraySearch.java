public class ArraySearch {
    public static void main(String args[]) {
        String[] concepts = { "abstraction", "polymorphism", "inheritance", "encapsulation" };
        System.out.println(ArraySearchfun(concepts, "polymorphism"));
        System.out.println(ArraySearchfun(concepts, "abstraction"));

        String[] positions = { "long walks", "sunrise", "sunsets", "skipping rocks" };
        System.out.println(ArraySearchfun(positions, "sunsets"));
        System.out.println(ArraySearchfun(positions, "pasttimes"));

    }

    public static boolean ArraySearchfun(String[] input, String Search) {
        boolean result = false;
        for (String element : input) {
            if (element.equals(Search)) {
                result = true;
                break;
            }
        }

        return result;

    }

    public static boolean searchIntArray(int target, int[] array) {
        boolean result = false;
        for (int element : array) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }
}
