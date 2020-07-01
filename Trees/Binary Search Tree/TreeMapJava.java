import java.util.TreeMap;
import java.util.Map;

public class TreeMapJava{
    public static void main(String[] args){
        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
        // Inserting element
        tMap.put(14,"Apoorv");
        tMap.put(75, "Null");
        tMap.put(0, "Oreo");
        // The elements are put on BST sorted on the basis of key
        System.out.println(tMap);
        // Checking if key exists O(logN)
        System.out.println(tMap.containsKey(61));
        // Check if a value exists O(N) (I assume)
        System.out.println(tMap.containsValue("Apoorv"));
        // traversing   <Something New to me>   //checkout HashMap section for more
        for(Map.Entry e: tMap.entrySet()){          
            System.out.print(e.getKey() + " " + e.getValue() + "; ");
        }
    }
}