import java.util.HashMap;

public class HashMapJava{
    public static void main(String[] args){
        HashMap hMap = new HashMap();
        hMap.put("age",23);
        hMap.put("name",14);
        hMap.put(61,14);
        System.out.println(hMap.get(61));
        System.out.println(hMap);
    }
}