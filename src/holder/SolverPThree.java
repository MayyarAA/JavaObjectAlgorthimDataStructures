package holder;
import java.util.*;
public class SolverPThree {

	public static void main(String[] args) {
		
		String  s = "XYYZXZYZXXYZ";
		String	t = "XYZ" ;
		String str= "AAAHHIBC";
//		validAnagramV2(s,t);
		int [] nums = {4,2,2,7,8,1,2,8,1,0};
		longestSubArr(nums);		
		smallestSubArrSum(nums, 8);
		longestSubString(str.toCharArray(),3);
	}
	
	public static void longestSubArr(int[] nums) {
//		Arrays.sort(nums);
		
		for(int i =0; i <nums.length;i++) {
			
		}
		
	}
	
	public static void longestSubString(char[] str, int k) {
		HashMap<Character,Integer> windowMap = new HashMap<>();
		Queue<Character> subString = new LinkedList();
		int windowStartIndex=0;
		int windowEndIndex = 0;
		int maxLength=0;
		
		for(int i =0; i < str.length;i++) {
			char rightChar = str[i];
			subString.add(rightChar);
			windowMap.put(str[i], windowMap.getOrDefault(rightChar, 0) + 1);
			windowEndIndex++;
			while(windowMap.size() > k) {
				char windowStartChar = subString.remove();
			
				windowMap.put(windowStartChar, windowMap.getOrDefault(windowStartChar, 0) -1);
				
				if(windowMap.get(windowStartChar)==0) {
					windowMap.remove(windowStartChar);
				}
				windowStartIndex--;
			}
			maxLength = Math.max(maxLength, windowEndIndex + windowStartIndex -1); 
		}
		System.out.println(maxLength);
		
	}
	
	public static void smallestSubArrSum(int[] nums, int sumS) {
		int minSubArrSize = Integer.MAX_VALUE;
		int windowStartIndex=0;
		int windowEndIndex=0;
		int windowSum = 0;
		
		for(int i =0; i < nums.length;i++){
			windowSum += nums[i];
			windowEndIndex++;
			while(windowSum >=8) {
				minSubArrSize = Math.min(minSubArrSize, windowEndIndex-windowStartIndex);
				windowSum-=nums[windowStartIndex];
				windowStartIndex++;
			}
		}
		System.out.println(minSubArrSize);
	}
	
	public static void maxSumSliding(int[] nums, int windowSize) {
		int potentialSum=0;
		
		for(int i=0;i<windowSize;i++) {
			potentialSum+= nums[i];
		}
		
		for(int j=windowSize;j<nums.length;j++) {
			int currentSum = potentialSum + nums[j] - nums[j - windowSize];
			potentialSum= Math.max(currentSum, potentialSum);
		}
		System.out.println(potentialSum);
	}
	
	public static void maxZeroSwitchV1(int[] nums, int k) {
		int windowSum=0;
		for(int i =0;i<nums.length ;i++) {
			if(nums[i]==1) {
				
				windowSum += 1;
			}
			else {
				windowSum=0;
			}
		}
	}
	
	public static void validAnagramV2(String s, String t) {
		HashMap<Character, Integer> anagramMap = new HashMap<>();
		int counter =0;
		StringBuilder subString = new StringBuilder();
		char[] subStringCharArr = new char[t.length()];
		for(int i =0 ; i <t.length();i++) {
			anagramMap.put(t.charAt(i), i);
		}
		for(int j = 0; j< s.length(); j++) {
			if(anagramMap.containsKey(s.charAt(j)) && j<=s.length()-t.length()) {
				subString.delete(0, t.length());
				subString.append(s, j, (j + t.length()));
				
				subStringCharArr = subString.toString().toCharArray();
				Arrays.sort(subStringCharArr);
				if(Arrays.equals(subStringCharArr, t.toCharArray())) {
					System.out.println(subString);
				}
				
			}
		}
	}
	
