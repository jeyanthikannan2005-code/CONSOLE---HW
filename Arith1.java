import java.util.Scanner;
class Arith1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number :");
		int first=sc.nextInt();
		System.out.print("Enter the second number:");
		int second=sc.nextInt();
		System.out.print("Enter the third number:");
		int third=sc.nextInt();
		boolean exit=true;
		int add;
		int sub;
		int multi;
		do{
			System.out.println("*****THE OPTIONS ARE*****");
			System.out.println("1.ADD");
			System.out.println("2.SUBTRACTION");
			System.out.println("3.Multiplication");
			System.out.println("4.EXIT");
			System.out.print("Enter your option :");
			int opt=sc.nextInt();
			if(opt==1)
			{
				add=first+second+third;
				System.out.println("The sum of "+first+" , "+second+" and "+third+" is "+add);
			}
			else if(opt==2)
			{
				sub=(first-second)-third;
				System.out.println("The difference of "+first+" , "+second+" and "+third+" is "+sub);
				
			}
			else if(opt==3)
			{
				multi=(first*second)*third;
				System.out.println("The multiplication of "+first+" , "+second+" and "+third+" is "+multi);
			}
			else
			{
				exit=false;
			}
			
			
			
		}while(exit);
		
	}
}