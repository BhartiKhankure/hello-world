import java.util.Scanner;

public class monthDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		switch(num) {
		case 2:
			System.out.println("February....Number of days are 28/29 ");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days are 31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of days are 30");
			break;
		default :
			System.out.println("Enter a number from 1-12");
		
		
		
		
				
		
		}

	}

}
