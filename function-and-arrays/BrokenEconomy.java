import java.io.*;
import java.util.*;

public class BrokenEconomy {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        int val = sc.nextInt();

        int ceilval = findCeil(arr,val);
        System.out.println(ceilval);
        int floorval = findFloor(arr,val);
        System.out.println(floorval);
    }

    public static int findCeil(int[] arr,int val){
        int left = 0;
        int right = arr.length-1;
        int res = -1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==val)
                return arr[mid];
            else if(arr[mid]>val) {
                res = mid;
                right = mid-1;
            }
            else if(arr[mid]<val)
                left = mid+1;
        }
        return arr[res];
    }

    public static int findFloor(int[] arr,int val){
        int left = 0;
        int right = arr.length-1;
        int res = -1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid]==val)
                return arr[mid];
            else if(arr[mid]>val)
                right = mid-1;
            else if(arr[mid]<val){
                res = mid;
                left = mid+1;
            }
        }
        return arr[res];
    }
}