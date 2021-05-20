import java.io.*;
import java.util.*;

public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recres = gss(ros);
        ArrayList<String> myres = new ArrayList<>();

        for(String temp : recres)
            myres.add("" + temp);
        for(String temp : recres)
            myres.add(ch + temp);
        return myres;
    }
}