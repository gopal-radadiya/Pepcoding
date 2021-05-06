import java.util.*;

public class Nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n+1)/2;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==m || j==m)
                    System.out.print("*\t");
                else if(i==1 && (j<m || j==n))
                    System.out.print("*\t");
                else if(i==n && (j==1 || j>m))
                    System.out.print("*\t");
                else if(j==1 && (i==1 || i>m))
                    System.out.print("*\t");
                else if(j==n && (i<m || i==n))
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}