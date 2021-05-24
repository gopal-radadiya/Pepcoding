import java.io.*;
import java.util.*;

public class PrintMazePaths {
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
        if(sc<dc)
            printMazePaths(sr,sc+1,dr,dc,path+"h");
        if(sr<dr)
            printMazePaths(sr+1,sc,dr,dc,path+"v");
    }
}