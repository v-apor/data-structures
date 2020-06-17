// ArrayList is a dynamic array
//we can Add Items (lst.add(item)), Access an Item (lst.get(index)), Change an Item (lst.set(index,item)),
// Remove an Item (lst.remove(index)/lst.clear()), get ArrayList Size(lst.size()),
// Sort an ArrayList (Collections.sort(lst)) using java.util.Collections


import java.util.ArrayList;
import java.util.Collections;
public class DynamicArray{
    public static void main(String[] args){
        ArrayList<Integer> aLst = new ArrayList<Integer>();
        aLst.add(14);
        aLst.add(61);
        aLst.add(75);
        System.out.println(aLst);       //one cool thing about arraylist is that we can print it
        aLst.set(2,0);
        System.out.println(aLst);
        Collections.sort(aLst);        
        System.out.println("Size: " + aLst.size());
        System.out.println(aLst);
        aLst.remove(2);
        System.out.println(aLst);
    }
}