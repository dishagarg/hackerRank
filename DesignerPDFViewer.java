import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Input Format:
The first line contains  space-separated integers describing the respective heights 
of each consecutive lowercase English letter (i.e., ). 
The second line contains a single word, consisting of lowercase English alphabetic letters.

Output Format:
Print a single integer denoting the area of highlighted rectangle when the given word is selected. 
The unit of measurement for this is square millimeters (), but you must only print the integer.
*/

public class DesignerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int[] max = new int[26];

        for (int i = 0; i < word.length(); i++)
        {
            char tempChar = word.charAt(i);
            max[tempChar-97] =1;
            max[tempChar-97] *= h[tempChar-97];
        }
        Arrays.sort(max);
        System.out.println(max[max.length-1]*word.length());
        
    }
}
