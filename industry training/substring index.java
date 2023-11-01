import java.util.*;
class Main{
    public static void main(String args[]){
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        int a=0,b=0;
        // int a=sc.nextInt();
        for(int i=0;i<s1.length()-1;i++){
            s3=s1.substring(i,i+s2.length());
            if(s3.equals(s2)){
                a=i;
                b=1;
                break;
            }
        }
        if(b==1){
            System.out.println(a);
        }
        else{
            System.out.println(-1);
        }
        // System.out.println(s1.substring(0,s2.length()));
    }
}