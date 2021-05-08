import java.io.*;
import java.util.*;

public class FirstAndLastIndex {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        int val = sc.nextInt();

        int first = firstIndex(arr,val);
        System.out.println(first);
        int last = lastIndex(arr,val);
        System.out.println(last);
    }

    public static int firstIndex(int[] arr,int val){
        int left = 0;
        int right = arr.length-1;
        int res = -1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==val) {
                res = mid;
                right = mid-1;
            }
            else if(arr[mid]>val)
                right = mid-1;
            else if(arr[mid]<val)
                left = mid+1;
        }
        return res;
    }

    public static int lastIndex(int[] arr,int val){
        int left = 0;
        int right = arr.length-1;
        int res = -1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==val){
                res = mid;
                left = mid+1;
            }
            else if(arr[mid]>val)
                right = mid-1;
            else if(arr[mid]<val)
                left = mid+1;
        }
        return res;
    }
}