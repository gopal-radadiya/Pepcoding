import java.io.*;
import java.util.*;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of disk
        int src = sc.nextInt();
        int dest = sc.nextInt();
        int helper = sc.nextInt();
        toh(n,src,dest,helper);
    }

    public static void toh(int n,int src,int dest,int helper){
        if(n==0) return;
        toh(n-1,src,helper,dest);
        System.out.println(n + "[" + src + " -> " + dest + "]");
        toh(n-1,helper,dest,src);
    }
}