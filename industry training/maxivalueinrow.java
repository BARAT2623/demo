import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt ();
   int arr[][]=new int[n][n];
   int ar[]=new int[n];
   int i,j,k,max=0;
   for(i=0;i<n;i++){
       k=0;
       for(j=0;j<n;j++){
       arr[i][j]=sc.nextInt();
       k+=arr[i][j];
       }
       if(k>max)
       max=k;
   }
   System.out.println(max);
	  }
  }