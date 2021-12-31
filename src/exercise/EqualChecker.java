package exercise;

public class EqualChecker {
    public static void main (String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1,2, 3));
        System.out.println(hasEqualSum(-1,1,0));
    }
    public static boolean hasEqualSum (int one, int two, int three) {
        if ((one + two) == three) {
            return true;
        } else {
            return false;
        }
    }
}
