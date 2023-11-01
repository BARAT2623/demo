/*
1 2 3
4 5 6
7 8 9

1 2 3 6 5 4 7 8 9
*/

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<arr.length;j++)
                     System.out.print(arr[i][j]+" ");
            }
            else{
                for(int j=arr.length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}