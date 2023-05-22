package testes_processo_seletivo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class HrMoneyFormat {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double payment = scanner.nextDouble();
        
        Locale INDIA = new Locale("en", "IN");
        
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
    
}
