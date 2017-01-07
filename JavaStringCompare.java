import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = sc.nextInt();
        String[] str_arr = new String[str.length()-len+1];
        for(int i=0; i<=str.length()-len; i++) {
            str_arr[i] = (str.substring(i,i+len));
        }
        /* Lexicographically sort an array of strings. */
        Arrays.sort(str_arr);
        
        /* 
        Lexicographically sort an array of strings in a reverse order. 
        Arrays.sort(str_arr, Collections.reverseOrder()); 
        */
        
        // System.out.println(Arrays.toString(str_arr));
        System.out.println("Lexicographically minimun substring: "+ str_arr[0]);
        System.out.println("Lexicographically maximum substring: "+ str_arr[str.length()-len]);
    }
}
