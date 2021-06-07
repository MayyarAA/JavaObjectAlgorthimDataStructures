package holder;
import java.util.*;

public class SolverPtwo {
	
	public static void main(String[] args) {
		//twoSumcall
		int[] nums = {9,6,4,2,3,5,7,0,1};
		
		//System.out.println(one + " " + two );
		
		ListNode demoListNode = new ListNode(1);
		demoListNode.next = new ListNode(20);
		demoListNode.next.val = 2;
		demoListNode.next.next = new ListNode(3);
		demoListNode.next.next.next = new ListNode(4);
		demoListNode.next.next.next.next = new ListNode(5);
//		ListNode.print(demoListNode);
		
		
		BinaryTree demoTreeNode = new BinaryTree();
		demoTreeNode.add(1);
	
		
		
	}
	
	public static ListNode removeListLinkedV2(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    int length  = 0;
	    ListNode first = head;
	    while (first != null) {
	        length++;
	        first = first.next;
	    }
	    length -= n;
	    first = dummy;
	    while (length > 0) {
	        length--;
	        first = first.next;
	    }
	    first.next = first.next.next;
	    ListNode.print(dummy.next);
	    return dummy.next;
	    
	}
	
	public static ListNode removeElementatEndIndex(ListNode head, int n) {
		ListNode start = head;
		int counter =0;
		while( start!= null) {
			counter++;
			start = start.next;
			
		}
		
		int runForthislong = counter - n;
		
		ListNode editedListNode = new ListNode();
		counter =0;
		editedListNode = head;
		while(head.next != null) {
			editedListNode = head.next;
			head = head.next;
			counter++;
			if(counter == runForthislong) {
				head = head.next.next;
			}
		}
		
		return head;
	}
	
	public static ListNode reverseLinkedListV2(ListNode head) {
		ListNode holder1 = null;
		ListNode curr =head;
		while(curr!=null) {
			ListNode preserveState = curr.next;
			curr.next = holder1;
			holder1 = curr;
			curr = preserveState;
			
		}
		return holder1;
	}
	
	public static ListNode resverseLinkedList(ListNode head) {
		
		ListNode prev = null;
	    ListNode curr = head;
	    while (curr != null) {
	        ListNode nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
		
		
		
	}
	
	public static int missingNumber(int arr[]) {
		int foundMissingValue =0;
		Map<Integer,Integer> numsMap = new HashMap<>();
		for(int j =0 ; j < arr.length ; j ++) {
			numsMap.put(arr[j], j);
		}
		int[] sortedArr = insertSort(arr);
		
		for(int i =0 ;i < arr.length -1 ;i++) {
			if(1<=sortedArr[i+1] - sortedArr[i]) {
				foundMissingValue= arr[i]+1;
			}
			
		}
		
		return foundMissingValue;
	}
	
	public static int[] insertSort(int[] nums) {
		int n =nums.length;
		
		for(int i =1 ; i < n ;i++) {
			int key = nums[i];
			int j = i-1;
			while( j>=0 && nums[j] >key) {
				nums[j+1] = nums[j];
				j=j-1;
			}
			nums[j+1] = key;
		}

		return nums;
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }
	
	
	public static int finMaxValueArr(int[] nums) {
		int maxValue =0;
		for(int i =0; i< nums.length;i++) {
//			int currentMax = 0;
			for( int j =i ; j<nums.length ; j++) {
				if(maxValue < nums[j]) {
					maxValue=nums[j];
				}
				
			}
		}
		return maxValue;
	}
	
	public static int maxsumArr(int[] nums) {
//		int maxSum = nums[0];
		int maxSum = 0;
		for(int i =0 ; i < nums.length; i++) {
			int currentIntValue = nums[i];
			if( maxSum < (maxSum + currentIntValue)) {
				maxSum = maxSum + currentIntValue;
			}
			else if(maxSum < currentIntValue) {
				maxSum = currentIntValue;
			}
			else{
				maxSum = 0;
			}
		}
		return maxSum;
	    
	}
	
	public static boolean duplicateArrFcn(int[] nums) {
		boolean duplicateFound =false;
		Map<Integer,Integer> numsMap = new HashMap<>();
		for(int i =0 ; i < nums.length ; i++) {
			if(numsMap.containsKey(nums[i]) ) {
				return duplicateFound = true;
			}
			numsMap.put(nums[i],i);
		}
		
		
		return duplicateFound;
	}
	
	public static int stockPickV2(int[] prices) {
		int maxProfit = 0;
		Map<Integer, Integer> intHashMap = new HashMap<>();
		Map<Integer, Integer > intLinkedMap = new LinkedHashMap<>();
		for(int i =0 ; i<=prices.length ; i++) {
			intLinkedMap.put(prices[i],i);
		}
		for(int j =0 ; j <=intLinkedMap.size() ;j++) {
			//if(prices[])
		}
		
		return maxProfit;
	}
	
	public static int stockPick(int[] prices) {
		int maxProfit = 0;
		for(int i=0; i <= prices.length ; i++) {
			for(int j = i ; j <prices.length ; j++) {
				if( maxProfit < (prices[j] - prices[i])) {
					
					maxProfit = prices[j] - prices[i];
				}
			}
			
		}
		
		return maxProfit;
	}
	
	
	public static int[] twoSumHash(int[] nums, int target) {
		int[] outPut = new int[2];
		Map<Integer, Integer> intHashMap = new HashMap<>();
		
		for(int i=0; i < nums.length; i++) {
			intHashMap.put(nums[i], i);
		}
		for(int i =0 ; i< nums.length;i++) {
			
			int complement = ( target - nums[i] );
			if(intHashMap.containsKey(complement)) {
				outPut[0] = intHashMap.get(complement);
				outPut[1] = i;
				
			}
		}
		
		return outPut;
	}
	
	
	public static int[] twoSum(int[] nums , int target) {
		int[] outPut = new int[2];
		
		
		for(int i = 0; i <= nums.length ; i++) {
			
			for(int j = i ; j < nums.length ; j++) {
				if(target == (nums[i]+ nums[j])){
					outPut[0] = i;
					outPut[1] = j;
				}
			}
		}
		
		return outPut;
		
	}

}
