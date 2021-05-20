import java.io.*;
import java.util.*;

public class MazePathWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<String> paths = getMazePaths(1,1,r,c);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        ArrayList<String> dpaths = new ArrayList<>();
        ArrayList<String> myres = new ArrayList<>();

        // horizontal move
        for(int i=1;i<=dc-sc;i++){
            hpaths = getMazePaths(sr,sc+i,dr,dc);
            for(String temp : hpaths)
                myres.add("h" + i + temp);
        }
        // vertical move
        for(int i=1;i<=dr-sr;i++){
            vpaths = getMazePaths(sr+i,sc,dr,dc);
            for(String temp : vpaths)
                myres.add("v" + i + temp);
        }
        // diagonal move
        for(int i=1;i<=dr-sr && i<=dc-sc;i++){
            dpaths = getMazePaths(sr+i,sc+i,dr,dc);
            for(String temp : dpaths)
                myres.add("d" + i + temp);
        }
        return myres;
    }
}