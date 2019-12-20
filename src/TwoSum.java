import java.util.Arrays;
//unfinished
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {

		// array to store solution
		int[] solution = new int[2];

		// original nums
		int[] originalNums = nums.clone();

		// sorts the array
		Arrays.sort(nums);

		// changed to true when the solution is found
		boolean solved = false;
		// the lower index starting point
		int currentIndexLower = 0;

		/*
		 * outside loop for going through all iterations of each lower index until
		 * establishing not ok or there is a solution
		 */
		while (!solved) {

			/*
			 * index of limits for the currentIndexUpper given the currentIndexLower. The
			 * limits are non-inclusive (if the limit is 0, then it is possible that 0 is
			 * part of the solution)
			 */
			int upperLimitIndex = nums.length - 1;
			int lowerLimitIndex = currentIndexLower + 1;

			// current index of the upper number (should be in the middle of the upper and
			// lower limits)
			int currentIndexUpper = (upperLimitIndex - lowerLimitIndex) / 2 + lowerLimitIndex;

			// inside loop for going through every upper index
			while (!solved && currentIndexUpper < nums.length && currentIndexUpper > currentIndexLower) {
				// current sum
				int currentSum = nums[currentIndexLower] + nums[currentIndexUpper];

				// sum is too low
				if (currentSum < target) {
					lowerLimitIndex = currentIndexUpper + 1;
					currentIndexUpper = (((upperLimitIndex - lowerLimitIndex) / 2) + lowerLimitIndex);
				}
				// sum is too high
				else if (currentSum > target) {
					upperLimitIndex = currentIndexUpper - 1;
					currentIndexUpper = (((upperLimitIndex - lowerLimitIndex) / 2) + lowerLimitIndex);
				}
				// solution found
				else {
					solution[0] = currentIndexLower;
					solution[1] = currentIndexUpper;
					solved = true;
				}

			}
			currentIndexLower++;

		}

		solution = getOriginalIndex(solution, originalNums, nums);

		return solution;

	}

	private static int[] getOriginalIndex(int[] solution, int[] originalNums, int[] nums) {
		int[] realSolution = new int[2];
		int actualNumber1 = nums[solution[0]];
		int actualNumber2 = nums[solution[1]];
		boolean solved1 = false;
		boolean solved2 = false;
		int index1 = 0;
		int index2 = 0;

		while (!solved1) {
			if (actualNumber1 == originalNums[index1]) {
				realSolution[0] = index1;
				solved1 = true;
			}
			index1++;
		}
		while (!solved2) {
			if (actualNumber2 == originalNums[index2] && index2 != solution[0]) {
				realSolution[1] = index2;
				solved2 = true;
			}
			index2++;
		}

		return realSolution;
	}
}