package holder;

import java.util.*;

public class SolverPc {

	public static void main(String[] args) {
		int[] nums = { 5, 1, 3, 4, 7 };
		int sum = 12;
//		System.out.println(countTriplets(nums, sum));

		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(4);
		swapPairs(node1);

		List<Integer> holder3 = new ArrayList<>();
		holder3.add(3);

		List<Integer> holder = new ArrayList<>();
		holder.add(0, 11);
		holder.add(1, 2);
		holder.add(2, 4);

		List<Integer> holder2 = new ArrayList<>();
		holder2.add(0, 4);
		holder2.add(1, 5);
		holder2.add(2, 6);
		List<Integer> holder4 = new ArrayList<>();
		holder4.add(10);
		holder4.add(8);
		holder4.add(-12);
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(holder3);
		arr.add(holder);
		arr.add(holder2);
		arr.add(holder4);
		List<Integer> holder5 = new ArrayList<>();

		holder5.add(1);
		holder5.add(2);
		holder5.add(5);
		holder5.add(3);
		holder5.add(4);
		holder5.add(7);
		holder5.add(8);
		holder5.add(6);
//		System.out.println(Arrays.toString(rotLeft(holder5, 4).toArray()));
//		System.out.println(diagonalDifference(arr));

		int[] arrTwo = new int[8];
		String temp = "2 1 5 3 4";
		List<Integer> tempCharArr = new ArrayList<>();
		for(int i =0;i<temp.length();i++) {
			if (temp.charAt(i) != ' ') {
				
				tempCharArr.add(Character.getNumericValue(temp.charAt(i)));
			}
		}
		
		Character.isDigit(tempCharArr.get(1));
		minimumBribes(tempCharArr);

	}
	
	public static void minimumBribes(List<Integer> q) {
        int size= q.size();
        int numOfTotalBribes = 0;
        TreeMap<Integer,Integer> tMap = new TreeMap<>();
        
        int counter=0;
        boolean toChaotic = false;
        while(counter<size){
            int value = q.get(counter);
            int diffForBribe=0;
            if((value-counter-1)>=0) {
            	diffForBribe = value-counter-1;
			} else if (counter + 1 <size&& counter>0 &&value<q.get(counter-1) & value> q.get(counter+1) ) {
            	diffForBribe +=1;
            }
            if(diffForBribe >2){
            	toChaotic=true;
                System.out.println("Too chaotic");
//                System.out.println(diffForBribe);
//                return;
            }
            
                numOfTotalBribes+=diffForBribe;
            
            counter++;
        }
        if(!toChaotic) {
        	
        	System.out.println(numOfTotalBribes);
//        	if(toChaotic)  System.out.println("Too chaotic");
        }
    }


	public static List<Integer> rotLeft(List<Integer> a, int d) {

		int size=a.size();
        System.out.println(size);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<size;i++){
            int index = (i+d)%size;
            int value = a.get(index);
            arr.add(value);
        }
		return arr;
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int sum1 = 0;
		int sum2 = 0;
		int size = arr.get(0).get(0);
		int finalSum = 0;
		ArrayList<Integer> indexValueList = new ArrayList<>();
		ArrayList<Integer> indexValueListSecond = new ArrayList<>();
		arr.remove(0);

		for (int i = 0; i < size; i++) {
			indexValueList.add(arr.get(i).get(i));
			indexValueListSecond.add(arr.get(i).get((size - i - 1)));
			sum1 += indexValueList.get(i);
			sum2 += indexValueListSecond.get(i);
		}

//		for (int k = 0; k < indexValueList.size(); k++) {
//			sum1 += indexValueList.get(k);
//			sum2 += indexValueListSecond.get(k);
//		}
		finalSum = Math.abs((sum1 - sum2));
		return finalSum;

	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		if (a.size() == 0)
			return b;
		if (b.size() == 0)
			return a;
		int[] pointsForBothPlayers = new int[2];
		List<Integer> valueOfEachPlayer = new ArrayList<>(2);

		valueOfEachPlayer.add(0, 0);
		valueOfEachPlayer.add(0, 0);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				// pointsForBothPlayers[0]+=1;
				valueOfEachPlayer.set(0, valueOfEachPlayer.get(0) + 1);
			} else if (a.get(i) < b.get(i)) {
				// pointsForBothPlayer[1]+=1;
				valueOfEachPlayer.set(1, valueOfEachPlayer.get(1) + 1);
			}

		}

		return valueOfEachPlayer;

	}

	public static ListNode swapPairs(ListNode head) {

		ListNode temp = new ListNode(0);
		int a = 0;
		temp.next = head;
		ListNode currNode = temp;
		int b = a;
		while (currNode.next != null && currNode.next.next != null) {
			b = 55;
			ListNode firstNode = currNode.next;
			ListNode secondNode = currNode.next.next;
			firstNode.next = secondNode.next;
			currNode.next = secondNode;
			currNode.next.next = firstNode;
			currNode = currNode.next.next;

		}
		return temp.next;

	}

	public static int countTriplets(int[] nums, int sum) {
		int validSmallerThanSumTriplets = 0;

		for (int i = 0; i < nums.length; i++) {
			int sumfir = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int sumSec = nums[j];
				for (int k = j + 1; k < nums.length; k++) {
					int sumThr = nums[k];
					if (sumfir + sumSec + sumThr < sum) {
						validSmallerThanSumTriplets += 1;
					}
				}
			}
		}

		return validSmallerThanSumTriplets;
	}

}


