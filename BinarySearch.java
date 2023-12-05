import java.util.List;
import java.util.Random;

public class BinarySearch {
    public static int binarySearch(Comparable[] list, Comparable target) {
        int start = 0, end = list.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (list[mid].compareTo(target) == 0) {
                return mid;
            } else if (target.compareTo(list[mid]) < 0) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        System.out.println(binarySearch(numbers, 1));
    }
}