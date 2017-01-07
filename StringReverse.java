import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int len = A.length();
        int count = 0;
        
        /* Check if a palindrome or not. */
        for(int i=0,j=len-1; i<len; i++,j--) {
            if(A.charAt(i)!= A.charAt(j)){
                System.out.println("No");
                break;
            }
            count++;
        }
        if(count>0){
            System.out.println("Yes");
        }
    }
}
