import java.io.*;
import java.util.*;

public class LastIndex {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int val = sc.nextInt();
        int ans = lastIndex(arr,val,n-1);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr,int val,int i){
        if(i<0) return -1;
        else if(arr[i]==val) return i;
        return lastIndex(arr,val,i-1);
    }
}