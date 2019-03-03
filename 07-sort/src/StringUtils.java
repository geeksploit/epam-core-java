public final class StringUtils {
    private StringUtils() {
    }

    public interface Comparator {
        int compare(String a, String b);
    }

    public static String[] sortArray(String[] source, Comparator comparator) {
        return suboptimalBubbleSort(source, comparator);
    }

    public static int compareToAsExcell(String first, String second) {
        return 0;
    }

    /**
     * A quick and dirty Bubble Sort implementation off the top of my head. No optimization
     * efforts attempted as its only purpose is to serve as a minimum viable sort provider.
     *
     * @param source     an array to sort.
     * @param comparator an agent to determine entities order.
     * @return a copy of the source array sorted in the given order.
     */
    private static String[] suboptimalBubbleSort(String[] source, Comparator comparator) {
        String[] result = source.clone();
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0, j = 1; j < result.length; i++, j++) {
                if (comparator.compare(result[i], result[j]) > 0) {
                    swap(result, i, j);
                    sorted = false;
                }
            }
        } while (!sorted);
        return result;
    }

    private static void swap(String[] arr, int leftIndex, int rightIndex) {
        String stash = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = stash;
    }
}
