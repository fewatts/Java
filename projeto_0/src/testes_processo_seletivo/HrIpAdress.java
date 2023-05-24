package testes_processo_seletivo;

import java.util.Scanner;


public class HrIpAdress {
    static Scanner in = new Scanner(System.in);
        
    public static void main(String[] args) {
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

    static class MyRegex {
        String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        String pattern = num + "." + num + "." + num + "." + num;
    }

}
