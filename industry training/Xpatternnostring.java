import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        /*String*/
        
        // String s1=s.next();
        // for(int i=0;i<s1.length();i++){
        //     System.out.println();
        //     for(int j=0;j<s1.length();j++){
        //         if(i==j){
        //             System.out.print(s1.charAt(i));
        //         }
        //         else if(i+j==s1.length()-1){
        //             System.out.print(s1.charAt(j));
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        // }
        
        
        /* number*/
    //     int a=s.nextInt();
    //     for(int i=0;i<a;i++){
    //         System.out.println();
    //         for(int j=0;j<a;j++){
    //         if(i==j){
    //             System.out.print(i+1);
    //         }
    //         else if(i+j==a-1){
    //             System.out.print(j+1);
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    // }
    
    
    String s1=s.next();
        for(int i=0;i<s1.length();i++){
            System.out.println();
            for(int j=0;j<s1.length();j++){
                if(i==j||i+j==s1.length()-1){
                    System.out.print(s1.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
        }
}
}