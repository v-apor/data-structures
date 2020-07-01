import java.util.TreeSet;
public class TreeSetJava{
    public static void main(String[] args){
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        // Adding elements
        tSet.add(61);
        tSet.add(75);
        tSet.add(14);
        tSet.add(14);
        System.out.println(tSet);
        // first element of tree (sorted/ smallest)
        System.out.println(tSet.first());
        // check if an element exists O(logN)
        System.out.println(tSet.contains(14));
        // return largest element
        System.out.println(tSet.last());
        // delete value
        tSet.remove(61);
        System.out.println(tSet);
        tSet.add(66);
        // tree traversal
        for(int ele: tSet){
            System.out.print(ele + " ");
        }
    }
}