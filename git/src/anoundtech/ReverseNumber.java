package anoundtech;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) 
	 { 
	 int num=0; 
	int reversenum =0; 
	int myreverse=0;
	 Scanner in = new Scanner(System.in); 
	 System.out.println("Input your number and press enter: "); 
	 //This statement will capture the user input
	
	 //Captured input would be stored in number num
	num = in.nextInt(); 
	
	/*System.out.println("Enter the reverse Number:");
	reversenum=in.nextInt();/*
	//While Loop: Logic to find out the reverse number
	
	/*my_remainder = my_input % 10;
    reverse_input = reverse_input * 10 + my_remainder;
    my_input = my_input/10;*/
	while( num != 0 ) 
	 { 
	 reversenum = reversenum * 10; 
	reversenum = reversenum + num%10; 
	 num = num/10; 
	 } 
	/*while( num != 0 ) 
	{
		myreverse=num%10;
		reversenum=reversenum*10+myreverse;
		num=num/10;
		
		
	}*/
	 System.out.println("Reverse of input number is: "+reversenum); 
	 } 
}
