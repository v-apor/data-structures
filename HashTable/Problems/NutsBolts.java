//problem: https://practice.geeksforgeeks.org/problems/nuts-and-bolts-problem/0

import java.util.HashSet;
//import java.util.StringBuilder;
import java.util.Scanner;
public class NutsBolts{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases = Integer.parseInt(sObj.nextLine());
        char[] all = "!#$%&*@^~".toCharArray();
        for(int z=0; z<cases; z++){
            StringBuilder SB = new StringBuilder();
            char[] nuts = sObj.nextLine().toCharArray();
            char[] bolts = sObj.nextLine().toCharArray();
            HashSet<Character> hSet = new HashSet<Character>();
            for(char ch: nuts){
                hSet.add(ch);
            }
            for(char chk: all){
                if(hSet.contains(chk)){
                    SB.append(chk + " ");
                }
            }
            System.out.println(hSet);
            System.out.println(SB);
            System.out.println(SB);
        }
    }
}