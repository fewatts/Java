package testes_processo_seletivo;

import java.util.Scanner;

abstract class Book {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

class MyBook extends Book {
    public void setTitle(String title) {
        this.title = title;
    }

}

public class HrAbstractClass {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String title = sc.nextLine();
        MyBook book = new MyBook();
        book.setTitle(title);
        System.out.println("The title is: " + book.getTitle());

    }

}
