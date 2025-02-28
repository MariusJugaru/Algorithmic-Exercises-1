import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Servere {
	public final String input_file = "servere.in";
	public final String output_file = "servere.out";

	int N;
	int[] pow, limit;

	double left = Integer.MAX_VALUE, right = 0;
		
	public void solve() {
		readInput();
		writeOutput(getResult());
	}

	private void readInput() {
		try {
			Scanner sc = new Scanner(new File(input_file));
			N = sc.nextInt();
			pow = new int[N + 1];
			limit = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				pow[i] = sc.nextInt();
			}
			for (int i = 1; i <= N; i++) {
				limit[i] = sc.nextInt();
				if (limit[i] < left) {
					left = limit[i];
				}
				if (limit[i] > right) {
					right = limit[i];
				}
			}

			sc.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void writeOutput(double result) {
		try {
			PrintWriter pw = new PrintWriter(new File(output_file));
			pw.printf("%.1f\n", result);
			pw.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private double getMin(double input) {
		double min = Integer.MAX_VALUE;

		for (int i = 1; i <= N; i++) {
			// System.out.println("pow: " + (pow[i] - Math.abs(input - limit[i])));
			min = Math.min(min, pow[i] - Math.abs(input - limit[i]));
		}

		return min;
	}

	private double getResult() {
		double min_left = getMin(left), min_right = getMin(right);

		while (left < right) {
			// System.out.println("left: " + left + " right: " + right);
			double middle = (left + right) / 2;
			min_left = getMin(left);
			min_right = getMin(right);
			// System.out.println("min left: " + min_left + " min_right: " + min_right);

			if (min_left > min_right) {
				right = middle;
			} else if (min_left < min_right) {
				left = middle;
			} else {
				if (left != right) {
					left += 0.1;
					right -= 0.1;
				} else {
					break;
				}
			}
		}

		return min_left;
	}

	public static void main(String[] args) {
		Servere task = new Servere();

		task.solve();
	}
}
