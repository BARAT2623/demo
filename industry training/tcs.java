/*
0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8
*/
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 		Scanner s=new Scanner(System.in);
// 		int n=s.nextInt();
// 		if(n%2==1){
// 		    System.out.println(n-1);
// 		}
// 		else{
// 		    System.out.println((int)(n/2)-1);
// 		}
// 	}
// }

/*
0,0,7,6,14,12,21,18,28
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==1){
		    System.out.println(((int)(n/2)*7));
		}
		else{
		    System.out.println(((int)((n/2)-1)*6));
		}
	}
}

