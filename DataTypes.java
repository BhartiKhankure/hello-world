import java.util.Scanner;


public class DataTypes {

	public static void main(String[] args) {
		int a,b,Sum,Sub,Mul,Div,Mod;
		int a1,b1,c;
		int num1 = 89;
		int num2 = 78;
		int result = num1 + num2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Val: ");
		a = scanner.nextInt();
		System.out.println("Enter the Second Val: ");
		b = scanner.nextInt();
		
		Sum = a+b;
		Sub = a-b;
		Mul = a*b;
		Div = a/b;
		Mod = a%b;
		
		System.out.println("The Result is: " +Sum);
		System.out.println("The Result is: " +Sub);
		System.out.println("The Result is: " +Mul);
		System.out.println("The Result is: " +Div);
		System.out.println("The Result is: " +Mod);
		System.out.println(" ");
		c = a+b;
		System.out.println("The Result is: " +c);
		c = a-b;
		System.out.println("The Result is: " +c);
		c = a*b;
		System.out.println("The Result is: " +c);
		c = a/b;
		System.out.println("The Result is: " +c);
		c = a%b;
		System.out.println("The Result is: " +c);
		
		System.out.println(" ");
		
		System.out.println("Addition" + "-" + result);
		System.out.println("Subtraction" + "-" + (num1-num2) );
		System.out.println("Division" + "-" + (float)num1/num2);
		System.out.println("Multiplication" + "-" + (num1*num2));
		System.out.println("Modulus" + "-" + (num1%num2));
		

	}

}
