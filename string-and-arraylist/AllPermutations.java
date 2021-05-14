import java.io.*;
import java.util.*;

public class AllPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++)
            fact = fact*i;
        return fact;
    }

    public static void solution(String str){
        int fact = factorial(str.length());

        for(int i=0;i<fact;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int j=str.length();j>0;j--){
                int rem = temp%j;
                temp = temp/j;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
            }
            System.out.println();
        }
    }
}