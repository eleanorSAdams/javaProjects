import java.util.Scanner;

public class task5 
{
	/*private class CheapoMax
	{
		int litre = 20;
		double price = 19.99;
		int litreCovers = 10;
	}
	private class AverageJoes
	{
		int litre = 15;
		double price = 17.99;
		int litreCovers = 11;
	}
	private class DuluxourousPaints
	{
		int litre = 10;
		double price = 25.00;
		int litreCovers = 20;
	}*/
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter area to paint:");
		int area = Integer.parseInt(scanner.next());
		scanner.close();
		
		//double one = Math.ceil(0.2);
		System.out.println("area to paint: " + area);		
	}
}