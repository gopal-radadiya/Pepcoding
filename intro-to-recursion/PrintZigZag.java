import java.io.*;
import java.util.*;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0) return;
        System.out.print(n + " "); // pre
        pzz(n-1);
        System.out.print(n + " "); // in
        pzz(n-1);
        System.out.print(n + " "); // post
    }
}