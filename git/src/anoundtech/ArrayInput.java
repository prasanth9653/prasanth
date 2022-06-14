package anoundtech;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
			Scanner abc=new Scanner(System.in);
			int[] array=new int[10];
			int sum=0;
			System.out.println("Enter the Element");
			for(int i=0;i<10;i++)
			{
				array[i]=abc.nextInt();
				
				
			}
			for(int num:array)
			{
			sum=sum+num;
				
			}
			

System.out.println("sum of Array Element is ..."+sum);

	}

}
