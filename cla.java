import java.util.Scanner;
public class calculator
{
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter two integer");
		float a=s.nextFloat();
		float b=s.nextFloat();
		System.out.println("Enter an operator : ");
		char c=s.nextAt();
		switch(c)
			{
				case '+':
					System.out.println("Addition : "+(a+b));
					break;
				case '-':
					System.out.println("Subtraction : "+(a-b));
					break;
				case '*';
					System.out.println("Multiplication : "+(a*b));
					break;
				case '/':
					System.out.println("Division : "+(a/b));
					break;
				case '%':
					System.out.println("Modulo : "+(a%b));
			}
	}
}
