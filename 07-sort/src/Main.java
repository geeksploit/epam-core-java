import java.util.Arrays;

public class Main {

    private static final String FORMAT = "%-36s - %s\n";

    public static void main(String[] args) {

        String[] arr = new String[]{
                "hell",
                "Z",
                "HE",
                "z",
                "A",
                "a",
                "Hello",
                "A"
        };

        System.out.printf(FORMAT, "source array",
                Arrays.toString(arr));

        System.out.printf(FORMAT, "custom human-like comparator",
                Arrays.toString(StringUtils.sortArray(arr, StringUtils::compareToAsHuman)));

        System.out.printf(FORMAT, "custom Excel-like comparator",
                Arrays.toString(StringUtils.sortArray(arr, StringUtils::compareToAsExcell)));

        System.out.printf(FORMAT, "built-in String::compareToIgnoreCase",
                Arrays.toString(StringUtils.sortArray(arr, String::compareToIgnoreCase)));

        System.out.printf(FORMAT, "built-in String::compareTo",
                Arrays.toString(StringUtils.sortArray(arr, String::compareTo)));

        System.out.printf(FORMAT, "built-in Java TreeMap comparator",
                Arrays.toString(StringUtils.sortArray(arr, StringUtils::compareToAsJavaMap)));

        System.out.printf(FORMAT, "built-in Java TreeMap container",
                Arrays.toString(StringUtils.sortArrayWithSortedMap(arr)));
    }
}
