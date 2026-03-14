import java.util.Scanner;
class ArrayArith
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean exit=true;
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter the value number "+(i+1)+": ");
			ar[i]=sc.nextInt();
		}
		do
		{
			System.out.println("*****THE OPTIONS ARE*****");
			System.out.println("1.SUM THE ARRAY VALUES");
			System.out.println("2.PRINT THE ARRAY VALUES");
			System.out.println("3.REVERSE THE ARRAY VALUES");
			System.out.println("4.EXIT");
			System.out.print("Enter your option :");
			int opt=sc.nextInt();
			if(opt==1)
			{
				for(int i=0;i<ar.length;i++)
				{
					sum=sum+ar[i];
				}
				System.out.println("The sum of the given array is "+sum);
			}
			
			else if(opt==2)
			{
				for(int i=0;i<ar.length;i++)
				{
					System.out.print(ar[i]+" ");
				}
				System.out.println();
			}
			else if(opt==3)
			{
				for(int i=ar.length-1;i>=0;i--)
				{
					System.out.print(ar[i]+" ");
				}
				System.out.println();
			}
			else
			{
				exit=false;
			}
			
			
			
			
		}while(exit);
	}
}