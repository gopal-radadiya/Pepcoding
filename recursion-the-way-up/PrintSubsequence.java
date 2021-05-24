import java.io.*;
import java.util.*;

public class PrintSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printss(str,"");
    }

    public static void printss(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printss(ros,ans+ch);
        printss(ros,ans);
    }
}