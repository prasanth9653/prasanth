package anoundtech;

import java.util.Arrays;
import java.util.Scanner;

public class ResizeArray {
	
	
	   
	   public static void main(String[] args) {
	    	int[] numberArray = { 12, 24, 63, 45 };
	    	System.out.println("Array before ReSize: ");
	        for (int i = 0; i < numberArray.length; i++) {
	            System.out.println(numberArray[i]);
	        }
	 
	        numberArray = Arrays.copyOf(numberArray, 6);
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the value");
	        numberArray[4]=sc.nextInt();
	        System.out.println("Enter the value");
	        numberArray[5]=sc.nextInt();
//	        numberArray[4] = 11;
//	        numberArray[5] = 55;
//	        numberArray[6]=99;
	        //numberArray[7]=89;
	 
	        System.out.println("Array after ReSize: ");
	        for (int i = 0; i < numberArray.length; i++) {
	            System.out.println(numberArray[i]);
	        }
	   }
	

}
