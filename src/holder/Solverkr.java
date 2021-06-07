package holder;
import java.util.*;
public class Solverkr {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(kLargestElement()));
		int[] nums = {1, 3, 6, 4, 1, 2};
//		System.out.println(solution(nums));
		
		
	}
	
	
		public static int[] kLargestElement() {
		PriorityQueue<Integer> pQueue
        = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		int[] nums= new int[2];
		pQueue.add(4);
		pQueue.add(25);
		pQueue.add(100);
		pQueue.add(15);
		pQueue.add(1);
		pQueue.add(2);
		
		nums[0] = pQueue.poll();
		nums[1] = pQueue.poll();
		
		
		return nums;
	}
	
	
	public static int precentAge() {
		List<Integer> allValues = new ArrayList<>();
//		List<List<Integer>> tempList = ArrayList<>();
		allValues.add(0);
		allValues.add(0);
		allValues.add(19);
		allValues.add(39);
		allValues.add(20);
		allValues.add(29);
		allValues.add(40);
		allValues.add(44);
		
		Object[] holder = allValues.toArray();
		Arrays.sort(holder);
//		System.out.println(Arrays.toString(holder));
		if(holder[0] instanceof Integer) {
			System.out.println(0);
		}
		int sum=0;
		int counter=1;
		for(int i =0;i<holder.length-1;i++) {
//			sum += (holder[counter]) - holder[i]);
			counter++;
		}
		
		
		return sum;
		
	}
	
	public static int precentAgeV2() {
		List<Integer> allValues = new ArrayList<>();
		
//		List<List<Integer>> tempList = ArrayList<>();
		allValues.add(0);
		allValues.add(0);
		allValues.add(98);
		allValues.add(98);
//		allValues.add(20);
//		allValues.add(29);
//		allValues.add(39);
//		allValues.add(40);
//		allValues.add(44);
		
		int sum=0;
		int counter=1;
		for(int i =0;i<allValues.size()-1;i++) {
			sum +=  ( allValues.get(counter) - allValues.get(i));
			counter++;
		}
		
		
		return sum+1;
		
	}
	public static int precentAgeV3() {
		List<Integer> allValues = new ArrayList<>();
		
//		List<List<Integer>> tempList = ArrayList<>();
		allValues.add(0);
		allValues.add(0);
		allValues.add(1);
		allValues.add(1);
		Integer[] holder = new Integer[allValues.size()];
		allValues.toArray(holder);
//		allValues.add(2);
//		allValues.add(2);
//		allValues.add(3);
//		allValues.add(3);
//		allValues.add(4);
//		allValues.add(4);
//		allValues.add(5);
//		allValues.add(5);
//		allValues.add(6);
//		allValues.add(6);
//		allValues.add(7);
//		allValues.add(7);
		
		int sum=0;
		int counter=1;
		for(int i =0;i<allValues.size()-1;i++) {
			sum +=  ( allValues.get(counter) - allValues.get(i));
			counter++;
		}
		
		
		return sum+1;
		
	}

}
