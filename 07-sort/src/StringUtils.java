import java.util.SortedMap;
import java.util.TreeMap;

public final class StringUtils {
    private StringUtils() {
    }

    public interface Comparator {
        int compare(String first, String second);
    }

    public static String[] sortArray(String[] source, Comparator comparator) {
        return suboptimalBubbleSort(source, comparator);
    }

    /**
     * Compares two strings in alphabetical order. Lowercase characters precede or follow
     * respective uppercase characters depending on source order. Shorter strings precede
     * longer ones if their overlapping parts match.
     *
     * @param first  the first of two strings to be compared.
     * @param second a string to be compared with the first one.
     * @return 0 if the sequences match;
     * a negative value if the first sequence precedes the second one;
     * a positive value otherwise.
     */
    public static int compareToAsExcell(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();
        int length = Math.min(first.length(), second.length());
        for (int i = 0; i < length; i++) {
            int diff = first.charAt(i) - second.charAt(i);
            if (diff != 0) {
                return diff;
            }
        }
        return first.length() - second.length();
    }

    /**
     * Compares two strings in dictionary order. Lowercase characters always follow respective
     * uppercase characters for equally long strings as it is usual in dictionaries. Shorter
     * strings precede longer ones if their overlapping parts match.
     *
     * @param first  the first of two strings to be compared.
     * @param second a string to be compared with the first one.
     * @return 0 if the sequences match;
     * a negative value if the first sequence precedes the second one;
     * a positive value otherwise.
     */
    public static int compareToAsHuman(String first, String second) {
        int alphabeticalOrder = compareToAsExcell(first, second);

        if (alphabeticalOrder == 0) {
            for (int i = 0; i < first.length(); i++) {
                if (Character.isLowerCase(first.charAt(i))
                        && Character.isUpperCase(second.charAt(i))) {
                    return 1;
                }
            }
        }

        return alphabeticalOrder;
    }

    public static int compareToAsJavaMap(String first, String second) {
        SortedMap<String, Object> sortedMap = new TreeMap<>();
        sortedMap.put(first, null);
        sortedMap.put(second, null);
        return first.equals(sortedMap.firstKey()) ? -1 : 1;
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
