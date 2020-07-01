import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
public class Brackets{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        Stack<Character> stk = new Stack<Character>();

        HashMap<Character, Character> bktList = new HashMap<Character, Character>();
        bktList.put(')','('); bktList.put(']','['); bktList.put('}','{');
        HashSet<Character> bktLeft = new HashSet<Character>();
        bktLeft.add('('); bktLeft.add('['); bktLeft.add('{');

        char[] arr = sObj.nextLine().toCharArray();
        for(char ch: arr){
            if(bktLeft.contains(ch)){
                stk.push(ch);
            }
            else if(stk.empty()){
                    System.out.println("Incorrect Sequence!");
                    return;
            }
            else if(bktList.get(ch) != stk.peek()){
                System.out.println("Checking: " + bktList.get(ch) + " and " + stk.peek());
                System.out.println("Incorrect Sequence!");
                return;
            }
            else{
                stk.pop();
            }
        }
        if(!stk.empty()){
            System.out.println("Incorrect Sequence!");
        }
        else{
            System.out.println("Correct Sequence!");
        }
    }
}