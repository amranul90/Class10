package MapTest;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        Map<Integer,String> l=new HashMap<>();
        l.put(1,"mike");
        l.put(3,"tanzi");
        for (Map.Entry<Integer,String>p:l.entrySet()){
            System.out.println(p.getKey() + " " + p.getValue());
        }
    }
}
