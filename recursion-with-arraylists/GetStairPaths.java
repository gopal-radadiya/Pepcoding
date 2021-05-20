import java.io.*;
import java.util.*;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        else if(n<0){
            ArrayList<String> baseres = new ArrayList<>();
            return baseres;
        }

        ArrayList<String> one = getStairPaths(n-1);
        ArrayList<String> two = getStairPaths(n-2);
        ArrayList<String> three = getStairPaths(n-3);
        ArrayList<String> myres = new ArrayList<>();

        for(String temp : one)
            myres.add("1" + temp);
        for(String temp : two)
            myres.add("2" + temp);
        for(String temp : three)
            myres.add("3" + temp);
        return myres;
    }
}