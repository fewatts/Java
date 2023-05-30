package testes_processo_seletivo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HrUserName {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String username = in.nextLine();
            String pattern = "^[a-zA-Z]{1,1}[a-zA-Z0-9_]{7,29}$";
            Pattern r = Pattern.compile(pattern);
            Matcher match = r.matcher(username);
            if(match.find()){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            testCases--;
        }

    }

}
