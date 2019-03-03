import java.util.Arrays;

public class Main {

    private static final String FORMAT = "%-36s - %s\n";

    public static void main(String[] args) {

        String[] arr = new String[]{
                "hell",
                "Z",
                "HE",
                "z",
                "a",
                "Hello",
                "A"
        };

        System.out.printf(FORMAT, "source array",
                Arrays.toString(arr));

        System.out.printf(FORMAT, "custom Excel-like comparator",
                Arrays.toString(StringUtils.sortArray(arr, StringUtils::compareToAsExcell)));
    }
}