	public static void validAnagramWSliding(String s, String t) {
	
		
		
		int windowSize = t.length();
		char[] subStringWindow = new char[3];
		char[] anagramCharArr = t.toCharArray();
		Arrays.sort(anagramCharArr);
		char[] candiateAnagram = new char[windowSize] ;
		for(int i = 0 ; i<windowSize ; i ++) {
			candiateAnagram[i] = s.charAt(i);
		}
	
		
		for(int i =windowSize; i< s.length()  ; i ++) {
			String holder = new String(candiateAnagram);
			subStringWindow = candiateAnagram;
			Arrays.sort(subStringWindow);
			
			if(Arrays.equals(anagramCharArr, subStringWindow)) {
				System.out.println(holder + " " + (i+1));
			}
			for(int j =0 ; j < windowSize-1;j++) {
				candiateAnagram[j] = candiateAnagram[j+1];
			}
			candiateAnagram[windowSize-1] = s.charAt(i);
		}
		
		
		
	}
	
	public static boolean validAnagram(String s, String t) {
		boolean isAnagram = false;
		if(s.length() != t.length()) {
			return isAnagram;
		}
		
		char[] sCharArr = s.toCharArray();
		char[] tCharArr = t.toCharArray();
		
		Arrays.sort(sCharArr);
		Arrays.sort(tCharArr);
		
		isAnagram = Arrays.equals(sCharArr, tCharArr);
		
		return isAnagram;
	}
	
	public static int slidingWindowV2(int[] arr, int num) {
		int maxSum=0;
		int windowSum=0;
		for(int i =0 ; i < num;i++) {
			windowSum = windowSum + arr[i];
		}
		for(int j = num ; j< arr.length;j++) {
			windowSum = windowSum + arr[j] - arr[j-num];
			if(windowSum > maxSum) maxSum=windowSum;
		}
		
		return maxSum;
	}
	
	public static int slidingWindow(int[] arr , int num) {
		int[] maxSumArr = new int[]{4};
		int maxSum= 0;
		
		
		for(int i =0;i<(arr.length-num);i++) {
			int windowSum = 0;
			for(int j =i ; j< (i+num); j++) {
				windowSum = windowSum+ arr[j]; 
				
			}
			if(windowSum > maxSum) maxSum = windowSum;
		
		}
		
		return maxSum;
	}
	
	public static String minWindowOfString(String s, String t) {
		StringBuilder minResultWindow = new StringBuilder();
		HashMap<Character,Integer> charKeyMap = new HashMap<>();
		ArrayList<List<Character>> foundWindows = new ArrayList<>();
		for(int k =0; k < t.length() ; k++) {
			charKeyMap.put(t.charAt(k), k);
		}
		for(int i = 0 ; i < s.length() ; i++) {
			ArrayList<Character> possibleWindow = new ArrayList<>();
			if(charKeyMap.containsKey(s.charAt(i))) {
				possibleWindow.add(s.charAt(i));
			};
			foundWindows.add(possibleWindow);
		}
		int sizeOfWinodw = 0;
		
		for( int i =0 ; i< foundWindows.size()-1;i++) {
			sizeOfWinodw = foundWindows.get(i).size();
			if(sizeOfWinodw > foundWindows.get(i+1).size()) {
				minResultWindow.append(foundWindows.get(i+1).toString());
			}
		}
		return minResultWindow.toString();
	}
	
	public static List<List<String>> groupAnagrams(String[] strs){
		ArrayList<List<String>> anagramList = new ArrayList<>();
		
		
		for(int i =0 ; i< (strs.length /2); i++) {
			ArrayList<String> foundAnagramList = new ArrayList<>();
			foundAnagramList.add(strs[i]);
			for(int j=(i+1) ; j< strs.length ; j++) {
				if(anagramV1(strs[i],strs[j])) {
					foundAnagramList.add(strs[j]);
				}
			}
			anagramList.add(foundAnagramList);
		}
		
		return anagramList;
	}
	
	
	public static boolean anagramV1(String s, String t) {
	
		if (s.length() != t.length()) {
	        return false;
	    }
	    int[] table = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	        table[s.charAt(i) - 'a']++;
	    }
	    for (int i = 0; i < t.length(); i++) {
	        table[t.charAt(i) - 'a']--;
	        if (table[t.charAt(i) - 'a'] < 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
