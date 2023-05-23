package testes_processo_seletivo;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HrRegexCompile {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int cases = Integer.parseInt(in.nextLine());
        while (cases > 0) {
            cases--;
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

        }

    }

}
