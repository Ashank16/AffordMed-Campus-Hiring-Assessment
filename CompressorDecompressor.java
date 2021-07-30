import java.io.*;
import java.util.*;

public class CompressorDecompressor {
    public static String compression (String str) {
        String s = str.substring(0,1);
        int count = 1;
        
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            
            //if current and previous char are equal then increase count
            if (curr == prev) {
                count++;
            } 
            //else add count if count > 1 and reset count to 1,
            //then add the current char to the string 's'
            else {
                if (count > 1) {
                    s += count;
                    count = 1;
                }

                s += curr;
            }
        }
        
        //at the end of string if count > 1 then add it else don't add
        if (count > 1) {
            s += count;
            count = 1;
        }

        return s;
    }

    public static String decompression (String str) {
        String s = str.substring(0,1);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            String typeCheck = str.charAt(i).getClass().getSimpleName();
            if (typeCheck == "Integer") {
                int itr = parseInt(typeCheck);
                count = 1;
                for (int i = 1; i < itr; i++) {

                }
            }
            else if (typeCheck == "String") {
                s += ch;
            }
        }

    }

    public static void main(String[] args) throws Exception  {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression(str));
    }
}
