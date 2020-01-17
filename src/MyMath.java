import java.util.ArrayList;

/**
 * Math functions I've written for practice.
 * @author Jeremy Woo
 *
 */
public class MyMath {

	public static void main(String[] args) {
		System.out.println(getFactors(36));
	}
	
	/**
	 * returns positive factors of x
	 * @param x
	 * @return
	 */
	public static ArrayList<Integer> getFactors(int x) {
		ArrayList<Integer> factors = new ArrayList<>();
		
		for(int i = 1; i <= x; i++) {
			if(x % i == 0) {
				factors.add(i);
			}
		}
		
	return factors;
	}
	
}
