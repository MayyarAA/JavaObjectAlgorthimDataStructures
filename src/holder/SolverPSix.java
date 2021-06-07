package holder;

import java.util.*;

public class SolverPSix {

	public static void main(String[] args) {
		System.out.println(isAnagram("aacc", "ccac"));
		String a = "";

//		System.out.println(longestSubStringNoRepear("abcabcbb"));
		int [] arr= {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
		int[] arr2 = {1, 4, 45, 6, 0, 19};
		System.out.println(minLenghtSubArrLargerThanGivenSum(arr,280));
		System.out.println(minLenghtSubArrLargerThanGivenSumV2(arr2,51));

	}
	
	
	public static int minLenghtSubArrLargerThanGivenSumV2(int[] nums, int target) {
		int minSubArrLenght = Integer.MAX_VALUE;
		int rightCounter=-1;
		int leftCounter=0;
		int currSum=0;
//		currSum = nums[0];
		while(rightCounter < nums.length-1) {
			if(currSum < target) {
				rightCounter+=1;
				currSum+=nums[rightCounter];
			}else {
				
				leftCounter+=1;
				currSum-=nums[leftCounter];
			}
			if(currSum > target) minSubArrLenght = Math.min(minSubArrLenght, rightCounter-leftCounter);
			
		}
		return minSubArrLenght;
	}
	

	// find smallest subarr with sum greater than target
	public static int minLenghtSubArrLargerThanGivenSum(int[] nums, int target) {
		ArrayList<Integer> subArr = new ArrayList<Integer>();
		int minSubArrLenght = Integer.MAX_VALUE;
		int currSum = 0;

		for (int i = 0; i < nums.length; i++) {
			currSum = nums[i];
//			minSubArrLenght += 1;
			int counter = i+1;
			while (currSum < target && counter < nums.length-1) {
				currSum += nums[counter];
				counter++;
//				minSubArrLenght += 1;

			}
			if(currSum>target) {
				
				minSubArrLenght = Math.min(minSubArrLenght, counter - i);
			}
			
		}

		return minSubArrLenght;
	}

	public static int longestSubStringNoRepear(String s) {
		int subStringMaxLenght = Integer.MIN_VALUE;
		Set<Character> set = new HashSet<>();
		if (s.length() == 0 && s.isEmpty())
			return subStringMaxLenght = 0;
		if (s.isBlank() || s.length() == 1)
			return subStringMaxLenght = 1;
		if (s.isEmpty())
			return subStringMaxLenght = 0;

		int left = 0;
		int right = 0;
		while (right < s.length()) {
			if (set.contains(s.charAt(right)) != true) {
				set.add(s.charAt(right));
				right++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
			subStringMaxLenght = Math.max(subStringMaxLenght, right - left);
		}

		return subStringMaxLenght;
	}

	public static int longestSubStringNoRepearV1(String s) {
		int subStringMaxLenght = Integer.MIN_VALUE;
		if (s.length() == 0 && s.isEmpty())
			return subStringMaxLenght = 0;
		if (s.isBlank() || s.length() == 1)
			return subStringMaxLenght = 1;
		if (s.isEmpty())
			return subStringMaxLenght = 0;
		int currMaxLenght = 0;
		for (int i = 0; i < s.length(); i++) {
			HashMap<Character, Integer> sMap = new HashMap<>();

			int counter = i;
			while (sMap.containsKey(s.charAt(counter)) != true && counter < s.length() - 1) {
				sMap.put(s.charAt(counter), 0);
				counter++;
			}
			if (i == 0 && counter == i + 1)
				counter = 0;
			subStringMaxLenght = Math.max(subStringMaxLenght, counter - i);
			currMaxLenght = 0;

		}

		return subStringMaxLenght;
	}

	public static boolean isAnagram(String s, String t) {
		boolean areAnagram = false;
		if (s.length() != t.length()) {
			return areAnagram;
		}
		HashMap<Character, Integer> sMap = new HashMap<>();
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			int numOfChar = sMap.getOrDefault(s.charAt(i), 0);
			sMap.put(s.charAt(i), numOfChar);
		}
		for (int k = 0; k < t.length(); k++) {
			if (sMap.containsKey(t.charAt(k))) {
				counter++;
			}
		}

		if (counter == t.length()) {
			areAnagram = true;
		}

		return areAnagram;
	}
}
