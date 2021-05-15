import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        display(arr,0);
    }

    public static void display(int[] arr,int i){
        if(i==arr.length) return;
        display(arr,i+1);
        System.out.println(arr[i]);
    }
}