import java.io.*;
import java.util.*;

public class StateOfWakandaTwo {
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

        for(int j=0;j<col;j++){
            int tempj = j;
            for(int i=0;i<row && tempj<col;i++){
                System.out.println(arr[i][tempj]);
                tempj++;
            }
        }
    }
}