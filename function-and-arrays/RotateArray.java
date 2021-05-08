import java.io.*;
import java.util.*;

public class RotateArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();

        rotate(arr,k);

        for(int val : arr)
            System.out.print(val + " ");
    }

    public static void rotate(int[] arr,int k){
        int n = arr.length;
        if(k>=0){
            for(int j=0;j<k%n;j++){
                int temp = arr[n-1];
                for(int i=n-1;i>0;i--)
                    arr[i] = arr[i-1];
                arr[0] = temp;
            }
        }
        else{
            k = Math.abs(k);
            for(int j=0;j<k%n;j++){
                int temp = arr[0];
                for(int i=1;i<n;i++)
                    arr[i-1] = arr[i];
                arr[n-1] = temp;
            }
        }
    }
}