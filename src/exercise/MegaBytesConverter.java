package exercise;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int XX = kiloBytes;

        if ( XX < 0 ) {
            System.out.println("Invalid Value");
        } else {
            int YY = XX / 1024;
            int ZZ = XX % 1024;
            System.out.print( XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }

    }
}
