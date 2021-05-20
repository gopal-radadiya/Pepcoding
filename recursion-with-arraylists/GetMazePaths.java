import java.io.*;
import java.util.*;

public class GetMazePaths {
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
        ArrayList<String> myres = new ArrayList<>();

        if(sc<dc)
            hpaths = getMazePaths(sr,sc+1,dr,dc);
        if(sr<dr)
            vpaths = getMazePaths(sr+1,sc,dr,dc);

        for(String temp : hpaths)
            myres.add("h" + temp);
        for(String temp : vpaths)
            myres.add("v" + temp);
        return myres;
    }
}