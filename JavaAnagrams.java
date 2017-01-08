import java.io.*;
import java.util.*;

public class JavaAnagrams {    

    static boolean isAnagram(String a, String b) {
        //Removing all white spaces from a and b
        String s1 = a.replaceAll("\\s", "");
        String s2 = b.replaceAll("\\s", "");
        //If the length of the two strings is not equal now then they are not anagrams.
        if (a.length()!=b.length()){
            return false;
        }
        //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
        //Sorting both s1Array and s2Array
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        
        if (Arrays.equals(s1Array, s2Array)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
