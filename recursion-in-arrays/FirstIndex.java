import java.io.*;
import java.util.*;

public class FirstIndex {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int val = sc.nextInt();
        int ans = firstIndex(arr,val,0);
        System.out.println(ans);
    }

    public static int firstIndex(int[] arr,int val,int i){
        if(i==arr.length) return -1;
        else if(arr[i]==val) return i;
        return firstIndex(arr,val,i+1);
    }
}