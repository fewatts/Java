package codewars;

public class PinValidator {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}") && pin.matches("\\d+");
    }

}
