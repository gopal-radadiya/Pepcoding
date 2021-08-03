import java.io.*;
import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                boolean val = check(st,'(');
                if(val==false){
                    System.out.println(false);
                    return;
                }
            }
            else if(ch=='}'){
                boolean val = check(st,'{');
                if(val==false){
                    System.out.println(false);
                    return;
                }
            }
            else if(ch==']'){
                boolean val = check(st,'[');
                if(val==false){
                    System.out.println(false);
                    return;
                }
            }
        }

        if(st.size()==0)
            System.out.println(true);
        else
            System.out.println(false);
    }

    // coch : corresponding character
    public static boolean check(Stack<Character> st, char coch){
        if(st.size()==0)
            return false;
        else if(st.peek()!=coch)
            return false;
        else {
            st.pop();
            return true;
        }
    }
}