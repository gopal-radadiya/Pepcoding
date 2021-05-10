import java.io.*;
import java.util.*;

public class SaddlePrice {
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

        for(int i=0;i<row;i++){
            int svj = 0;
            for(int j=1;j<col;j++){
                if(arr[i][j]<arr[i][svj])
                    svj = j;
            }

            boolean flag = true;
            for(int k=0;k<row;k++){
                if(arr[k][svj]>arr[i][svj]){
                    flag = false;
                    break;
                }
            }

            if(flag==true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}