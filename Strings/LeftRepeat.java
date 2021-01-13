// Problem: Find the left most character of a string that repeats

/*
Approach:
    -> for each character, traverse through the entire string to find repeating element
        - Time O(n^2)  | auxilary space O(1)

    -> Other way is to have an auxilary array storing frequency of each characters (pass 1)
       on second pass, check if an element is having frequency > 1, return it 
       - Time O(n) | auxilary space O(n)

    -> Other way would be to utilize the fact that a string consists of only 256 characters
        <I could'nt find the solution>
*/
public class LeftRepeat{
    public static void main(String[] args){
        String str = "javvac";
        int[] arr = new int[256];
        for(char ch: str.toCharArray()) arr[ch]++;
        for(char ch2: str.toCharArray()){
            if(arr[ch2] > 1){
                System.out.println(ch2);
                break;
            }
        }
    }
}