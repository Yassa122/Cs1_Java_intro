package week2;
import java.util.*;

public class quiz1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==0) {
                c++;
            }
        }
        System.out.println("The count of '0' in the string is: " + c);
    }
}
