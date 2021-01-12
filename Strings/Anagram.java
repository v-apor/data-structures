// Time O(nlogn)
// Time O(n)
import java.util.Arrays;
public class Anagram{
    public static void main(String[] args){
        String s1 = "javacy";
        String s2 = "vajasc";
        // METHOD I
        // boolean isAna = true;
        // if(s1.length() != s2.length()) System.out.println("NO");
        // else{
        //     char[] input1 = s1.toCharArray();
        //     Arrays.sort(input1);
            
        //     char[] input2 = s2.toCharArray();
        //     Arrays.sort(input2);

        //     for(int i=0; i<input1.length; i++){
        //         if(input1[i] != input2[i]){
        //             isAna = false;
        //             break;
        //         }
        //     }
        //     if(isAna) System.out.println("YES");
        //     else System.out.println("NO");

        // METHOD II
        int[] freq = new int[256];
        for(char ch: s1.toCharArray()) freq[ch]++;
        for(char ch2: s2.toCharArray()) freq[ch2]--;

        boolean isAna = true;
        for(int i=0; i<256; i++){
            if(freq[i] != 0){
                isAna = false;
                break;
            }
        }
        if(isAna) System.out.println("YES");
        else System.out.println("NO");
    }
}