package booking;

public class Codes {

	public static int nSum(int n) {

		return ((n * (n + 1)) / 2);

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 0;
		}
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= 1;
		}
		return fact;
	}

	public static long fibonacci(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {

			return 1;
		}
		int nMinus1 = 1;
		int nMinus2 = 0;
		int fib = 0;
		for (int i = 1; i < n; i++) {

			fib = (nMinus2 + nMinus1);
			nMinus2 = nMinus1;
			nMinus1 = fib;
		}
		return fib;

	}

	public static void Main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(nSum(i));
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(factorial(10));
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(fibonacci(10));

		}

	}
}
