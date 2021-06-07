package holder;

import java.util.*;

public class SolverPk {

	public static void main(String[] args) {

		long startTime = System.nanoTime();
		System.out.println(letterForNumbernIndex(3, 1));
		long endTime = System.nanoTime();
		System.out.println("letterForNumbernIndexV2 " + " ran in " + (endTime - startTime) + " s");

		startTime = System.nanoTime();
		System.out.println(letterForNumbernIndex(1, 1));
		endTime = System.nanoTime();
		System.out.println("letterForNumbernIndex " + " ran in " + (endTime - startTime) + " s");
		System.out.println(Arrays.toString(letterCombinations("23").toArray()));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> allValues = new ArrayList<>();
		if(digits.isEmpty()) {
			return allValues;
		}
		

		StringBuilder resultString = new StringBuilder();
		String[] strArr = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		addToStringRecursive(allValues, digits, "", 0, strArr);
		return allValues;
	}

	public static void addToStringRecursive(List<String> allValues, String digits, String current, int index,
			String[] mapping) {
		if (index == digits.length()) {
			allValues.add(current);
			return;
		}
		int numValue = Character.getNumericValue(digits.charAt(index));
		String letters = mapping[numValue];
		for (int i = 0; i < letters.length(); i++) {
			addToStringRecursive(allValues, digits, current+letters.charAt(i), index + 1, mapping);
		}

	}

	public static String letterForNumbernIndex(int num, int index) {
		HashMap<Integer, String> nMap = new HashMap<>();
		nMap.put(2, "abc");
		nMap.put(3, "def");
		nMap.put(4, "ghi");
		nMap.put(5, "jkl");
		nMap.put(6, "mno");
		nMap.put(7, "pqrs");
		nMap.put(8, "tuv");
		nMap.put(9, "wxyz");
		if (num == 2) {
			if (index == 0) {
				return "a";
			} else if (index == 1) {
				return "b";
			} else if (index == 2) {
				return "c";
			}
		} else if (num == 3) {
			if (index == 0) {
				return "d";
			} else if (index == 1) {
				return "e";
			} else if (index == 2) {
				return "f";
			}
		} else if (num == 4) {
			if (index == 0) {
				return "g";
			} else if (index == 1) {
				return "h";
			} else if (index == 2) {
				return "i";
			}
		}

		return " ";
	}

}
