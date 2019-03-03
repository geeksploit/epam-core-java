public final class StringUtils {
    private StringUtils() {
    }

    public interface Comparator {
        int compare(String a, String b);
    }
}
