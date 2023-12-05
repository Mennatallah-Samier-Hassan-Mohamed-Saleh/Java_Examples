public class Sorting {
    public static void selectionSort (Comparable[] list) {
        int minIndex;
        Comparable nextSmallest;

        for (int unSortedStart = 0; unSortedStart < list.length-1; unSortedStart++) {
            minIndex = unSortedStart;
            for (int currentIndex = unSortedStart+1; currentIndex < list.length; currentIndex++) {
                if (list[currentIndex].compareTo(list[minIndex]) < 0) {
                    minIndex = currentIndex;
                }
            }

            if (minIndex != unSortedStart) {
                nextSmallest = list[minIndex];
                list[minIndex] = list[unSortedStart];
                list[unSortedStart] = nextSmallest;
            }
        }
    }
    public static void insertionSort (int[] list) {
        for (int unSortedStart = 1; unSortedStart < list.length; unSortedStart++) {
        int nextInsert = list[unSortedStart];
        int currentIndex = unSortedStart -1;

            while ( currentIndex >= 0 && list[currentIndex] > nextInsert) {
                list[currentIndex] = list[currentIndex];
                currentIndex --;
            }
            list[currentIndex] = nextInsert;
        }
    }
    private static void merge(int[] list, int leftHalfStart, int rightHalfStart, int end) {
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;

        int[] leftHalf = new int[leftHalfSize];
        int[] rightHalf = new int[rightHalfSize];

        for (int i = 0; i < leftHalfSize; ++i)
            leftHalf[i] = list[leftHalfStart + i];
        for (int j = 0; j < rightHalfSize; ++j)
            rightHalf[j] = list[rightHalfStart + 1 + j];

        int i = 0;
        int j = 0;

        int k = leftHalfStart;
        while (i < leftHalfSize && j < rightHalfSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalfSize) {
            list[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalfSize) {
            list[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] list, int start, int end) {
        if (start == end) {
            return;
        } else if (start == end - 1) {
            if (list[start] <= list[end]) {
                return;
            } else { // swap
                int temp = list[start];
                list[start] = list[end];
                list[end] = temp;
            }
        }

        int mid = (end - start) / 2;
        mergeSort(list, start, start + mid);
        mergeSort(list, start + mid + 1, end);
        merge(list, start, start + mid, end);

    }

    public static void main(String[] args) {
        int[] arr = { 5, 12, 1, 3, 7 };

        long start = System.nanoTime();
        mergeSort(arr, 0, 4); // you can change this to any code block to collect its runtime
        long end = System.nanoTime();
        System.out.println("Elapsed time in ns:" + (end - start));
    }

}
