import java.util.Scanner;
public class task6_7 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter max value:");
		long max = scanner.nextInt();
		scanner.close();
	
		System.out.println("2");
	  for(long i=2; i<=max; i++)
	  {
		  long factors = 0;
		  long j=1;

		    while(j<=i)
		    {
		        if(i % j == 0)
		        {
		            factors++;
		        }
		        j++;
		    }
		    if(factors==2)
		    {
		        System.out.println(i);
		    }
		}
	}

}
