
public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		String prefix = "";
		if (strs.length > 0) {

			
			boolean completed = false;
			int currentLetterIndex = 0;

			// get length of shortest word
			int lenghtOfShortestWord = strs[0].length();
			for (String i : strs) {
				if (i.length() < lenghtOfShortestWord) {
					lenghtOfShortestWord = i.length();
				}
			}

			while (!completed && currentLetterIndex < lenghtOfShortestWord) {
				char currentLetter = strs[0].charAt(currentLetterIndex);
				for (String i : strs) {
					if (i.charAt(currentLetterIndex) != currentLetter) {
						completed = true;
					}
				}
				if (!completed) {
					prefix = prefix.concat(Character.toString(currentLetter));
					currentLetterIndex++;
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] str = {};
		String result = longestCommonPrefix(str);
		System.out.println(result);
	}
}
