import java.io.*;
import java.util.*;

public class PrintMazePathsWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        printMazePaths(1,1,r,c,"");
    }

    public static void printMazePaths(int sr,int sc,int dr,int dc,String path){
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        // horizontal move
        for(int i=1;sc+i<=dc;i++)
            printMazePaths(sr,sc+i,dr,dc,path+"h"+i);
        // vertical move
        for(int i=1;sr+i<=dr;i++)
            printMazePaths(sr+i,sc,dr,dc,path+"v"+i);
        // diagonal move
        for(int i=1;sr+i<=dr && sc+i<=dc;i++)
            printMazePaths(sr+i,sc+i,dr,dc,path+"d"+i);
    }
}