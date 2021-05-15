import java.io.*;
import java.util.*;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printasc(n);
    }

    public static void printasc(int n){
        if(n==0) return;
        printasc(n-1);
        System.out.println(n);
    }
}