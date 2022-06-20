package anoundtech;

import java.util.Scanner;

public class Prymid1 {
	
		   public static void main(String[] args) {
		      // outer loop for row
//		      for (int i=1; i <= 5; i++) {
//		         // inner loop for column
			   int d=1;
			   Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the num value:"); 
		        int num=sc.nextInt();
			   for(int i=1;i<=num;i++) {
			   for(int j=1; j <= i; j++) {
		            // print star
				   if(d<=num)
//					   for(int d=1;d<=i;d++)
				   {
					   
				   
		            System.out.print(d+ " ");
		            d++;
				   }
				  
		         }
		         // new line
			   System.out.println();
			   
		      }
			 
			  
		   }
		
}