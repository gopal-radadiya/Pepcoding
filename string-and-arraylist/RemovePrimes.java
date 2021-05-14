import java.io.*;
import java.util.*;

public class RemovePrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            list.add(val);
        }
        solution(list);
        System.out.println(list);
    }

    public static void solution(ArrayList<Integer> list){
        int n = list.size();
        for(int i=n-1;i>=0;i--){
            int val = list.get(i);
            if(isprime(val)==true)
                list.remove(i);
        }
    }

    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}