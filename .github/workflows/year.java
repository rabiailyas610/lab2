import java.util.Scanner;
public class year
{
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a year");
		float a=s.nextFloat();
		float month=a*12f;
		System.out.println(month+"Months");
	}
}