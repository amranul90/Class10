package BuffriderReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BuffRedClass {
    public static void main(String[] args)throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String w;
        System.out.println("Enter lines of text :");
        System.out.println("Enter 'end' to quit");
        do {
            w=br.readLine();
            System.out.println(w);

        }
            while (!w.equals("end"));

    }
}
