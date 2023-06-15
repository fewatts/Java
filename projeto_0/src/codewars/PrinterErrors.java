package codewars;

public class PrinterErrors {
    public static String printerError(String s) {
        int errors = 0;

        for(char c : s.toCharArray()){
            if(c < 'a' || c > 'm')
                errors++;
        }
        return errors + "/" + s.length();
    }

}
