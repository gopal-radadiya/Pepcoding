import java.util.*;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n+1)/2;
        int k = 0;

        for(int i=1;i<=n;i++){

            if(i<=m) k++;
            else k--;

            for(int j=1;j<=n;j++){
                if(i==m)
                    System.out.print("*\t");
                else if(j>=m && j<=m-1+k)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}