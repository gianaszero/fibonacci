import java.util.Scanner;

public class FiboTest {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Fibonacci fibo = new Fibonacci();

		System.out.println("This program gives you Fibonacci Sequence.");
		System.out.print("Give me the last term of your sequence (example: '8'th term): ");
		int lastTerm = input.nextInt();


		int[] fibonacci = new int[lastTerm];
		final int n = 2;
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		

		fibo.getFibonacci(fibonacci, n);

		for ( int element : fibonacci ) {
			System.out.print(element + " ");
		}
	}
}