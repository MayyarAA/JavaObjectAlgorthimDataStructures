package holder;

import java.util.*;

public class SolverPe {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, -6, -7, 0 };
		int[] arrTwo = arr.clone();
		int[] num = {8,1,2,2,3};
		for (int i = 0; i < arr.length; i++) {

		}

		arrTwo[1] = 100;
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arrTwo));
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(num)));
		int n = arr.length;

		int max = maxProduct(arr, n);
		System.out.println(Math.sqrt(5));
		if (max == -1)
			System.out.println("No Triplet Exists");
		else
			System.out.println("Maximum product is " + max);

		numIdenticalPairs(num);
		
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] resultArr = new int[nums.length];
		int[] cloneNums = nums.clone();
		HashMap<Integer, Integer> nMap = new HashMap<>();
		HashMap<Integer, Integer> cloneValueMap = new HashMap<>();
		HashMap<Integer, Integer> indexMap = new HashMap<>();
		int leftCounter = 0;
		int rigthCounter = nums.length - 1;
		int currCounter = 0;
		Arrays.sort(cloneNums);
		//this will preserve the index of the value in the org arr
		for(int i=0;i<nums.length;i++) {
			if(indexMap.getOrDefault(nums[i], 0)==0 ) {
				indexMap.put(nums[i], i);
			}
			
		}
		
		
		// figure out how many duplicate values we have for each value
		for (int i = 0; i < cloneNums.length; i++) {
			nMap.put(cloneNums[i], nMap.getOrDefault(nMap.get(cloneNums[i]), 0) + 1);
		}

		// if the value has a clone and is not already updated
		for (int i = rigthCounter; i >0; i--) {

			if (nMap.getOrDefault(cloneNums[i],0)>1) {
				
				if(cloneValueMap.getOrDefault(cloneNums[i], 0) == 0) {
					cloneValueMap.put(cloneNums[i], nMap.getOrDefault(cloneNums[i], 0));
				}else {
					int valueOfIndex = cloneNums[i];
					resultArr[indexMap.get(valueOfIndex)] = nums.length - indexMap.get(valueOfIndex) - cloneValueMap.get(valueOfIndex);
				}
			}
		}

		for (int i = rigthCounter; i >0 ; i--) {
			int valueOfIndex = cloneNums[i];
			if (nMap.getOrDefault(cloneNums[i],0)>1) {
//				resultArr[indexMap.get(valueOfIndex)] = indexMap.get(valueOfIndex)-cloneValueMap.get(valueOfIndex);
			}else {
				resultArr[indexMap.get(valueOfIndex)] = i;
			}
			
		}

		return resultArr;
	}

	public static int numIdenticalPairs(int[] nums) {

		int numOfGoodPairs = 0;
		int leftCounter = 0;
		int rigthCounter = 1;

		HashMap<Integer, Integer> nMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			nMap.put(nums[i], nMap.getOrDefault(nums[i], 0) + 1);
		}

		for (int i = 0; i < nums.length; i++) {
			int num = nMap.get(nums[i]);
			if (num > 1) {
				numOfGoodPairs += num * (num - 1) / 2;
			}
			nMap.put(nums[i], 0);

		}

		return numOfGoodPairs;

	}

	public int lengthOfLongestSubstring(String s) {
	      int maxLenghtSubString=0;
			Set<Character> stringHashSet = new HashSet();
			if(s.isEmpty()) return maxLenghtSubString;
	        if (s.length() == 0 && s.isEmpty()) return maxLenghtSubString = 0;
			if(s.isBlank() || s.length()==1) return maxLenghtSubString=1;
			int rightCounter=0;
			int leftCounter=0;
			HashMap<Integer,Integer> nMap= new HashMap<Integer, Integer>();
//			nMap.ge
//			nMap.ge
			
			while(rightCounter<s.length()) {
				
				if(stringHashSet.contains(s.charAt(rightCounter))) {
					stringHashSet.remove(s.charAt(leftCounter));
					leftCounter++;
				}else {
					stringHashSet.add(s.charAt(rightCounter));
					rightCounter++;
				}
				maxLenghtSubString = Math.max(maxLenghtSubString, rightCounter-leftCounter);
			}
					
			
			return maxLenghtSubString;
	    }

	public static int perfectSquare(int A, int B) {
		int numOfSquare = 0;

		int counter = A;
		while (counter <= B) {
//			counter
			Math.sqrt(A);
		}

		return numOfSquare;
	}

	public int elvatorSolution(int[] A, int[] B, int M, int X, int Y) {
		int weigthSum = 0;
		int peopleSum = 0;
		int numOfStops;
		while (weigthSum < Y && peopleSum < X) {

		}
		return 0;
	}

	static int maxProduct(int[] arr, int n) {
		// if size is less than 3, no triplet exists
		if (n < 3)
			return -1;

		// Construct four auxiliary vectors
		// of size n and initailize them by -1
		int[] leftMin = new int[n];
		int[] rightMin = new int[n];
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		Arrays.fill(leftMin, -1);
		Arrays.fill(leftMax, -1);
		Arrays.fill(rightMax, -1);
		Arrays.fill(rightMin, -1);

		// will contain max product
		int max_product = Integer.MIN_VALUE;

		// to store maximum element on left of array
		int max_sum = arr[0];

		// to store minimum element on left of array
		int min_sum = arr[0];

		// leftMax[i] will contain max element
		// on left of arr[i] excluding arr[i].
		// leftMin[i] will contain min element
		// on left of arr[i] excluding arr[i].
		for (int i = 1; i < n; i++) {
			leftMax[i] = max_sum;
			if (arr[i] > max_sum)
				max_sum = arr[i];

			leftMin[i] = min_sum;
			if (arr[i] < min_sum)
				min_sum = arr[i];
		}

		// reset max_sum to store maximum element on
		// right of array
		max_sum = arr[n - 1];

		// reset min_sum to store minimum element on
		// right of array
		min_sum = arr[n - 1];

		// rightMax[i] will contain max element
		// on right of arr[i] excluding arr[i].
		// rightMin[i] will contain min element
		// on right of arr[i] excluding arr[i].
		for (int j = n - 2; j >= 0; j--) {
			rightMax[j] = max_sum;
			if (arr[j] > max_sum)
				max_sum = arr[j];

			rightMin[j] = min_sum;
			if (arr[j] < min_sum)
				min_sum = arr[j];
		}

		// For all array indexes i except first and
		// last, compute maximum of arr[i]*x*y where
		// x can be leftMax[i] or leftMin[i] and
		// y can be rightMax[i] or rightMin[i].
		for (int i = 1; i < n - 1; i++) {
			int max1 = Math.max(arr[i] * leftMax[i] * rightMax[i], arr[i] * leftMin[i] * rightMin[i]);

			int max2 = Math.max(arr[i] * leftMax[i] * rightMin[i], arr[i] * leftMin[i] * rightMax[i]);

			max_product = Math.max(max_product, Math.max(max1, max2));
		}

		return max_product;
	}

	// Driver code

}
