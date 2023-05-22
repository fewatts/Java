package testes_processo_seletivo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HrStrToken {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        if(!in.hasNext()){
            System.out.println(0);
        }else{
            String input = in.nextLine();
            String[] a = input.trim().split("[ !,?._'@]+");
            ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList(a));
            System.out.println(listOfStrings.size());

            listOfStrings.forEach(str -> {
                System.out.println(str);
            });

        }

    }

}
