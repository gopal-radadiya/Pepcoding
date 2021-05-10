import java.io.*;
import java.util.*;

public class RotateBy90Degree {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = row;

        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // transpose of matrix
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse every row
        for(int i=0;i<row;i++){
            int left = 0;
            int right = col-1;

            while(left<right){
                int temp = arr[i][right];
                arr[i][right] = arr[i][left];
                arr[i][left] = temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}