package testes_processo_seletivo;

import java.util.Scanner;

interface AdvancedArithmetic {
    public abstract int divisorSum(int input);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int input) {
        int a = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                a += i;
            }

        }
        return a;
    }

}

public class HrInterface {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] argh) {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        // ImplementedInterfaceNames(my_calculator);
        int n = in.nextInt();
        System.out.print(my_calculator.divisorSum(n) + "\n");

    }
    // static void ImplementedInterfaceNames(Object o) {

    //     Class[] theInterfaces = o.getClass().getInterfaces();
    //     for (int i = 0; i < theInterfaces.length; i++) {
    //         String interfaceName = theInterfaces[i].getName();
    //         System.out.println(interfaceName);
    //     }

    // }

}
