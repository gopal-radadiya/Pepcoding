import java.io.*;
import java.util.*;

public class PrintEncodings {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str,"");
    }

    public static void printEncodings(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.length()==1){
            char ch1 = str.charAt(0);
            if(ch1=='0') return;
            else{
                char chcode = (char)(ch1-48+96);
                System.out.println(ans + chcode);
                return;
            }
        }
        else if(str.length()>=2){
            char ch1 = str.charAt(0);
            String ros1 = str.substring(1);
            if(ch1=='0') return;
            else{
                char ch1code = (char)(ch1-48+96);
                printEncodings(ros1,ans+ch1code);
            }
            String ch12 = str.substring(0,2);
            String ros2 = str.substring(2);
            int ch12val = Integer.parseInt(ch12);
            if(ch12val<=26){
                char ch12code = (char)(ch12val+96);
                printEncodings(ros2,ans+ch12code);
            }
        }
    }
}