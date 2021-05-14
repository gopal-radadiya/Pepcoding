import java.io.*;
import java.util.*;

public class AllPalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }

    public static void solution(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String temp = str.substring(i,j);
                if(isPalindrome(temp)==true)
                    System.out.println(temp);
            }
        }
    }

    public static boolean isPalindrome(String temp){
        int left = 0;
        int right = temp.length()-1;
        while(left<=right){
            char fwd = temp.charAt(left);
            char bwd = temp.charAt(right);
            if(fwd!=bwd)
                return false;
            left++;
            right--;
        }
        return true;
    }
}