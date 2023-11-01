import java.util.*;

public class Main
{
    public static int max(int a,int b){
        return a>b?a:b;
    }
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
char a[]=s1.toCharArray();
char b[]=s2.toCharArray();
int l1=s1.length();
int l2=s2.length(),i,j;
int arr[][]=new int[l2+1][l1+1];
for( i=0;i<l2+1;i++)
   for( j=0;j<l1+1;j++)
   arr[i][j]=0;
for(i=1;i<l2+1;i++){
    for(j=1;j<l1+1;j++)
    {
        if(b[i-1]==a[j-1])
        arr[i][j]=arr[i-1][j-1]+1;
        else
        arr[i][j]=max(arr[i-1][j],arr[i][j-1]);
    }
}
for(i=1;i<l2+1;i++,System.out.println())
    for(j=1;j<l1+1;j++)
System.out.print(arr[i][j]+" ");
	}
}


