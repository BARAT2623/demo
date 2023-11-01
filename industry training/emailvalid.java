import java.util.*;
import java.util.regex.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(Pattern.matches("[a-z0-9]+[@]+[gmail | yahoo]+[.]com",str)){
            System.out.print("Valid");
        }
        else{
            System.out.print("Not valid");
        }
    }
}