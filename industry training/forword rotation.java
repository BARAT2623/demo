// hello
// 4
// elloh
// llohe
// lohel
// ohell
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
            char temp=s2[0];
            for(int i=0;i<l-1;i++){
                s2[i]=s2[i+1];
            }
            s2[l-1]=temp;
            rot--;
        }
        System.out.println(s2);
    }
}