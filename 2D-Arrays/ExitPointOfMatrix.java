import java.io.*;
import java.util.*;

public class ExitPointOfMatrix {
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

        int i = 0;
        int j = 0;
        int dir = 0;

        while(true){
            dir = (dir+arr[i][j])%4;

            if(dir==0) // right
                j++;
            else if(dir==1) // down
                i++;
            else if(dir==2) // left
                j--;
            else if(dir==3) // up
                i--;

            if(i==-1){
                i++;
                break;
            }
            else if(j==-1){
                j++;
                break;
            }
            else if(i==row){
                i--;
                break;
            }
            else if(j==col){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}