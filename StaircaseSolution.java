import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaircaseSolution {
    
    /*
    * Creating a staircase of #.
    */
     static void StairCase(int n) {
        for(int j=n; j>0; j--) {
            for(int i=j-1; i>0; i--) {
                System.out.print(" ");
            }
            //System.out.println("$");
            for(int k=0;k<n-j+1;k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(_n);
    }
}

