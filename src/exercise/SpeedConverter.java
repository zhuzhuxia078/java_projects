package exercise;

public class SpeedConverter {
    // this is a  speed converter method can convert km/hr to mi/hr;
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;

        else if (kilometersPerHour > 0) {
            // calculate the value of miles per hour, round it and return it
            return Math.round(kilometersPerHour/1.609);
        }

        else {
            return 0;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long perMile = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " +  perMile + " mi/h");
        }
    }
}
