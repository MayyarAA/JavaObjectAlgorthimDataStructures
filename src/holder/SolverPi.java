package holder;

import java.util.*;

public class SolverPi {

	public static void main(String[] args) {

//		System.out.println(Arrays.toString(letterCombinations("23").toArray()));
		List<String> holder = new ArrayList<>();
		String[] values = { "hot", "dot", "dog", "lot", "log", "cog" };
		List<String> sourceList = Arrays.asList(values);
		System.out.println(sourceList);
		for (int i = 0; i < values.length; i++) {
			holder.add(values[i]);
		}
		List<Integer> temp = new LinkedList<>();
		System.out.println(temp.size());

//		System.out.println(ladderLength("hit","cog",holder));
	}

	



	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Queue<String> queueWord = new LinkedList<>();
		queueWord.add(beginWord);
//	     queueWord.

		boolean[] visitedNode = new boolean[wordList.size()];
		Arrays.fill(visitedNode, false);
		visitedNode[0] = true;
		String[] visitedArr = new String[wordList.size()];

		return 0;
	}

	public static List<String> letterCombinations(String digits) {

		List<String> resultList = new ArrayList<>();
		if (digits.isEmpty()) {
			return resultList;
		}

		HashMap<Integer, String> nMap = new HashMap<>();
		nMap.put(2, "abc");
		nMap.put(3, "def");
		nMap.put(4, "ghi");
		nMap.put(5, "jkl");
		nMap.put(6, "mno");
		nMap.put(7, "pqrs");
		nMap.put(8, "tuv");
		nMap.put(9, "wxyz");
		// 23
		// stringBuild.length==digits.length ==> ad
		// ae
		letterComboRecursive(resultList, "", 0, digits, nMap);
		return resultList;
	}

	public static void letterComboRecursive(List<String> resultList, String currentString, int index, String digits,
			HashMap<Integer, String> nMap) {
		if (currentString.length() == digits.length()) {

			resultList.add(currentString);
			return;
		}

		int valueOfDigit = Character.getNumericValue(digits.charAt(index));
		int length = nMap.get(valueOfDigit).length();
		for (int i = 0; i < length; i++) {
			letterComboRecursive(resultList, currentString + nMap.get(valueOfDigit).charAt(i), index + 1, digits, nMap);
		}

	}

}
