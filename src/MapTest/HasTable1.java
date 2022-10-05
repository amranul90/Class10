package MapTest;

import java.util.Hashtable;
import java.util.Map;

public class HasTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> s=new Hashtable<>();
        s.put(1,"gorge");
        s.put(2,"amran");
        s.put(3,"hasan");
        s.remove(2,"amran");

        for (Map.Entry<Integer,String> k:s.entrySet()){
            System.out.println(k.getKey() +  " " + k.getValue());
        }
    }
}
