import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter text:");
		String reverse = new StringBuffer(scanner.nextLine()).reverse().toString();
		System.out.println(reverse);
		scanner.close();
	}

}
