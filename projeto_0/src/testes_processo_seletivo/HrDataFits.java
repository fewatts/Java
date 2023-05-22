package testes_processo_seletivo;

import java.util.Scanner;

public class HrDataFits {
    static String fitDataType(String numString) {
        String answer = "";
        try {
            long num = Long.parseLong(numString);
            answer = numString + " can be fitted in:\n";
            if ((num <= Byte.MAX_VALUE) && (num >= Byte.MIN_VALUE)) {
                answer = answer.concat("¬¬ byte\n¬¬ short\n¬¬ int\n¬¬ long");
            } else if ((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)) {
                answer = answer.concat("¬¬ short\n¬¬ int\n¬¬ long");
            } else if ((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)) {
                answer = answer.concat("¬¬ int\n¬¬ long");
            } else {
                answer = answer.concat("¬¬ long");
            }
        } catch (NumberFormatException e) {
            answer = numString + " can't be fitted anywhere (primitive Types).";
        }
        return answer;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Number of tests:");
        int testTimes = sc.nextInt();
        for(int i = 0; i < testTimes; i++){
            System.out.println("Enter the number for test:");
            String stringNum = sc.next();
            System.out.println(fitDataType(stringNum));
        }

    }

}
