import java.io.*;
import java.util.*;

public class InverseOfArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        int[] ans = inverse(arr);

        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);
    }

    public static int[] inverse(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<arr.length;i++)
            ans[arr[i]] = i;
        return ans;
    }
}