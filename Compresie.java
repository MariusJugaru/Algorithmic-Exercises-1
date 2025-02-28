import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Compresie {
	public final String input_file = "compresie.in";
	public final String output_file = "compresie.out";

	int N, M;
	int[] A, B;

	public void solve() {
		readInput();
		writeOutput(getResult());
	}

	private void readInput() {
		try {
			Scanner sc = new Scanner(new File(input_file));
			N = sc.nextInt();
			A = new int[N + 1];

			for (int i = 1; i <= N; i++) {
				A[i] = sc.nextInt();
			}

			M = sc.nextInt();
			B = new int[M + 1];

			for (int i = 1; i <= M; i++) {
				B[i] = sc.nextInt();
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

	private int getResult() {
		int sum_a = A[1], sum_b = B[1];
		int i = 2, j = 2, c = 0;

		while (i <= N && j <= M) {
			if (sum_a == sum_b) {
				sum_a = A[i];
				sum_b = B[j];
				
				i++;
				j++;
				c++;
				continue;
			}
			if (sum_a < sum_b) {
				sum_a += A[i];
				i++;
				continue;
			}
			if (sum_a > sum_b) {
				sum_b += B[j];
				j++;
			}
		}

		while (sum_a < sum_b && i <= N) {
			sum_a += A[i];
			i++;
			if (sum_a > sum_b) {
				return -1;
			}
		}
		while (sum_a > sum_b && j <= M) {
			sum_b += B[j];
			j++;
			if (sum_a < sum_b) {
				return -1;
			}
		}
		if (i <= N || j <= M) {
			return -1;
		}
		c++;
		
		return c;
	}

	public static void main(String[] args) {
		Compresie task = new Compresie();

		task.solve();
	}
}
