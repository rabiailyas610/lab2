import java.util.Scanner;
public class cel
{
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter temperature in celcius");
		float a=s.nextFloat();
		float celcius=(a * 9/5)+32;
		System.out.println(celcius);
	}
}