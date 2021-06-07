package holder;

import java.util.*;

public class SolverPa {

	public static void main(String[] args) {
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		System.out.println(longestSubStringWithNoRepeat("au"));
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);

		node1.next.next.next = new ListNode(4);
//		node1.next.next.next.next = new ListNode(5);
//		node1.next.next.next.next.next = new ListNode(6);
//		System.out.println((swapPairs(node1)));
		System.out.println(firstUniqChar("loveleetcode"));
		

	}
	
	public static Character firstUniqChar(String str) {
		int indexNonRepeatChar=-1;
		Character nonRepeatCharacter = 'a';
		TreeMap<Character,Integer> strMap = new TreeMap<>(); 
		
		for(int i =0;i<str.length();i++) {
			strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0)+1);
			
		
		}
		for(int j=0;j<str.length();j++) {
			if(strMap.get(str.charAt(j)) ==1) {
				indexNonRepeatChar=j;
				nonRepeatCharacter=str.charAt(j);
				break;
			}
		}
		
		return nonRepeatCharacter;
	}
	
	public static ListNode swapPairs(ListNode head) {
		
	
		ListNode temp= new ListNode(0);
		int a=0;
		
		 temp.next = head;
		ListNode currNode = temp;
		int b=a;
		
		while(currNode.next!=null && currNode.next.next!=null) {
		 b=55;
			ListNode firstNode= currNode.next;
			ListNode secondNode= currNode.next.next;
			
			firstNode.next=secondNode.next;
			
			currNode.next=secondNode;
			currNode.next.next=firstNode;
			currNode= currNode.next.next;

			
	
		}
		
		return temp.next;
	}
	
	public static int longestSubStringWithNoRepeat(String s) {
		int maxLenghtSubString=0;
		Set<Character> stringHashSet = new HashSet();
		
		if(s.isEmpty()) return maxLenghtSubString;
		if (s.length() == 0 && s.isEmpty()) return maxLenghtSubString = 0;
		if(s.isBlank() || s.length()==1) return maxLenghtSubString=1;
		int rightCounter=0;
		int leftCounter=0;
		
		while(rightCounter<s.length()) {
			
			if(stringHashSet.contains(s.charAt(rightCounter))) {
				stringHashSet.remove(s.charAt(leftCounter));
				leftCounter++;
			}else {
				stringHashSet.add(s.charAt(rightCounter));
				rightCounter++;
			}
			maxLenghtSubString = Math.max(maxLenghtSubString, rightCounter-leftCounter);
		}
				
		
		return maxLenghtSubString;
	}
	
	public static List<String> letterCasePermutation(String s){
		List<String> stringList = new ArrayList<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(!Character.isDigit(s.charAt(i) )) {
				char[] temp = s.toCharArray();
				if(Character.isLowerCase(temp[i])) {
					temp[i]=Character.toUpperCase(s.charAt(i));
				}else {
					temp[i]=Character.toLowerCase(s.charAt(i));
				}

				stringList.add(Arrays.toString(temp));
			}
		}
		
		for(int i =0;i<stringList.size();i++) {
			String holder = stringList.get(i);
			if(!Character.isDigit(holder.charAt(i) )) {
				char[] temp = holder.toCharArray();
				if(Character.isLowerCase(temp[i])) {
					temp[i]=Character.toUpperCase(holder.charAt(i));
				}else {
					temp[i]=Character.toLowerCase(holder.charAt(i));
				}

				stringList.add(Arrays.toString(temp));
			}
			
		}
		
		return stringList;
		
	}

	
	public static int toZero(int num) {
		int toZeroNum=0;
		
		while(num!=0) {
			if(num%2==0) {
				num=num/2;
			}else {
				num-=1;
			}
			toZeroNum++;
		}
		
		return toZeroNum;
	}
	
	public static int[] singleNumber(int[] nums) {

		int[] singleInt = new int[2];

		HashMap<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
		}
		for (int k = 0; k < nums.length; k++) {
			if (numsMap.get(nums[k]) == 1) {
				if (singleInt[0] == 0) {
					singleInt[0] = nums[k];
				} else {
					singleInt[1] = nums[k];
				}
			}
		}

		return singleInt;
	}

	public static void reverseString(char[] str) {

		int leftCounter = 0;
		int rightCounter = str.length - 1;

		while (rightCounter > leftCounter) {
			char a = str[leftCounter];
			str[leftCounter] = str[rightCounter];
			str[rightCounter] = a;
			leftCounter++;
			rightCounter--;
		}

		System.out.println((Arrays.toString(str)));
	}

}
