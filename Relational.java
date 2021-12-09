import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		/*int a = 20, b = 32;
		System.out.println(a>b);      //relational operators
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);*/		
		
		int x = 57, y = 45, z = 76;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first num: ");
		x = sc.nextInt();
		
		System.out.println("Enter the second num: ");
		y = sc.nextInt();
		
		System.out.println("Enter the third num: ");
		z = sc.nextInt();
		
		if((x>y) && (x>z)){
		System.out.println(x + "is greatest");
		}
		
		if((y>x) && (y>z)) {
			System.out.println(y + "is greatest");
		}
		
		if((z>x) && (z>y)) {
			System.out.println(z + "is greatest");
		}
		
		if((z == x) && (x == z)) {
			System.out.println("All numbers are equal");
		}
		
		
	}
}
