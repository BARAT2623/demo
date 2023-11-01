import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		for(;num!=0;num/=2) {
			count++;
		}
		System.out.println("Philaland coin"+count);
		System.out.println("Gold Rod"+(count-1));
	}

}