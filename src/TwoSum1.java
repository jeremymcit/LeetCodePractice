import java.util.Arrays;

public class TwoSum1 {
	public static int[] twoSum(int[] nums, int target) {

		// array to store solution
		int[] solution = new int[2];


		// changed to true when the solution is found
		boolean solved = false;
		// the outer loop index
		int oIndex = 0;


		while (!solved) {
			//inner loop index
			int iINdex = 0;
			while(iINdex < nums.length && !solved) {
				int currentSum = nums[oIndex] + nums[iINdex];
				if(currentSum == target && oIndex != iINdex) {
					solution[0] = oIndex;
					solution[1] = iINdex;
					solved = true;
				}
				iINdex ++;
			}
			oIndex ++;
			
		}

		if (solution[0] > solution[1]) {
			int p = solution[0];
			solution[0] = solution[1];
			solution[1] = p;
		}

		return solution;

	}

}