
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		boolean isPalindrome = false;
		if (x < 0) {
		} else {
			isPalindrome = true;
			String myString = Integer.toString(x);
			int lowerIndex = 0;
			int upperIndex = myString.length() - 1;
			boolean notPalindrome = false;
			while(lowerIndex < upperIndex && !notPalindrome) {
				if(myString.charAt(lowerIndex) != myString.charAt(upperIndex)) {
					notPalindrome = true;
					isPalindrome = false;
				}
				upperIndex --;
				lowerIndex ++;
			}
		}

		return isPalindrome;
	}
}
