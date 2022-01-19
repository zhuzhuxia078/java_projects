package Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200","Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

        thePC.powerUp();


        // create a single room of house using composition
        // think about the things that should be included in the room
        Walls wall1 = new Walls("West");
        Walls wall2 = new Walls("East");
        Walls wall3 = new Walls("South");
        Walls wall4 = new Walls("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Mordern", 4,3,2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
