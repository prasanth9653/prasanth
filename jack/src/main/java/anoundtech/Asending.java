package anoundtech;

import java.util.Scanner;
import java.util.TreeMap;



public class Asending {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//int i;
		int temp=0;

Scanner sc =new Scanner(System.in);
//System.out.println("enter ");

//int n=sc.nextInt();



System.out.println("Enter the i Value");
int i=sc.nextInt();
int a[]=new int[i];
for(int j=0;j<i;j++)
{
	a[j]=sc.nextInt();
}
 
for(int l=0;l<a.length;l++)
{
	for(int m=l+1;m<a.length;m++)
	{
		if(a[l]<a[m])//decending order
			//if (a[l]>a[m]) assending order
		{
			temp=a[l];
			a[l]=a[m];
			a[m]=temp;
		}
	}
}System.out.println();
for(int j=0;j<i;j++)
{
	System.out.print(a[j]+" ");
}
	}

}
