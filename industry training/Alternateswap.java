import java.util.*;
public class Main
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp1=n,temp=0,cnt=0,sum=0,b=0;
while(n!=0){
    n=n/10;
    cnt++;
}
if(cnt%2!=0){
 temp=temp1%10;
 temp1=temp1/10;
}
while(temp1!=0){
    sum=sum*10+temp1%10;
    temp1/=10;
}
while(sum!=0){
    b=b*100+(sum%100);
    sum=sum/100;
}
 if(cnt%2==0)
 System.out.println(b);
 else
 System.out.println(b*10+temp);
	}
}
