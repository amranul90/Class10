package MapTest;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> h=new HashMap<>();
        h.put(" Emp1 "," hasan ");
        h.put(" Emp2 " , " mike ");
        h.put(" Emp3 " , " Noman ");

        for (Map.Entry<String,String> m: h.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
