import java.util.Scanner;

public class usingIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		if(num == 1) {
			System.out.println("January is of 31 days");
		}
		else if(num == 2) {
			System.out.println("February is of 28/29 days");
		}
		else if(num == 3) {
			System.out.println("March is of 31 days");
		}
		else if(num ==4) {
			System.out.println("April is of 30 days");
		}
		else if(num == 5) {
			System.out.println("May is of 31 days");
		}
		else if(num == 6) {
			System.out.println("June is of 30 days");
		}
		else if(num == 7) {
			System.out.println("July is of 31 days");
		}
		else if(num == 8) {
			System.out.println("August is of 31 days");
		}
		else if(num == 9) {
			System.out.println("September is of 30 days");
		}
		else if(num == 10) {
			System.out.println("October is of 31 days");
		}
		else if(num == 11) {
			System.out.println("November is of 30 days");
		}
		else if(num == 12) {
			System.out.println("December is of 31 days");
		}
		else {
			System.out.println("Invalid Declaration");
		}

	}

}
