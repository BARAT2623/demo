import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
		    arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		int count=0;
		for(int i=0;i<a;i++){
		    if(arr[i]==max){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
