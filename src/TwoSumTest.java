import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	@Test
	void testTwoSum() {
		int[] expected0 = {1,2,3};
		int[] actual0 = {1,2,3};
		int[] actual00 = {1,2,3};
		int[] expected00 = {0,2,3};
		assertTrue(Arrays.equals(expected0, actual0));
		assertFalse(Arrays.equals(expected00, actual00));
		
		int [] testNums1 = {2,7,11,15};
		int targetTest1 = 9;
		int[] actual1 = TwoSum.twoSum(testNums1, targetTest1);
		int[] expected1 = {0, 1};
		assertTrue(Arrays.equals(expected1, actual1));

		int [] testNums2 = {84, 3, 98, 100};
		int targetTest2 = 198;
		int[] actual2 = TwoSum.twoSum(testNums2, targetTest2);
		int[] expected2 = {2, 3};
		assertTrue(Arrays.equals(expected2, actual2));
		
		
		int [] testNums3 = {-100, 3, -201, 6};
		int targetTest3 = 9;
		int[] actual3 = TwoSum.twoSum(testNums3, targetTest3);
		int[] expected3 = {1, 3};
		assertTrue(Arrays.equals(expected3, actual3));
		
		
		int [] testNums4 = {1,2};
		int targetTest4 = 3;
		int[] actual4 = TwoSum.twoSum(testNums4, targetTest4);
		int[] expected4 = {0,1};
		assertTrue(Arrays.equals(expected4, actual4));
		
		
		int [] testNums5 = {9,7,5,4,2,6,100};
		int targetTest5 = 106;
		int[] actual5 = TwoSum.twoSum(testNums5, targetTest5);
		int[] expected5 = {5, 6};
		assertTrue(Arrays.equals(expected5, actual5));
		
		int [] testNums6 = {3,3};
		int targetTest6 = 6;
		int[] actual6 = TwoSum.twoSum(testNums6, targetTest6);
		int[] expected6 = {0, 1};
		for(int i : actual6) {
			System.out.println(i);
		}
		assertTrue(Arrays.equals(expected6, actual6));
		
		
		int [] testNums7 = {3,2, 3};
		int targetTest7 = 6;
		int[] actual7 = TwoSum.twoSum(testNums7, targetTest7);
		int[] expected7 = {0, 2};

		assertTrue(Arrays.equals(expected7, actual7));
		
	}

}
