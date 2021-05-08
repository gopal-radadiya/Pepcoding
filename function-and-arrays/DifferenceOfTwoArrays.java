import java.io.*;
import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<arr1.length;i++)
            arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<arr2.length;i++)
            arr2[i] = sc.nextInt();

        int[] ans = new int[n2];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = ans.length-1;
        int c = 0;

        while(k>=0){
            int d = c;
            if(j>=0) d += arr2[j];
            if(i>=0) d -= arr1[i];
            if(d<0){
                d += 10;
                c = -1;
            }
            else
                c = 0;
            ans[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        for(;idx<ans.length;idx++){
            if(ans[idx]!=0)
                break;
        }
        for(;idx<ans.length;idx++){
            System.out.println(ans[idx]);
        }
    }
}