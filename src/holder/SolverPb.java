package holder;

import java.util.*;

public class SolverPb {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 0, 0, 0, 1, 1 };
		int[] numss = { 0, 1, 0 };
		System.out.println(findMaxLengthV1(nums));
		System.out.println(findMaxLengthEvenBinaryArr(nums));
		System.out.println(buddyString("ab", "ab"));
	}

	public static int findMaxLengthV1(int[] nums) {
		int maxLenght = 0;

		int leftCounter = 0;
		int rightCounter = 0;

		for (int i = 0; i < nums.length; i++) {
			leftCounter = i;
			rightCounter = i;
			HashMap<Integer, Integer> numsMap = new HashMap<>();
			while (rightCounter < nums.length) {

				numsMap.put(nums[rightCounter], numsMap.getOrDefault(nums[rightCounter], 0) + 1);
				if (numsMap.get(0) == numsMap.get(1)) {
					maxLenght = Math.max(maxLenght, (rightCounter - i) + 1);

				}
				rightCounter++;

			}

		}

		return maxLenght;

	}

	public static int findMaxLengthEvenBinaryArr(int[] nums) {
		int maxLenght = 0;

		int leftCounter = 0;
		int rightCounter = 0;

		for (int i = 0; i < nums.length; i++) {
			leftCounter = i;
			rightCounter = i;
			HashMap<Integer, Integer> numsMap = new HashMap<>();
			int numOfZero = 0;
			int numOfOne = 0;
			while (rightCounter < nums.length) {
				if (nums[rightCounter] == 0) {
					numOfZero++;
				} else {
					numOfOne++;
				}

				if (numOfOne == numOfZero) {
					maxLenght = Math.max(maxLenght, numOfOne + 1);
				}

//				numsMap.put(nums[rightCounter], numsMap.getOrDefault(nums[rightCounter], 0) + 1);
//				if (numsMap.get(0) == numsMap.get(1)) {
//					maxLenght = Math.max(maxLenght, rightCounter - leftCounter + 1);
//
//				}
				rightCounter++;

			}

		}

		return maxLenght;
	}

	public static String defangIPaddr(String address) {
		if (address.isBlank())
			return " ";
		if (address.isEmpty())
			return null;
		StringBuilder defangString = new StringBuilder();
		char[] addressChar = address.toCharArray();
		for (int i = 0; i < addressChar.length; i++) {

			if (addressChar[i] == '.') {
				defangString.append("[.]");
			} else {

				defangString.append(addressChar[i]);
			}
		}

		return defangString.toString();
	}

	public static boolean buddyString(String A, String B) {
		if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            int[] count = new int[26];
            for (int i = 0; i < A.length(); ++i)
                count[A.charAt(i) - 'a']++;

            for (int c: count)
                if (c > 1) return true;
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && A.charAt(first) == B.charAt(second) &&
                    A.charAt(second) == B.charAt(first));
        }
    }
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> canHaveGreatest = new ArrayList<>();

		int currMaxNum = Integer.MIN_VALUE;
		for (int i = 0; i < candies.length; i++) {

			currMaxNum = Math.max(candies[i], currMaxNum);
		}
		for (int j = 0; j < candies.length; j++) {
			if (candies[j] + extraCandies >= currMaxNum) {
				canHaveGreatest.add(true);
			} else {
				canHaveGreatest.add(false);
			}
		}

		return canHaveGreatest;
	}

	public static List<List<Integer>> subsets(int[] nums) {

		List<Integer> minSubSet = new ArrayList<>();
		List<List<Integer>> largeHolderSet = new ArrayList<>();

		int leftCounter = 0;
		int rightCounter = nums.length;
		for (int i = 0; i < nums.length; i++) {
			List<Integer> currSubSet = new ArrayList<>();
//			currSubSet

		}

		return null;
	}

}
