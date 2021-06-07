package holder;

import java.util.*;

public class SolverPl {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		ListNode head = new ListNode();
		ListNode head2 = new ListNode();
		head.addListNode(nums, head);

		mergeTwoLists(head,head2);

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode mergedList = new ListNode(0);
		ListNode currNode = mergedList;
		while (l1 != null && l2 != null) {
			if (l1.val >= l2.val) {
				currNode.next = l2;
				l2 = l2.next;
			} else {
				currNode.next = l1;
				l1 = l1.next;
			}
			currNode = currNode.next;
		}
		if (l1 == null) {
			currNode.next = l2;
		} else if (l2 == null) {
			currNode.next = l1;
		}
		return mergedList.next;

	}

	public static ListNode reverseNode(ListNode head) {

		ListNode temp = null;
		while (head != null) {
			ListNode prev = head.next;
			head.next = temp;
			temp = head;
			head = prev;
		}

		return temp;
	}

	public static ListNode middleNode(ListNode head) {
		ListNode currNode = head;
		ListNode prevNode = head;
		ListNode holder = new ListNode(9);
		int[] nums = { 2, 42, 32, 43 };
		holder.addListNode(nums, holder);
//		prevNode = holder;
		while (currNode != null && currNode.next != null) {
			prevNode = holder;
			prevNode = prevNode.next;
//					prevNode.next;
			currNode = currNode.next.next;
		}

		return prevNode;
	}

	public static void rearange(int[] array) {
		int[] numsTwo = { 0, 1, 0, 0, 0 };
		array[0] = 20;
		array = numsTwo;
	}

	public static int findMaxLength(int[] nums) {
		// given int[] nums, full of 1 or 0
		// return longest subarry w/ equal 0 & 1
		int maxLenght = 0;
		int counter = 0;
		// <counter,index>
		HashMap<Integer, Integer> nMap = new HashMap<>();
		// [0,0,1,1,0,1,1]
		for (int i = 0; i < nums.length; i++) {
			counter += (nums[i] == 1 ? 1 : -1);
			if (nMap.containsKey(counter)) {
				maxLenght = Math.max(maxLenght, i - nMap.get(counter));
			} else {
				nMap.put(counter, i);
			}
		}
		return maxLenght;

	}

}
