package anoundtech;

import java.util.Scanner;

public class NestSwitch {
	
		public static void main(String args[]){ 
			Scanner sc =new Scanner(System.in);
			
		System.out.println("ENter the tech value:");
		int tech=sc.nextInt();
		
		
		 switch(tech){ 
		case 1: 
		 System.out.println("python"); 
		 break; 
		 
		
		 
		 case 2: 
			 System.out.println("Enter the course value:");
			 int course=sc.nextInt();
		 switch(course){ 
		case 3: 
		 System.out.println("J2EE"); 
		 break; 
		 case 4: 
		 System.out.println("advance java"); 
		 } 
		 } 
		 } 
		}


