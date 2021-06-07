package holder;

import java.util.*;

public class SolverPd {

	public static void main(String[] args) {
		int[] nums = { 1, 3 };
		int[] nums2 = { 5, 2, 8 };
		long[] nums3 = { 6, 3, 4, 5, 4, 3, 7, 9 };

//		System.out.println(getMoneySpentV2(nums, nums2, 10));
		System.out.println(sb(nums3, nums3.length, 16));
		Arrays.toString(nums);

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode combine = new ListNode();
//		int[] arr = new int[];
//		arr.length

		return null;
	}

	public static int getMoneySpentV2(int[] keyboards, int[] drives, int b) {
		int currSum = 0;
		int maxSum = 0;
		int kCounter = 0;
		int dCounter = 0;
		
		int[] keyboardsDesc = Arrays.stream(keyboards).boxed().sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue).toArray();
		int[] drivesDesc = Arrays.stream(drives).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();
		System.out.println(Arrays.toString(keyboards));

		while (kCounter < keyboardsDesc.length && dCounter < drivesDesc.length) {
			int loopSum = keyboardsDesc[kCounter] + drivesDesc[dCounter];
			int sum1 = 0;
			int sum2 = 0;

			if (dCounter + 1 < drivesDesc.length) {
				sum1 = (keyboardsDesc[kCounter] + drivesDesc[dCounter + 1]);
			}
			if (kCounter + 1 < keyboardsDesc.length) {
				sum2 = (keyboardsDesc[kCounter + 1] + drivesDesc[dCounter]);
			}

			if ((loopSum) > b) {

				if (sum1 > sum2) {
					dCounter++;
				} else {
					kCounter++;
				}

			} else {
				if (loopSum > maxSum) {
					maxSum = loopSum;
				}

				if (sum1 > sum2) {
					dCounter++;
				} else {
					kCounter++;
				}

			}
		}

		return maxSum;
	}

	public static long sb(long a[], long n, long x) {
		int leftCounter = 0;
		int rigthCounter = 0;
		long currSum = a[leftCounter];
		int minLength = Integer.MAX_VALUE;
		long g=10;
		
		while (rigthCounter < n) {
			if (currSum <= x) {
				if (rigthCounter == n - 1) {
					break;
				} else {
					rigthCounter += 1;
					currSum = currSum + a[rigthCounter];

				}

			} else {
				if (currSum > x) {
					if (minLength > (rigthCounter - leftCounter)) {
						minLength = rigthCounter - leftCounter + 1;
					}

				}
				currSum = currSum - a[leftCounter];
				leftCounter++;

			}
		}
		return minLength;
	}

	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int currSum = 0;
		int maxSum = -1;
		int rigthCounter = 0;
		for (int i = 0; i < keyboards.length; i++) {
			currSum += keyboards[i];
			while (currSum < b || rigthCounter < drives.length) {
				currSum = drives[rigthCounter];
				if (currSum > maxSum && currSum != keyboards[i] && currSum != drives[rigthCounter]) {
					maxSum = currSum;
				}
			}

		}
		return rigthCounter;
	}

}
