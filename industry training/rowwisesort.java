/*
Row wise sorting problem

I/p:
3
2 4 3
6 3 8 
8 5 1
o/p:
2 3 4 
3 6 8
1 5 8
*/



import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    int arr[][]=new int[n][n];
	    int ar[]=new int[n];
	    int i,j;
	    for(i=0;i<n;i++,System.out.println()){
	        for(j=0;j<n;j++){
	            arr[i][j]=s.nextInt();
	            ar[j]=arr[i][j];
	        }
	        Arrays.sort(ar);
	        for(int k=0;k<n;k++){
	            System.out.print(ar[k]+" ");
	        }
	    }
	}
}
