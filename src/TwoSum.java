import java.util.Arrays;

// run time should be theta n ln n
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {

		// the place to store the actual numbers (not the indexes of the numbers)
		int answer1 = 0;
		int answer2 = 0;

		// gets copy of nums
		int[] newNums = nums.clone();

		// sorts newNums
		Arrays.sort(newNums);

		int index = 0;
		boolean solved = false;
		while (!solved && index < nums.length) {
			int possibleSolution = Arrays.binarySearch(newNums, target - newNums[index]);
			if(possibleSolution >= 0 && possibleSolution < newNums.length) {
				answer1 = newNums[possibleSolution];
				answer2 = newNums[index];
			}
			
			if (answer1 + answer2 == target && index != possibleSolution) {
				solved = true;

			} else {
				index++;
			}
		}
		
		System.out.println(answer1);
		System.out.println(answer2);
		

		// array to store solution
		int[] solution = new int[2];
		boolean a1found = false;
		boolean a2found = false;
		int index1 = 0;
		while(!a1found) {
			if(answer1 == nums[index1]) {
				solution[0] = index1;
				a1found = true;
			}
			index1 ++;
		}
		index1 = 0;
		while(!a2found) {
			if(answer2 == nums[index1]  && index1 != solution[0]) {
				solution[1] = index1;
				a2found = true;
			}
			index1 ++;
		}


		if (solution[0] > solution[1]) {
			int temp = solution[1];
			solution[1] = solution[0];
			solution[0] = temp;
		}

		return solution;
	}
}
