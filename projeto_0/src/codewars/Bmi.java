package codewars;

public class Bmi {
    public static String bmi(double weight, double height) {
        double calc = weight / (height * height);

        if (calc <= 18.5)
            return "Underweight";

        else if (calc <= 25)
            return "Normal";

        else if (calc <= 30)
            return "Overweight";
            
        else
            return "Obese";

    }

}
