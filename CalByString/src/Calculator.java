import java.io.*;
import java.util.StringTokenizer;

public class Calculator {
	public static void main(String[] args) throws IOException {
		// reading from console
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("insert the numbers(ex. 1, 2):");
		String strNums = br.readLine();

		// splitting a string with multiple separator
		String separator = ",\\n";
		StringTokenizer separated = new StringTokenizer(strNums, separator);

		// convert string[] to int[]
		int[] nSeparated = new int[separated.countTokens()];
		int i = 0;
		while (separated.hasMoreTokens()) {
			nSeparated[i] = Integer.parseInt(separated.nextToken());
			i++;
		}
		//operation
		int result = 1;
		for (int m = 0; m < nSeparated.length; m++)
			result = result * nSeparated[m];
		System.out.println(result);
	}
}
