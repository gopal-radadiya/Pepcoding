import java.io.*;
import java.util.*;

public class SearchInSortedMatrix {
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
        int val = sc.nextInt();

        int i = 0;
        int j = col-1;
        while(i<row && j>=0){
            if(arr[i][j]==val){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(arr[i][j]>val)
                j--;
            else if(arr[i][j]<val)
                i++;
        }
        System.out.println("Not Found");
    }
}