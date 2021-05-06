import java.util.*;

public class Thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int icj = 1;
            for(int j=0;j<n;j++){
                if(i>=j){
                    System.out.print(icj + "\t");
                    int icjp1 = icj*(i-j)/(j+1);
                    icj = icjp1;
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}