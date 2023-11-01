import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0,ans=0;
		while((int)Math.pow(2,k)<=n){
		    ans=(int)Math.pow(2,k);
		    k=k+1;
		}
		System.out.println((n-ans)*2+1);
	}
}
/*
10
1 2 3 4 5 6 7 8 9 10
1 3 5 7 9
1 5 9 
5
*/