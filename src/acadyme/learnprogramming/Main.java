package acadyme.learnprogramming;

import exercise.DicimalComparator;
import exercise.LeapYear;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMin = Integer.MIN_VALUE;
        int myMax = Integer.MAX_VALUE;
        System.out.println("Minimum = " + myMin);
        System.out.println("Maximum = " + myMax);
        LeapYear.isLeapYear(2020);
    }
}
