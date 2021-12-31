package exercise;

public class TeenNumberChecker {
    public static void main (String[] args) {
        System.out.println(hasTeen(12,15,90));
        System.out.println(hasTeen(11,50,30));
    }
    public static boolean hasTeen(int one, int two, int three) {
        return (isTeen(one) || isTeen(two) || isTeen(three));
    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
