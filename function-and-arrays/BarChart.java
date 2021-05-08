import java.io.*;
import java.util.*;

public class BarChart {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        int mx = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx)
                mx = arr[i];
        }

        for(int floor=mx;floor>0;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}