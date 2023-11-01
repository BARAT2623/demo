import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt ();
   int arr[][]=new int[n][n];
   int i,j,k,temp=0;
   for(i=0;i<n;i++)
       for(j=0;j<n;j++)
           arr[i][j]=sc.nextInt();
        for(j=0;j<n;j++){
            for(i=0;i<n;i++){
    for(k=i+1;k<n;k++)
    {
        if(arr[i][j]>arr[k][j]){
            temp=arr[i][j];
            arr[i][j]=arr[k][j];
            arr[k][j]=temp;
        }
    } 
    }
       }
         for(i=0;i<n;i++,System.out.println())
        for(j=0;j<n;j++)
      System.out.print(arr[i][j]+" ");
        
       }
   }