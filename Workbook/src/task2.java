import java.util.Scanner;
public class task2 
{

	public static void main(String[] args) 
	{
		int i = 0;
		//String z = System.console().readLine();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter value:");
		int y = scanner.nextInt();
		scanner.close();
		String x = "*";
		while(i < y)
		{
			System.out.println(x);
			x = x + "*";
			i++;
		}
	}
}
