import java.util.*;

public class Main
{
    public static int max(int a,int b){
        return a>b?a:b;
    }
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j,max=0;
int arr1[]=new int[n];
int arr2[]=new int[n];
for(i=0;i<n;i++){
    arr1[i]=sc.nextInt();
    arr2[i]=1;
}
for(i=0;i<n;i++){
    for(j=0;j<i;j++){
        if(arr1[j]>arr1[i]){
            arr2[i]=arr2[i]>arr2[j]+1?arr2[i]:arr2[j]+1;
        }
    }
    if(arr2[i]>max)
    max=arr2[i];
    
}
	System.out.println(max);    
	}
}



