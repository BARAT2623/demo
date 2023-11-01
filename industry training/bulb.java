// to find tottal number of bulb is On
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println((int)Math.sqrt(n));
        /*To find the On bulb numbers*/
        for(int i=1;i*i<=n;System.out.print(i*i+" "),i++);
    }
}