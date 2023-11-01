import java.util.*;
import java.util.regex.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(Pattern.matches("[6-9][0-9]{9}",str));
    }
}