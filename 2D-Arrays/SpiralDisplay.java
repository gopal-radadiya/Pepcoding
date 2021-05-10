import java.io.*;
import java.util.*;

public class SpiralDisplay {
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

        int minr = 0;
        int minc = 0;
        int maxr = row-1;
        int maxc = col-1;
        int total = row*col;
        int cnt = 0;

        while(cnt<total){
            // left wall : go down
            for(int i=minr,j=minc;i<=maxr && cnt<total;i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

            // bottom wall : go right
            for(int i=maxr,j=minc;j<=maxc && cnt<total;j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

            // right wall : go up
            for(int i=maxr,j=maxc;i>=minr && cnt<total;i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

            // top wall : go left
            for(int i=minr,j=maxc;j>=minc && cnt<total;j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }
}