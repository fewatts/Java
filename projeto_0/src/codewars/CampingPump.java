package codewars;

public class CampingPump {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        return (mpg * fuelLeft) >= distanceToPump;

    }

}
