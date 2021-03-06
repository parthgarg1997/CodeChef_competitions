package codeshef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class codehef_solved_christmas {
	
	final static int MAX_SUM = 10001;
	final static int[] nDishes = new int[MAX_SUM];
	final static int MODULO = 10000000;
	/***
	 * Count the answer
	 * @param N - the number of ingredients
	 * @param tasteScores - the satse scores of the ingredients
	 * @param nDishes - a temporary  array of size 10001;
	 * @return
	 */
	public static long makeTest (int N, int[] tasteScores, int[] nDishes) {
		//count the sum of all ingregients
		int totalSum = 0;
		//flush the temporary array
		Arrays.fill(nDishes, 0);
		nDishes[0] = 1;
				
		for (int i = 0; i < N; i++) {
			totalSum += tasteScores[i];
			//we iterate on the ingredients. 
			//iterate on the sum of the dish ingredients, from q = score of the current ingredient to q = current max sum
			//the idea is dynamic programming:
			//the number of dishes with a total score q composed of (N+1) ingredients is linked with the number of dishes composed 
			//of N ingredients. this link is used below
			for (int q = totalSum; q >= tasteScores[i]; q--) {
				nDishes[q] = (nDishes[q] + nDishes[q-tasteScores[i]])%MODULO;
			}
			
		}
		
		long result = 0;
 
		for (int q = 0; q <= totalSum; q++) {
			//seems like an overflow happens... so we have to use long here.
			long increment = ((long)nDishes[q]) * ((long)Math.abs(2*q - totalSum));
			result = (result + increment % MODULO
							) % MODULO;
		}
		
		return result;
	}
	
 
	public static void main (String[] args) {
		try {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int nTests = Integer.valueOf(reader.readLine());
		for (int t = 0; t < nTests; t++) {
			int N = Integer.valueOf(reader.readLine());
			int[] tastes = new int[N];
			String[] strTastes = reader.readLine().split("\\s");
			//read the tastes
			for (int j = 0; j < N; j++) {
				tastes[j] = Integer.valueOf(strTastes[j]);
			}
		
			long result = makeTest(N, tastes, nDishes);
			System.out.println(result);
			
		}
		reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
