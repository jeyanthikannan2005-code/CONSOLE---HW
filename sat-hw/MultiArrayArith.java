import java.util.Scanner;
class MultiArrayArith
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row size :");
		int row=sc.nextInt();
		System.out.print("Enter the coloumn size :");
		int coloumn=sc.nextInt();
		int ar[][]=new int[row][coloumn];
		boolean exit=true;
		int r_sum=0;
		int c_sum=0;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Row "+(i+1)+" :");
			for(int j=0;j<ar[i].length;j++)
			{
			System.out.print("Enter the value "+(j+1)+": ");
			ar[i][j]=sc.nextInt();
			}
		}
		do
		{
			System.out.println("*****THE OPTIONS ARE*****");
			System.out.println("1.ROW SUM OF THE ARRAY VALUES");
			System.out.println("2.COLOUMN SUM OF THE ARRAY VALUES");
			System.out.println("3.PRINT THE ARRAY VALUES");
			System.out.println("4.TRAVERSE THE ARRAY");
			System.out.println("5.REVERSE THE ARRAY VALUES");
			System.out.println("6.EXIT");
			System.out.print("Enter your option :");
			int opt=sc.nextInt();
			if(opt==1)
			{
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
						r_sum=r_sum+ar[i][j];
					}
				}
				System.out.println("The row sum of the given array is "+r_sum);
			}
			else if(opt==2)
			{
				for(int j=0;j<ar[0].length;j++)
				{
					for(int i=0;i<ar.length;i++)
					{
						c_sum=c_sum+ar[i][j];
					}
				}
				System.out.println("The coloumn sum of the given array is "+c_sum);
			}
			
			else if(opt==3)
			{
				for(int i=0;i<ar.length;i++)
				{
					for(int j=0;j<ar[i].length;j++)
					{
					System.out.print(ar[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
			else if(opt==4)
			{
				for(int j=0;j<ar[0].length;j++)
				{
					for(int i=0;i<ar.length;i++)
					{
						System.out.print(ar[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
			}
			else if(opt==5)
			{
				for(int i=0;i<ar.length;i++)
				{
					for(int j=ar[i].length-1;j>=0;j--)
					{
						System.out.print(ar[i][j]+" ");
					}
					System.out.println();
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