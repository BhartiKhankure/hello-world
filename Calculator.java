import java.util.Scanner;

class Calcy{
	int a, b;
	
	void insert(int x, int y) {
		a = x;
		b = y;
	}
	int add() {
		int c = a+b;
		//System.out.println("Addition: " + c);
		return c;
	}
	
	void sub() {
		System.out.println("Subtraction: " + (a-b));
	}
	
	void mul() {
		System.out.println("Multiplication: " + (a*b));
	}
	
	void div() {
		System.out.println("Division: " + ((float)a/b));
	}
	
	void mod() {
		System.out.println("Modulus: " + (a%b));
	}
}

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calcy cal = new Calcy();
		
		//cal.insert(90,660);
		int x, y;
		System.out.println("Enter the value of a: ");
		x = sc.nextInt(); //nextFloat();  next() - for String; nextLine();
		System.out.println("Enter the value of b: ");
		y = sc.nextInt();
		cal.insert(x, y);
		 
		int add = cal.add();
		System.out.println("Addition: " + add);
		cal.sub();
		cal.mul();
		cal.div();
		cal.mod();

	}

}
