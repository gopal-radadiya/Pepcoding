import java.io.*;
import java.util.*;

public class RingRotate {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = fillArrayFromMatrix(arr,s);
        rotate(nums,k);
        fillMatrixFromArray(arr,nums,s);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillMatrixFromArray(int[][] arr,int[] nums,int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;

        int idx = 0;
        // left wall
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[i][j] = nums[idx];
            idx++;
        }
        // bottom wall
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j] = nums[idx];
            idx++;
        }
        // right wall
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[i][j] = nums[idx];
            idx++;
        }
        // top wall
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            arr[i][j] = nums[idx];
            idx++;
        }
    }

    public static int[] fillArrayFromMatrix(int[][] arr,int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int total = 2*(maxr-minr+maxc-minc);
        int[] nums = new int[total];

        int idx = 0;
        // left wall
        for(int i=minr,j=minc;i<=maxr;i++){
            nums[idx] = arr[i][j];
            idx++;
        }
        // bottom wall
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            nums[idx] = arr[i][j];
            idx++;
        }
        // right wall
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            nums[idx] = arr[i][j];
            idx++;
        }
        // top wall
        for(int i=minr,j=maxc-1;j>=minc+1;j--){
            nums[idx] = arr[i][j];
            idx++;
        }
        return nums;
    }

    public static void reverse(int[] nums,int li,int ri){
        while(li<ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] nums,int k){
        k = k%nums.length;
        if(k<0){
            k = k+nums.length;
        }

        // reverse first part
        reverse(nums,0,nums.length-k-1);
        // reverse second part
        reverse(nums,nums.length-k,nums.length-1);
        // reverse entire array
        reverse(nums,0,nums.length-1);
    }
}