import java.io.*;
import java.util.*;

public class MaxOfArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int ans = findMax(arr,0);
        System.out.println(ans);
    }

    public static int findMax(int[] arr,int i){
        if(i==arr.length-1) return arr[i];
        int mx = findMax(arr,i+1);
        if(mx>arr[i])
            return mx;
        else
            return arr[i];
    }
}