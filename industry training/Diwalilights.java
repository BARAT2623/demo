import java.util.*;
public class Main
{
    public static 
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),ans,c=0;
		while(n!=0){
		     ans=s.nextInt();
		     //with Math function
		    c=(int)Math.pow(2,ans)-1;
		    System.out.println(c%100000);
		    n--;
		}
	}
}
