// hello
// 4
// ohell
// lohel
// llohe
// elloh
// hello
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int n=sc.nextInt();
        char s2[]=s1.toCharArray();
        int l=s1.length();
        int rot=n%l;
        while(rot!=0){
            char temp=s2[l-1];
            for(int i=l-1;i>0;i--){
                s2[i]=s2[i-1];
            }
            s2[0]=temp;
            rot--;
        }
        System.out.println(s2);
    }
}