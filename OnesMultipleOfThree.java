import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class OnesMultipleOfThree {

    static int check(int y, int digits) {
        int count=0, r;
        for(int j=0; j<digits; j++) {
            r = y%10;
            if (r==1) {
                y=y/10;
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // Given a number (x) ending with 3 find its least multiple which is all 1. //
        int x = 33;
        int y, check;
        for(int i=0; ;i++) {
            y = i*x;
            int digits = (int)(Math.log10(y)+1);
            check = check(y, digits);
            if(check == digits) {
                System.out.println(y);
                break;
            }
        }
    }
}
