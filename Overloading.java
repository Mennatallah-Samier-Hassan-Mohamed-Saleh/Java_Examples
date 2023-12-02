public class Overloading {
    public static boolean ArraySearch(String[] input, String Search) {
        boolean result = false;
        for (String element : input) {
            if (element !=null && element.equals(Search)) {
                result = true;
                break;
            }
        }

        return result;

    }
        public static boolean ArraySearch(int[] input, int Search) {
        boolean result = false;
        for (int element : input) {
            if (element == Search) {
                result = true;
                break;
            }
        }

        return result;

    }
    
}
