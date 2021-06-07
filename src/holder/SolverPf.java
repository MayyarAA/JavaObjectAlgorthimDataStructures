package holder;

import java.util.*;

public class SolverPf {

	public static void main(String[] args) {
		int[][] num = { { 2, 1 }, { 4, 3, 2 } };
		ArrayList<Integer> list = new ArrayList<>(5);
		list.add(0);
		HashMap<Integer, Integer> nMap = new HashMap<Integer, Integer>();
		
//		System.out.println(list.get(2));
		int[] n1= {4,2,4,3,2};
		int[] n2= {0,0,1,3,1};		
				
		System.out.println(Arrays.toString(createTargetArray(n1, n2)));
		System.out.println(Arrays.toString(createTargetArrayV2(n1, n2)));
	}
	
	 public static int[] createTargetArrayV2(int[] nums, int[] index) {
	        ArrayList<Integer> targetArray = new ArrayList<Integer>();
	        
	        for(int i = 0; i < nums.length; i++) {
	        	int value = nums[i];
	        	int indexV=index[i];
	            targetArray.add(indexV, value);
	        }
	        
	        int[] solution = targetArray.stream().mapToInt(i -> i).toArray();

	        return solution;
	    }

	public static int[] createTargetArray(int[] nums, int[] index) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] arrList = new int[nums.length];
		int counter = 0;
		HashMap<Integer, Integer> nMap = new HashMap<>();
		for (int i = 0; i < index.length; i++) {
			nMap.put(index[i], nMap.getOrDefault(index[i], 0) + 1);
		}

		for (int i = 0; i < nums.length; i++) {
			int indexValue = index[i];
			int value = nums[i];
			int tempValue = 0;
			if (i == 0) {
				arrList[indexValue] = value;
				nMap.put(indexValue, nMap.getOrDefault(index[indexValue], 0) - 1);
			} else if (nMap.containsKey(indexValue) == true) {
				tempValue = arrList[indexValue];
				int innerTempValue = arrList[indexValue];
				for (int j = indexValue; j < nums.length - 1; j++) {
					tempValue = arrList[j + 1];
					arrList[j + 1] = innerTempValue;
					innerTempValue = tempValue;
				}
				arrList[indexValue] = value;
				nMap.put(indexValue, nMap.getOrDefault(indexValue, 0) - 1);
			} else {
				arrList[indexValue] = value;
			}
			if (nMap.getOrDefault(indexValue, 0) <= 0) {
				nMap.remove(indexValue);
			}

		}
		return arrList;
	}

	public int[] shuffle(int[] nums, int n) {
		int[] shuffledArr = new int[n * 2];
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.get(2));
		int i = 0;
		int k = 1;
		while (i < nums.length) {
			if (i == 0) {
				shuffledArr[i] = nums[i];
			} else if (i < n) {

				shuffledArr[i * 2] = nums[i];
			} else if (i >= n) {
				shuffledArr[k] = nums[i];
				k += 2;
			}

			i++;

		}

		return shuffledArr;
	}
}
