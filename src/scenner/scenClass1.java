package scenner;

import java.util.Scanner;

public class scenClass1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("what is your name");
        String name=s.next();
        System.out.println("what is your age");
        int age=s.nextInt();
        System.out.println("where are you from");
        String country=s.next();
    }
}
