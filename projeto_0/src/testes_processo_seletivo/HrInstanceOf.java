package testes_processo_seletivo;

import java.util.ArrayList;
import java.util.Scanner;

class Rockstar{}
class Student{}
class Hacker{}

public class HrInstanceOf {

    static Scanner in = new Scanner(System.in);
    
    public static String Count(ArrayList<Object> list){
        int a = 0, b = 0, c = 0;

        for(int i = 0; i < list.size(); i++){

            Object element = list.get(i);
            
            if(element instanceof Student)
               a++;
            if(element instanceof Rockstar)
               b++;
            if(element instanceof Hacker)
               c++;
        }
        return Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
    }
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();

        int exe = in.nextInt();
        
        for(int i = 0; i < exe; i++){
            String str = in.next();
            if(str.equals("student"))
                list.add(new Student());
            if(str.equals("hacker"))
                list.add(new Hacker());
            if(str.equals("rockstar"))
                list.add(new Rockstar());
        }
        System.out.println(Count(list));
    }

}
