package BuffriderReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffDemo {
    public static void main(String[] args)throws Exception {
        BufferedReader b=new BufferedReader(new FileReader("/Users/mdhaque/IdeaProjects/Class10/src/textfile"));
        String a;
        while ((a= b.readLine())!=null){
            System.out.println(a);
        }
    }
}
