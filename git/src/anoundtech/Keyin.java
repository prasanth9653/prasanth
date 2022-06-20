package anoundtech;

import java.util.Scanner;

public class Keyin {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);

		System.out.println("Please enter your name..:");

		String name=abc.next();

		System.out.println("Welcome :"+name);

		System.out.println("enter your age..:");

		int age=abc.nextInt();

		System.out.println("age is...:"+age);
		
		
	}

}
