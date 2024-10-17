import java.util.Scanner;

public class 3Sum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 3 numbers : ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();

	int small = num1;
	if(small>num2)
	{
		small = num2;
	}
	else if(small>num3)
	{
		small = num3;
	}
	
	int large = num3;
	if(large<num1)
	{
		large = num1;
	}
	else if(large<num2)
	{
		large = num2;
	}

	System.out.println(small+large);

	}
}
