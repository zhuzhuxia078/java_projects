package exercise;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double one, double two) {
        return (int) (one * 1000) == (int) (two * 1000);
    }
}
