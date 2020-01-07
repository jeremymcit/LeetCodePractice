import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//not leetcode
public class DealOrNoDealMonteCarlo {

	public static void main(String[] args) {
	int resultIn1 = 0;
	double resultInNegative1 = 0;
	
	//runs the simulation x number of times
	int x = 100000000;
	for(int i = 0; i < x; i ++) {
		int result = singleSimulation();
		if(result == 1) {
			resultIn1 ++;
		} else if(result == -1) {
			resultInNegative1 ++;
		}
	}
	
	System.out.println("Number of times holding 750: " + resultIn1);
	System.out.println("NUmber of times hold 5: "  + resultInNegative1);
	System.out.println(resultIn1/resultInNegative1);
	
	}

	/*
	 * 0 represents the situation where the first chosen case is neither 750 nor 5,
	 * or the first case is either of the two but the remaining case is not 750 or 5
	 * 
	 * 1 represents the remaining case is 5 and the first chosen case is 750
	 * -1 represents the remaining case is 750 and the first chosen case is 5
	 */
	private static int singleSimulation() {
		/*
		 * array list of the cases
		 */
		List<Integer> cases = new ArrayList<>();
		/*
		 * 24 cases are filled with 0 (representing any case other than $5), 1 is filled
		 * with 5, and one is filled with 750
		 */
		for (int i = 0; i < 24; i++) {
			cases.add(0);
		}
		cases.add(5);
		cases.add(750);
		// the cases are shuffled
		Collections.shuffle(cases);

		/*
		 * the first case is chosen representing a random choice of a case at the
		 * begining of the game. Then it is removed from the cases.
		 */
		int myChosenCase = cases.get(0);
		cases.remove(0);

		
		int remainingCase = 100;
		int result = 100;
		if(myChosenCase == 5 || myChosenCase == 750) {
			/*
			 * the cases are shuffled, then the first case is removed. This is repeated until there is only one more remaining case
			 */
			while(cases.size() > 1) {
				Collections.shuffle(cases);
				cases.remove(0);
			}
			remainingCase = cases.get(0);
		} else {
			result = 0;
		}


		
		/*
		 * 0 represents the situation where the first chosen case is neither 750 nor 5,
		 * or the first case is either of the two but the remaining case is not 750 or 5
		 * 
		 * 1 represents the remaining case is 5 and the first chosen case is 750
		 * -1 represents the remaining case is 750 and the first chosen case is 5
		 */
		
		if(remainingCase == 750) {
			result = -1;
		} else if (remainingCase == 5) {
			result = 1;
		} else {
			result = 0;
		}
		

		return result;
	}
}
