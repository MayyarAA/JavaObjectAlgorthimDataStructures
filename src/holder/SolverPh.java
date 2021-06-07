package holder;

import java.util.*;

public class SolverPh {

	public static void main(String[] args) {
		System.out.println(findTwiceChar("bajka"));
		System.out.println(maxValuePlacingNum(-999));
		int[] nums = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int X = 3;

		System.out.println(solutionV2(X, nums));

	}
	
	public static int solutionV2 (int X, int[] A){

	    int[]counter = new int[X+1];
	    int ans = -1;
	    int x = 0;

	    for (int i=0; i<A.length; i++){
	        if (counter[A[i]] == 0){
	            counter[A[i]] = A[i];
	            x += 1;
	            if (x == X){
	                return i;
	            }
	        } 
	    }

	    return ans;
	}

	public static int solution(int X, int[] A) {
		HashMap<Integer, Integer> leafsNeeded = new HashMap<>();
		int minTimeToGo = -1;
		int[] numsArr = new int[X+1];
		int sum=0;
		for (int i = 0; i < A.length; i++) {
			if (numsArr[A[i]] == 0) {
				numsArr[A[i]] = 1;
				sum+=1;
			}

			if (numsArr[X] == 1 && sum==X) {
				minTimeToGo = i ;
				break;
			}
		}
//
//		for (int i = 1; i <= X; i++) {
//			leafsNeeded.put(i, 1);
//		}
//
//		for (int i = 0; i < A.length; i++) {
//
//			if (leafsNeeded.containsKey(A[i])) {
//
//				leafsNeeded.put(A[i], 0);
//			}
//
//			if (!leafsNeeded.containsValue(1)) {
//				if (X == 1) {
//					minTimeToGo = 0;
//				} else {
//
//					minTimeToGo = i;
//					break;
//				}
//			}
//		}

		return minTimeToGo;
	}

	public static int maxValuePlacingNum(int num) {
		int negNum = 0;
		StringBuilder numString = new StringBuilder();
		int maxValue = Integer.MIN_VALUE;
		int keyValue = 5;
		int indexOfInsert = 0;
		if (num < 0) {
			negNum = -1 * num;
			numString.append(String.valueOf(negNum));
		} else {
			numString.append(String.valueOf(num));
		}

		String numberString = numString.toString();

		int[] numCharArr = new int[numberString.length()];
		int[] numCharArrTwo = new int[numberString.length() + 1];

		for (int i = 0; i < numberString.length(); i++) {
			numCharArr[i] = Character.getNumericValue(numberString.charAt(i));
		}

		for (int i = 0; i < numCharArr.length; i++) {
			if (negNum == 0) {

				if (keyValue > numCharArr[i]) {
					numCharArrTwo[i] = keyValue;
					indexOfInsert = i;
					break;
				}
			} else if (negNum != 0) {
				if (keyValue < numCharArr[i]) {
					numCharArrTwo[i] = keyValue;
					indexOfInsert = i;
					break;
				}
			}

		}
		for (int i = 0; i < indexOfInsert; i++) {
			numCharArrTwo[i] = numCharArr[i];
		}
		for (int i = indexOfInsert; i < numCharArr.length; i++) {
			numCharArrTwo[i + 1] = numCharArr[i];
		}
		maxValue = turnIntArrToInt(numCharArrTwo);
		if (negNum != 0) {
			maxValue = -1 * maxValue;
		}
		return maxValue;
	}

	public static int maxValuePlacingNumHelperNegative(int num) {
		num = -1 * num;
		int maxValue = Integer.MIN_VALUE;
		int keyValue = 5;
		int indexOfInsert = 0;
		String numberString = String.valueOf(num);

		int[] numCharArr = new int[numberString.length()];
		int[] numCharArrTwo = new int[numberString.length() + 1];

		for (int i = 0; i < numCharArr.length; i++) {
			numCharArr[i] = Character.getNumericValue(numberString.charAt(i));
		}
		for (int i = 0; i < numCharArr.length; i++) {
			if (keyValue < numCharArr[i]) {
				numCharArrTwo[i] = keyValue;
				indexOfInsert = i;
				break;
			}
		}
		for (int i = 0; i < indexOfInsert; i++) {
			numCharArrTwo[i] = numCharArr[i];
		}
		for (int i = indexOfInsert; i < numCharArr.length; i++) {
			numCharArrTwo[i + 1] = numCharArr[i];
		}
		maxValue = turnIntArrToInt(numCharArrTwo);
		return (-1 * maxValue);
	}

	public static int turnIntArrToInt(int[] numsArr) {
		int maxValue = Integer.MIN_VALUE;
		StringBuilder stringNumber = new StringBuilder();
		for (int i = 0; i < numsArr.length; i++) {

			stringNumber.append(numsArr[i]);
		}

		maxValue = Integer.valueOf(stringNumber.toString());
		return maxValue;
	}

	public static String findTwiceChar(String str) {
		char[] repeated = new char[1];
		HashMap<Character, Integer> strMap = new HashMap<>();
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0) + 1);
			if (strMap.get(str.charAt(i)) == 2) {
				strBuilder.append(str.charAt(i));

			}
		}

		return strBuilder.toString();
	}

}
