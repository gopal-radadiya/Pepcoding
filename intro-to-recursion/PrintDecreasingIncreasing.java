import java.io.*;
import java.util.*;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdescasc(n);
    }

    public static void printdescasc(int n){
        if(n==0) return;
        System.out.println(n);
        printdescasc(n-1);
        System.out.println(n);
    }
}