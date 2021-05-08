import java.io.*;
import java.util.*;

public class SubsetOfArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        int limit = (int)Math.pow(2,arr.length);

        for(int i=0;i<limit;i++){
            String ans = "";
            int temp = i;
            for(int j=arr.length-1;j>=0;j--){
                int rem = temp%2;
                temp = temp/2;
                if(rem==0)
                    ans = "-" + "\t" + ans;
                else
                    ans = arr[j] + "\t" + ans;
            }
            System.out.println(ans);
        }
    }
}