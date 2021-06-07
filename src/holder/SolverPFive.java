package holder;

import java.util.*;


public class SolverPFive {

	public static void main(String[] args) {
		int[] nums = {-3,2,3,3,6,8,15};
		long startTime = System.nanoTime();
		String resultArr = Arrays.toString(twoPointerSumSorted(nums,6));
		long endTime = System.nanoTime();
		long durationOne =   endTime - startTime;
		System.out.println("twoSumSortedP2 ran in " + durationOne + " " + "nanoSeconsds returning " + resultArr );
		
		startTime = System.nanoTime();
		String resultArrTwo = Arrays.toString(twoSumSortedP2(nums,6));
	
		endTime = System.nanoTime();
		durationOne =   endTime - startTime;
		System.out.println("twoSumSortedP2 ran in " + durationOne + " " + "nanoSeconsds returning " + resultArrTwo );
		int[] numsFour = {2,1,5,1,3,2};
		System.out.println(equiDisTwoPointer(numsFour,3));
		int[] a= {1,2,2,1};
		int[] b= {2,2};
		System.out.println(Arrays.toString(VenDiagram(a,b)));
	}
	
	
	
	
	public static Integer[] VenDiagram(int[] a, int [] b) {
		int[] intersect = new int[2];
		ArrayList<Integer> arrList = new ArrayList<>();
		HashMap<Integer, Integer> mapArr = new HashMap<>();
		HashMap<Integer, Integer> mapArrTwo = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			mapArr.put(a[i], i);
		}
		for(int i=0;i<b.length;i++) {
			mapArrTwo.put(b[i], i);
		}
		int minLenght = Math.min(mapArr.size(), mapArrTwo.size());
		
		for(int i = 0 ;i<b.length;i++) {
			if(mapArr.containsKey(b[i])) {
				arrList.add(b[i]);
			}
		}
		Integer[] array = arrList.toArray(new Integer[0]);
		return array;
	}
	
	public static List<String> fizzBuzz(int n){
		List<String> answer = new ArrayList<String>();
		int counter =0;
		for(int i =1;i <=n ;i++) {
			String str1 = Integer.toString(i); 
			counter++;
			if( i%3 ==0 & i%5==0) {
				answer.add("FizzBuzz");
			}
			else if(i%3 ==0) {
				answer.add("Fizz");
			}else if(i%5 ==0) {
				answer.add("Buzz");
			}else {
				answer.add(str1);
			}
		}
		return answer;
	}
	
	
	public static int[] twoPointerSumSorted(int[] nums, int target) {
		int[] sumArr = new int[2];
		int leftCounter = 0;
		int rightCounter = nums.length-1;
		int leftValue= nums[leftCounter];
		int rightValue= nums[rightCounter];
		int currSum=leftValue + rightValue;
		
		while(currSum!=target & leftCounter < rightCounter) {
			
			if(currSum > target) {
				rightCounter-=1;
				rightValue=nums[rightCounter];
			}else {
				leftCounter+=1;
				leftValue=nums[leftCounter];
			}
			currSum = leftValue + rightValue;
		}
		
		if(currSum == target) {
			sumArr[0] = leftCounter;
			sumArr[1] = rightCounter;
		}
		return sumArr;
	}
	
	public static int equiDisTwoPointer(int[] nums, int windowSize) {
		int[] maxSumArr = new int[windowSize];
		int currSum = 0;
		int maxSum=Integer.MIN_VALUE;
		
		for(int i=0;i<windowSize;i++) {
			maxSumArr[i] = nums[i];
			currSum+= maxSumArr[i];
		}
		
		maxSum=currSum;
		for(int j=windowSize;j<nums.length;j++) {
//			int 
			currSum = currSum + nums[j] - nums[j- windowSize];
			if(currSum>maxSum) {
				maxSum=currSum; 
				for(int k =0; k<windowSize;k++) {
//					maxSumArr[k] = 
				}
			}
				

		}
		
		return maxSum;
	}
	
	
	
	public static int[] twoSumSortedP3(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int result[] = new int[2];

		while (start < end) {
			int sum = nums[start] + nums[end];
			if (sum == target) {
				result[0] = start + 1;
				result[1] = end + 1;
				break;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}
		return result;
	}
	
	
	public static int[] twoSumSortedP2(int [] nums, int target) {
		int [] sumArr = new int[2];
		int counter = nums.length-1;
		int leftCounter= 0;
		int currSum=0;
		int leftValue=nums[leftCounter];
		int rightValue = nums[counter];
		currSum = leftValue + rightValue;
		while(currSum!=target && leftCounter < counter) {
			
			if(currSum > target) {
				counter-=1;
				rightValue = nums[counter];
			}else {
				leftCounter+=1;
				leftValue=nums[leftCounter];
			}
			currSum = leftValue + rightValue;
		}
		if(currSum == target) {
			sumArr[0] =leftCounter;
			sumArr[1] = counter;
		}
		return sumArr;
	}
	
	
	public static int[] twoSumP1(int[] nums, int target) {
		int[] sumArr = new int[2];
		
		for(int i =0;i < nums.length;i++ ) {
			int sumOne = nums[i];
			for(int j=i+1;j<nums.length; j++) {
				
				int sumTwo = nums[nums.length-1-j];
				if(sumOne+sumTwo == target ) {
					sumArr[0] = i;
					sumArr[1] = nums.length-i;
				}
			}
		}
		
		return sumArr;
	}
	
}
