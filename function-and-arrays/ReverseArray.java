import java.io.*;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        reverse(arr);

        for(int val : arr)
            System.out.print(val + " ");
    }

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}