import java.io.*;
import java.util.*;

public class AllIndicesOfArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int val = sc.nextInt();
        int[] ans = allIndices(arr,val,0,0);

        if(ans.length==0){
            System.out.println();
            return;
        }

        for(int ele : ans)
            System.out.println(ele);
    }

    public static int[] allIndices(int[] arr,int val,int i,int cnt){
        if(i==arr.length)
            return new int[cnt];
        if(arr[i]==val){
            int[] ans = allIndices(arr,val,i+1,cnt+1);
            ans[cnt] = i;
            return ans;
        }
        else{
            int[] ans = allIndices(arr,val,i+1,cnt);
            return ans;
        }
    }
}