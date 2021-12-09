import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch = 56; // ASCII value of 8 = 56
		if((ch>='A' && ch <='Z')) {
			System.out.println(ch + "is alphabet");

		}
		else {
			System.out.println(ch + "is not an alphabet");
		}

	}

}
