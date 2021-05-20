import java.io.*;
import java.util.*;

public class KeypadCombination {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){
        if(str.length()==0){
            ArrayList<String> baseres = new ArrayList<>();
            baseres.add("");
            return baseres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recres = getKPC(ros);
        ArrayList<String> myres = new ArrayList<>();

        String codeforch = codes[ch-48];
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String temp : recres){
                myres.add(chcode + temp);
            }
        }
        return myres;
    }
}