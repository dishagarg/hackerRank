import java.io.*;
import java.util.*;

/*
Input Format:
The first line contains a string A. The second line contains another string B. 
The strings are comprised of only lowercase English letters.

Output Format:
There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/

public class StringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1)+" "+Character.toUpperCase(B.charAt(0)) + B.substring(1));
        
    }
}
