// problem: return the first recurring character from an array
// Using HashSet here:

import java.util.HashSet;
public class FirstRecurring{

    public static char getFirst(char[] arr){
        HashSet hSet = new HashSet();
        for(char ch: arr){              // O(n) : Eg if nothing recurrs
            if(hSet.contains(ch)){
                return ch;
            }
            hSet.add(ch);
        }
        return '~';
    }

    public static void main(String[] args){
        char[] arr = "aeioua".toCharArray();
        char[] arr1 = "aeiou szd".toCharArray();
        System.out.println(getFirst(arr));
        System.out.println(getFirst(arr1));
    }
}