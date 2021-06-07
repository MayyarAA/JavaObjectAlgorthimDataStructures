package holder;

import java.util.*;

class SumObject {
	int sumValue;
	HashSet<Integer> sumPairs = new HashSet<>();

	public SumObject() {

	}

	public SumObject(int sumValue, int sumPair) {
		this.sumValue = sumValue;
		this.sumPairs.add(sumPair);
	}

	public void addPair(int pair) {
		this.sumPairs.add(pair);
	}

}

public class SolverAs {

	public static void main(String[] args) {
		int nums[] = {42,33,60}; 
//			{42,33,60}; 
//			{51,32,43};
//			{ 51,71,17,42 };

//		solutionOld(10410);
		System.out.println(solution(nums));
		HashMap<Integer, Integer> nMap = new HashMap<>();

		SumObject resultMap = new SumObject(10, 5);
		resultMap.addPair(92);
//		System.out.println(resultMap.sumPairs);

	}

	public class sumObject {
		int sumValue;
		HashSet<Integer> sumPairs = new HashSet<>();

		public sumObject(int sumValue, int sumPair) {
			this.sumValue = sumValue;
			this.sumPairs.add(sumPair);
		}

	}

	public static int solution(int[] A) {

		int leftCounter = 0;
		int currSum = 0;
		int sumMax = 0;

		HashMap<Integer, Integer> sumMap = new HashMap<>();

		while (leftCounter < A.length) {
			int sumOfDigits = 0;
			int value = A[leftCounter];
			while (value > 0) {
				sumOfDigits += value % 10;
				value = value / 10;
			}
			if (sumMap.containsKey(sumOfDigits)) {
				currSum = A[leftCounter] + sumMap.get(sumOfDigits);
				sumMax = Math.max(sumMax, currSum);
			} else {
				sumMap.put(sumOfDigits, A[leftCounter]);
			}
			leftCounter++;

		}

		if (sumMax == 0) {
			sumMax = -1;
		}
		return sumMax;
	}

}
