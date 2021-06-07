package holder;
import java.util.*;

public class SolverPFour {

	public static void main(String[] args) {
		String str = "PWWKEW";
		longestStringNoRepeat(str);
		int[] numArr = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
		
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i =0; i<numArr.length ;i++) {
			nums.add(numArr[i]);
		}
//		System.out.println(numberOfSocks(10, nums));
		
		int[] num1 = {1,2,3,4,5};
		System.out.println(Arrays.toString(rotLeft(num1,1)));
	
	}
	 public static int[] rotLeft(int[] a, int d) {
		 int[] aShifted = new int[a.length];
		 Stack<Integer> aStack = new Stack<>();
		 Queue<Integer> aQueue = new LinkedList();
		 
//		 for(int i =0;i <d/2;i++) {
//			int firInt = a[i];
//			int secInt = a[a.length-i];
//			a[i] = secInt;
//			a[a.length-i] = firInt;
//		 }
		 
		 for(int i =0; i <a.length;i++) {
			 int newLocation = (i + (a.length - d)) % a.length;
			 a[newLocation]= a[i];
		 }
		 
		 return a;
	    }
	
	//Done
	public static int numberOfSocks(int nlenght, List<Integer>nums) {
		int numberOfPairs =0;
		HashMap<Integer,Integer> socksMap = new HashMap<>();
		
		for(int i=0;i<nlenght ;i++) {
			int sockAtIndex = nums.get(i);
			int numOfcurrentSocks = socksMap.getOrDefault(sockAtIndex, 0);
			socksMap.put(sockAtIndex, numOfcurrentSocks+1);
		}
		
		for(int j=0;j<nlenght;j++) {
			int sockAtIndexTwo = nums.get(j);
			if(socksMap.get(sockAtIndexTwo) != null && socksMap.get(sockAtIndexTwo) > 1) {
				numberOfPairs+= socksMap.get(sockAtIndexTwo) /2;
				socksMap.remove(sockAtIndexTwo);
			}
		}
		
		return numberOfPairs;
	}
	
	
	
		public static int[] runningSum(int[] nums) {
			int[] runningSumArr = new int[nums.length];
			int currentSum=0;
			for(int i =0;i<nums.length;i++) {
				currentSum+=nums[i];
				runningSumArr[i] = currentSum;
			}
			
			return runningSumArr;
		}
	
	public static String shortestSubString(String s, String t) {
		StringBuilder shortestSubString = new StringBuilder();
		HashMap<Character,Integer> tHashMap= new HashMap<>();
		int windowStartIndex=0;
		int windowEndIndex =0;
		int windowMinSize= Integer.MAX_VALUE;
		int counter=0;
		int[] windowSizeArr= new int[2];
		for(int i =0;i<t.length();i++) tHashMap.put(t.charAt(i), i);
		
		for(int j = 0 ; j<s.length();j++) {
			windowStartIndex=j;
			
//			while(counter <t.length()) {
			for(int k=j;k<s.length();k++) {
				
				if(tHashMap.containsKey(s.charAt(k))) {
					counter++;
				}
				windowEndIndex+=1;
			}
//			windowMinSize=Math.max(windowMinSize, windowEndIndex-windowStartIndex);
			if(windowEndIndex-windowStartIndex <= windowMinSize) {
				windowSizeArr[0]=windowStartIndex;
				windowSizeArr[1] = windowEndIndex;
			}
			
		}
//		for(int g =window)
		
		return shortestSubString.toString();
		
	}
	
	public static void longestStringNoRepeat(String str) {
		Queue<Character> subStringQueue = new LinkedList<>();
		HashMap<Character,Integer> subStringMap = new HashMap<>();
		int windowStartIndex=0;
		int windowEndIndex=0;
		int maxWindowSize=0;
		
		for(int i=0;i<str.length();i++) {
			windowEndIndex+=1;
			subStringMap.put(str.charAt(i), subStringMap.getOrDefault(str.charAt(i), 0) + 1);
			subStringQueue.add(str.charAt(i));
			
//			while(subStringMap.containsKey(str.charAt(i)) ) {
			if(subStringMap.containsKey(str.charAt(i)) && subStringMap.get(str.charAt(i)) > 1) {
			
				subStringMap.remove(str.charAt(windowStartIndex));
				windowStartIndex+=1;
			while(subStringMap.getOrDefault((str.charAt(i)),0) > 1) {
				subStringQueue.remove(str.charAt(windowStartIndex));
				
				subStringMap.remove(windowStartIndex-1);
				windowStartIndex+=1;
				subStringMap.put(str.charAt(i), subStringMap.getOrDefault(str.charAt(i), 0) -1);
				if(subStringMap.get(str.charAt(i)) <1) {
					subStringMap.remove(str.charAt(i));
				}
				
			}
			}
//			if(!subStringMap.containsKey(str.charAt(i))) {
				
//			}
			maxWindowSize =Math.max(maxWindowSize, windowEndIndex-windowStartIndex);
			
			
		}
//		return maxWindowSize;
		System.out.println( maxWindowSize + " " + subStringMap.toString());
	}
}
