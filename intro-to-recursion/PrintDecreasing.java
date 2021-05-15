import java.io.*;
import java.util.*;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdesc(n);
    }

    public static void printdesc(int n){
        if(n==0) return;
        System.out.println(n);
        printdesc(n-1);
    }
}