import java.io.*;
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int chi = (int)ch;

            if(chi>=65 && chi<=90)
                chi = chi+32;
            else if(chi>=97 && chi<=122)
                chi = chi-32;
            sb.append((char)chi);
        }
        return sb.toString();
    }
}