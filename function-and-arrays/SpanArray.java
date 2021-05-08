import java.io.*;
import java.util.*;

public class SpanArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        int mx = arr[0];
        int mn = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>mx)
                mx = arr[i];
            if(arr[i]<mn)
                mn = arr[i];
        }
        System.out.println(mx-mn);
    }
}