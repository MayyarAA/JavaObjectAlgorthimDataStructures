package holder;

import java.util.*;

public class SolverPex {

	public static void main(String[] args) {
//		hashFunction("helloH");
		System.out.println(findAllDuplicates("abbcdea"));
		String a = "cba";
		String b = "cba";
		char[] tArr = a.toCharArray();
		char[] bArr = b.toCharArray();
		Arrays.sort(tArr);
		Arrays.sort(bArr);

		System.out.println(Arrays.toString(tArr));
		if (a.equals(b)) {
			System.out.println("yes");
		}

	}

	public String minWindow(String s, String t) {
		if (t.length() > s.length())
			return "";
		if (t.length() == s.length()) {
			if (t.equals(s)) {
				return s;
			}
		}
		System.out.println("helloa");
		HashMap<Character, Integer> nMap = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			nMap.put(t.charAt(i), nMap.getOrDefault(t.charAt(i), 0) + 1);
		}
		// now have nMap containing all of t
		int counter = 0;
		ArrayList<String> values = new ArrayList<>();
		int indexOfValuesMin = 0;
		int minLength = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {
			HashMap<Character, Integer> nMapClone = (HashMap<Character, Integer>) nMap.clone();
			if (s.length() - (i) < t.length() && t.length() != 1) {
				break;
			}
			StringBuilder holder = new StringBuilder();
			char currChar = s.charAt(i);
			if (nMapClone.getOrDefault(currChar, 0) > 0) {
				values.add(minWindowHelper(nMapClone, i, s, t, holder));
				nMapClone.put(currChar, nMapClone.getOrDefault(currChar, 0) - 1);
			}

		}
		System.out.println(Arrays.toString(values.toArray()));
		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) != "") {

				int currLength = 0;
				currLength = values.get(i).length();

				if (currLength < minLength) {
					minLength = currLength;
					indexOfValuesMin = i;

				}
			}

		}
		if (values == null) {
			return "";
		}
		if (values.size() == 0) {
			return "";
		}

		return values.get(indexOfValuesMin);

	}

	public String minWindowHelper(HashMap<Character, Integer> nMap, int index, String s, String t,
			StringBuilder holder) {
		HashMap<Character, Integer> nMapClone = (HashMap<Character, Integer>) nMap.clone();
		int counter = 0;
		int foundChar = t.length();
		int currIndex = index;
		while (currIndex < s.length()) {
			char currChar = s.charAt(currIndex);
			holder.append(currChar);
			if (nMapClone.getOrDefault(currChar, 0) > 0) {
				nMapClone.put(currChar, nMapClone.getOrDefault(currChar, 0) - 1);
				foundChar--;
			}
			if (foundChar == 0) {
				return holder.toString();
				// break;
			}
			currIndex++;
		}
		return "";
	}

	public static String findAllDuplicates(String str) {
//		char[] repeated = new char[1];
		HashMap<Character, Integer> strMap = new HashMap<>();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			if (strMap.containsKey(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
			strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0) + 1);

		}

		return strBuilder.toString();
	}

	public static void hashFunction(String str) {
		HashSet<Character> hashValue = new HashSet<Character>();
		HashMap<Character, Integer> hashMapValue = new HashMap<>();
		StringBuilder sBuilder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			hashValue.add(str.charAt(i));
			hashMapValue.put(str.charAt(i), i);
		}
		for (int i = 0; i < hashMapValue.size(); i++) {

//			sBuilder.append(hashValue.remove(str.charAt(i)));
		}
		System.out.println(hashValue.toString());
		System.out.println(sBuilder.toString());
	}

}
