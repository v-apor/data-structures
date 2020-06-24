//problem: https://codeforces.com/problemset/problem/4/C

import java.util.Scanner;
import java.util.HashMap;
public class Registration{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        int cases = sObj.nextInt();sObj.nextLine();
        for(int z=0; z<cases; z++){
            String s = sObj.nextLine();
            if(hMap.containsKey(s)){
                System.out.println(s + hMap.get(s));
                hMap.put(s, hMap.get(s) + 1);
            }
            else{
                hMap.put(s, 1);
                System.out.println("OK");
            }
        }
    }
}