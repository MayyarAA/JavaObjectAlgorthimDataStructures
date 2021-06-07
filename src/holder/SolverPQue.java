package holder;

import java.util.*;

public class SolverPQue {
	public static void main(String[] args) {
		PriorityQueue<Integer> MinPriorityQueue = new PriorityQueue<Integer>();
		// Creating empty priority queue
		PriorityQueue<Integer> pQueueMax = new PriorityQueue<Integer>(Collections.reverseOrder());

		MinPriorityQueue.add(3);
		MinPriorityQueue.add(1);
		MinPriorityQueue.add(2);
		System.out.println(MinPriorityQueue.peek());
		MinPriorityQueue.poll();
		System.out.println(MinPriorityQueue.peek());
		HashMap<Character, Integer> sMap = new HashMap<>();
		Set keys = sMap.keySet();
//		 keys.remove();
	}



	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for (char i : s.toCharArray()) {
			if (Character.isLetterOrDigit(i))
				sb.append(i);
		}
		String original = sb.toString();
		String reversed = sb.reverse().toString();
		return original.equalsIgnoreCase(reversed);
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		// k<arr/length()
		// distinct elements in arr
		// find k smallest
		int kMin = Integer.MAX_VALUE;
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		for (int i = 0; i < arr.length; i++) {
			pQueue.add(arr[i]);

		}
		for (int i = 0; i < k - 1; i++) {
			pQueue.poll();
		}
		kMin = pQueue.poll();
		return kMin;
	}

}
