import java.util.*;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = 2*row-1;
        int val = 0;

        for(int i=1;i<=row;i++){
            val = 1;
            for(int j=1;j<=col;j++){
                if(j>=i+1 && j<=col-i)
                    System.out.print("\t");
                else
                    System.out.print(val + "\t");
                if(j<row) val++;
                else val--;
            }
            System.out.println();
        }
    }
}