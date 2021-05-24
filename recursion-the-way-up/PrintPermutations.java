import java.io.*;
import java.util.*;

public class PrintPermutations {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(i);
            String ros = sb.toString();
            printPermutations(ros,ans+ch);
        }
    }
}