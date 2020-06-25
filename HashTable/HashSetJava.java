import java.util.HashSet;

public class HashSetJava{
    public static void main(String[] args){
        HashSet hSet = new HashSet();
        // or we can specify datatype if known
        // i.e, HashSet<Integer> hSet = new HashSet<Integer>();

        // Adding Elements
        hSet.add("Apoorv");
        hSet.add(14);
        // Adding Duplicate (No Effect)
        hSet.add(14);
        hSet.add('V');
        // Note that its unordered and random
        System.out.println(hSet);
        // Removing Elements
        hSet.remove("Apoorv");
        System.out.println(hSet);
        // Checking if element exists
        System.out.println(hSet.contains('V'));
        // Checking size
        System.out.println(hSet.size());
        // Checking if its empty
        System.out.println(hSet.isEmpty());
    }
}