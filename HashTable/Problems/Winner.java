//problem: https://codeforces.com/problemset/problem/2/A

// :Incomplete: This is coded only for two players; But I got to learn about hash maps

import java.util.Scanner;
import java.util.HashMap;
public class Winner{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        int nos = Integer.parseInt(sObj.nextLine());
        String lastPosName = new String();
        for(int z=0; z<nos; z++){
            String[] input = sObj.nextLine().split(" ");
            if(hMap.containsKey(input[0])){
                hMap.replace(input[0],hMap.get(input[0]) + Integer.parseInt(input[1]));
            }
            else{
                hMap.put(input[0], Integer.parseInt(input[1]));
            }
            if(Integer.parseInt(input[1]) > 0){
                lastPosName = input[0];
            }
        }
        //System.out.println(hMap + "\nlastpos: " + lastPosName);
        int x=0;
        String[] names = new String[2];
        for(String str: hMap.keySet()){
            names[x++] = str;
            //System.out.println("name: " + names[x-1]);
        }
        if(hMap.get(names[0]) > hMap.get(names[1])){
            System.out.println(names[0]);
            return;
        }
        else if(hMap.get(names[0]) < hMap.get(names[1])){
            System.out.println(names[1]);
            return;
        }
        else{
            if(names[0].equals(lastPosName)){
                System.out.println(names[1]);
            }
            else{
                System.out.println(names[0]);
            }
        }
    }
    
}