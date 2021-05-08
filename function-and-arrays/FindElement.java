import java.io.*;
import java.util.*;

public class FindElement {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        int val = sc.nextInt();

        int idx = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}