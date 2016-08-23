//import java.util.Scanner;
public class task3 
{

	public static void main(String[] args) 
	{
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("enter text:");
		String firstWord = "hello";
		char[] string = firstWord.toCharArray();
		//char[] string = scanner.nextLine().toCharArray();
		int start = 0;
		int end = string.length-1;
		//scanner.close();
		
		while(end > start){
			char hold = string[start];
			string[start] = string[end];
			string[end] = hold;
			start++;
			end--;
		}
		System.out.println(string);
	}
}
