import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Colorare {
	private final int mod = 1000000007;

	public final String input_file = "colorare.in";
	public final String output_file = "colorare.out";

	int K;
	int[] X;
	char[] T;

	public void solve() {
		readInput();
		writeOutput(getResult());
	}

	private void readInput() {
		try {
			Scanner sc = new Scanner(new File(input_file));
			K = sc.nextInt();
			X = new int[K + 1];
			T = new char[K + 1];
			for (int i = 1; i <= K; i++) {
				X[i] = sc.nextInt();
				T[i] = sc.next().charAt(0);
			}
			sc.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void writeOutput(int result) {
		try {
			PrintWriter pw = new PrintWriter(new File(output_file));
			pw.printf("%d\n", result);
			pw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private long moduloPow(int base, int exp, long modulo) {
		long pow = 1;
		long new_base = base;

		if (exp == 0) {
			return 1;
		}
		if (base == 0) {
			return 0;
		}
		if (modulo <= 0) {
			return -1;
		}

		while (exp > 0) {
			if (exp % 2 != 0) {
				pow = (pow * new_base) % mod;
			}
			exp /= 2;
			if (exp == 0) {
				break;
			}
			new_base = (new_base * new_base) % mod;
		}

		return pow;
	}

	private int getResult() {
		long[] dp = new long[K + 1];

		switch (T[1]) {
			case 'V':
				dp[1] = (3 * moduloPow(2, X[1] - 1, mod)) % mod;
				break;
			case 'H':
				dp[1] = (6 * moduloPow(3, X[1] - 1, mod)) % mod;
				break;
			default:
				break;
		}

		for (int i = 2; i <= K; i++) {
			if (T[i - 1] == 'V' && T[i] == 'V') {
				dp[i] = (dp[i - 1] * moduloPow(2, X[i], mod)) % mod;
			}
			if (T[i - 1] == 'V' && T[i] == 'H') {
				dp[i] = (dp[i - 1] * 2 * moduloPow(3, X[i] - 1, mod)) % mod;
			}
			if (T[i - 1] == 'H' && T[i] == 'H') {
				dp[i] = (dp[i - 1] * moduloPow(3, X[i], mod)) % mod;
			}
			if (T[i - 1] == 'H' && T[i] == 'V') {
				dp[i] = (dp[i - 1] * moduloPow(2, X[i] - 1, mod)) % mod;
			}		
		}
		
		return (int)dp[K];
	}

	public static void main(String[] args) {
		Colorare task = new Colorare();

		task.solve();
	}
}
