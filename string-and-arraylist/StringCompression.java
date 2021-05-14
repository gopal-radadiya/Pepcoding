import java.io.*;
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

    public static String compression1(String str){
        String ans = str.charAt(0) + "";
        for(int i=1;i<str.length();i++){
            char current = str.charAt(i);
            char previous = str.charAt(i-1);

            if(current!=previous)
                ans += current;
        }
        return ans;
    }

    public static String compression2(String str){
        String ans = str.charAt(0) + "";
        int count = 1;
        for(int i=1;i<str.length();i++){
            char current = str.charAt(i);
            char previous = str.charAt(i-1);

            if(current==previous)
                count++;
            else if(count==1)
                ans += current;
            else{
                ans = ans+count+current;
                count = 1;
            }
        }

        if(count!=1)
            ans += count;
        return ans;
    }
}