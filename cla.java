import java.util.Scanner;
public class cla
{
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter two integer");
		float a=s.nextFloat();
		float b=s.nextFloat();
		System.out.println("Addition :"+(a+b));
		System.out.println("Subtraction :"+(a-b));
		System.out.println("Multiplication :"+a*b);
		System.out.println("Division:"+a/b);
		System.out.println("Modulo:"+a%b);
		
	}
}