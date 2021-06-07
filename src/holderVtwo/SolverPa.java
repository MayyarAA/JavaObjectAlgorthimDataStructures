package holderVtwo;

import holder.ListNode;
import holder.TreeNode;
import holder.*;
import java.util.*;

public class SolverPa {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 10, 4, 2, 7, 8, 1, 3 };
//		System.out.println(5/2);
//		subsets(nums);
		HashMap<Integer, Integer> nMap = new HashMap<>();
//		nMap.getOrDefault(key, defaultValue)
//		reverseAscendingSubArrays(nums);

		Person oneP = Person.getInstance(45);
		Person oneTwo = Person.getInstance(20);
		oneTwo.weight = 100;
		System.out.println(oneP.weight);
		System.out.println(oneTwo.weight);
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		int g= 10;
		int sd=14;
		nMap.put(g,sd);
		System.out.println(nMap.get(g));
//		System.out.println(migratoryBirds(list));
		// .list.co

		PriorityQueue<Integer> pQ = new PriorityQueue<>();
//		pQ.is

	}
}
	
	public static void reverseAscendingSubArrays(int[] items) {

		int leftCounter = 0;
		int rightCounter = 1;
		int totalCounter = 0;
		int temp = 0;
		int miniLenght = 0;
		while (rightCounter < items.length) {
			if (items[leftCounter] > items[rightCounter]) {

				if (items[leftCounter] > items[rightCounter] && items[leftCounter] < temp) {
					leftCounter++;
					rightCounter++;
					totalCounter++;
					continue;
				}
				int newLenght = items.length - rightCounter;
				newLenght = newLenght - totalCounter;
				int lengthOfSubArray = items.length - leftCounter;
//				int lengthOfSubArray = items.length-totalCounter;
				lengthOfSubArray = items.length - lengthOfSubArray + 1;
				temp = reverse(items, miniLenght, temp);
				rightCounter++;
				leftCounter++;
				totalCounter = lengthOfSubArray;

			} else {
				rightCounter++;
				miniLenght = (items.length - rightCounter) - (rightCounter - leftCounter + 1);
				if (miniLenght < 1)
					miniLenght = miniLenght * -1;
				leftCounter++;
			}

		}

	}

	public static int reverse(int a[], int n, int tempOne) {

		int leftCounter = 0;
		int rightCounter = n - 1;
		tempOne = a[rightCounter];
		while (rightCounter > leftCounter) {
			int temp = a[leftCounter];
			a[leftCounter] = a[rightCounter];
			a[rightCounter] = temp;
			rightCounter--;
			leftCounter++;
		}
		return tempOne;
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> resultList = new ArrayList<>();
		subSetsHelper(nums, resultList, new ArrayList<Integer>(), 0);
		return resultList;
	}

	public static void subSetsHelper(int nums[], List<List<Integer>> resultList, ArrayList<Integer> holder, int index) {
//	        resultList.add(new ArrayList<>(holder));
		resultList.add((holder));

		if (index > nums.length) {
			return;
		}

		List<Integer> temp = new ArrayList<>();
		for (int i = index; i < nums.length; i++) {
			holder.add(nums[i]);
			subSetsHelper(nums, resultList, holder, i + 1);
			holder.remove(holder.size() - 1);
		}

	}

	public static int maxProfit(int[] prices) {
		int maxprofit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1])
				maxprofit += prices[i] - prices[i - 1];
		}
		return maxprofit;
	}

	public static void listFcn(ArrayList<Integer> list, int value) {
		if (list.contains(10)) {
//			return list;
		}

		list.add(10);

	}

}
