public final class StringUtils {
    private StringUtils() {
    }

    public interface Comparator {
        int compare(String a, String b);
    }

    private static String[] suboptimalBubbleSort(String[] source, Comparator comparator) {
        String[] result = source.clone();
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0, j = 1; j < result.length; i++, j++) {
                if (comparator.compare(result[i], result[j]) > 0) {
                    sorted = false;
                }
            }
        } while (!sorted);
        return result;
    }
}
