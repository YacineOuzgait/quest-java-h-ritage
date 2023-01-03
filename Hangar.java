public class Hangar {
    public static void main(String[] args){

        Car carOne = new Car("Ferrari", 300);
        Boat boatOne = new Boat("Zodiac", 24);

        System.out.println("1. " + carOne.doStuff());
        System.out.println("2. " + boatOne.doStuff());
    }
}
