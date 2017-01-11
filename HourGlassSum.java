import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlassSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        // User Input: There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array of 6x6. 
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        // The input array has 16 hourglasses in it. Find the sum of all.
        int[] sum = new int[16];
        int k=0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                sum[k] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                k++;
            }
        }
        // Find the maximum sum.
        Arrays.sort(sum);
        System.out.print(sum[15]);
    }
}
