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
        } while (!sorted);
        return result;
    }
}
