import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Criptat {
	public final String input_file = "criptat.in";
	public final String output_file = "criptat.out";

	int N;
	int[][] res;
	String[] S;
	String c;

	Set<Character> alphabet = new HashSet<Character>();
	int alphabet_size = 0;

	private int charCount(String s) {
		return s.length() - s.replace(c, "").length();
	}

	class SortByCharCount implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			double factor_o1 = (double)charCount(o1) / (double)(o1.length());
			double factor_o2 = (double)charCount(o2) / (double)(o2.length());
			
			if (factor_o1 > factor_o2) {
				return -1;
			} else if (factor_o1 < factor_o2) {
				return 1;
			}
			return o2.length() - o1.length();
		}
		
	}

	public void solve() {
		readInput();
		writeOutput(getResult());
	}

	private void readInput() {
		try {
			Scanner sc = new Scanner(new File(input_file));
			N = sc.nextInt();
			S = new String[N];

			char[] char_array;

			for (int i = 0; i < N; i++) {
				S[i] = sc.next();
				
				if (alphabet_size < 8) {
					char_array = S[i].toCharArray();

					for (char aux : char_array) {
						alphabet.add(aux);
					}
					alphabet_size++;
				}	
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
		// dominant leter (order from the alphaber) | count of dominant leter, length
		res = new int[alphabet_size + 1][2];
		for (int i = 0; i < alphabet_size + 1; i++) {
			res[i][0] = res[i][1] = 0;
		}

		int i = 0;
		for (char aux : alphabet) {
			c = String.valueOf(aux);

			Arrays.sort(S, new SortByCharCount());

			for (String string : S) {
				if ((res[i][0] + charCount(string)) * 2 > res[i][1] + string.length()) {
					res[i][0] += charCount(string);
					res[i][1] += string.length();
				}
			}
			i++;
		}
		int max = 0;

		for (i = 0; i < alphabet_size + 1; i++) {
			max = Math.max(max, res[i][1]);
		}

		return max;
	}

	public static void main(String[] args) {
		Criptat task = new Criptat();

		task.solve();
	}
}
