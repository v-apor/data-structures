import java.util.HashMap;

public class HashMapJava{
    public static void main(String[] args){
        HashMap hMap = new HashMap();
        // or we can use:
        // HashMap<Key_DataType, Value_DataType> hMap_name = new HashMap<Key_DataType, Value_DataType>();
        // if we know what type of data is going to be entered;

        // Insert a key value pair
        hMap.put("age",23);
        hMap.put(2, 4);
        hMap.put("name","Apoorv");
        System.out.println(hMap);
        // Fetching value using key
        System.out.println(hMap.get("name"));
        System.out.println(hMap);

        //removing item using key
        hMap.remove(2);
        System.out.println(hMap);

        // size of hashMap
        System.out.println(hMap.size());

        // Checking if value/key exists
        System.out.println(hMap.containsValue("Apoorv"));
        System.out.println(hMap.containsKey("agg"));

        // looping through HashMap keys
        // Note here i've used Object because previously I haven't specified datatype see line 6-8
        for(Object s: hMap.keySet()){
            System.out.println("Key: " + s);
        }

        // looping through values
        for(Object val: hMap.values()){
            System.out.println("Value: " + val);
        }
    }
}