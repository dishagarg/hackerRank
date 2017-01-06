import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Input Format:

The first line contains two space-separated integers denoting the respective values of s and t. 
The second line contains two space-separated integers denoting the respective values of a and b. 
The third line contains two space-separated integers denoting the respective values of m and n. 
The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a. 
The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

Output Format:

Print two lines of output:
On the first line, print the number of apples that fall on Sam's house.
On the second line, print the number of oranges that fall on Sam's house.
*/


public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int count_apples=0 , count_oranges =0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            apple[apple_i] += a;
            if(apple[apple_i] >= s && apple[apple_i]<= t) {
                count_apples++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            orange[orange_i] += b;
            if(orange[orange_i] >= s && orange[orange_i]<= t) {
                count_oranges++;
            }
        }
        System.out.println(count_apples);
        System.out.println(count_oranges);
    }
}
