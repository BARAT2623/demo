import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    try{
	        int n=s.nextInt();
	        int k=n/0;
	        System.out.print(k);
	    }
	    catch(Exception e){
	        System.out.println("error");
	    }
	    finally{
	        System.out.print("code was running sucessfully");
	    }
	}
}
