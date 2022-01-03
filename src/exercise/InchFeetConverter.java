package exercise;

public class InchFeetConverter {
    public static void main (String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(10,2));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 && inches > 12)) {
            return -1;
        } else {
            double cen = ( feet * 12 + inches ) * 2.54;
            return cen;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) inches / 12;
            double newInches = inches % 12;
            System.out.println("newInches: " + newInches);
            System.out.println("feet: " + feet);
            return calcFeetAndInchesToCentimeters(feet, newInches);
        }
    }
}
