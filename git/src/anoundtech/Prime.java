package anoundtech;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num values:");
 
        int num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
        	if(num%2==0)
        	{
        		flag=true;
        		break;
        	}
        }
        	if(!flag)
        	{
        		System.out.println(num+"...is a Prime Number");
        	}else
        	{
        		System.out.println(num+"...is not a Prime number");
        	}
        
        
	}

}
