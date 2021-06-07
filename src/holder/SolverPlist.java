package holder;

import java.util.*;

public class SolverPlist {

	public static void main(String[] args) {
		ListNode nodeOne = new ListNode(0);
		ListNode nodeTwo = new ListNode(0);
		String e = "jsajja";
		char f = e.charAt(1);
//		char ch1 = e.charAt(0);
//        System.out.println(e.charAt(1));
		int[] numsOne = { 1, 2, 4 };
		int[] numsTwo = { 1, 3, 4 };
		nodeOne.addListNode(numsOne, nodeOne);
		nodeTwo.addListNode(numsTwo, nodeTwo);
//		ListNode res = mergeTwoLists(nodeOne.next, nodeTwo.next);

		TreeNode nodeT = new TreeNode(3);
		nodeT.left = new TreeNode(9);
		nodeT.right = new TreeNode(20);
		System.out.println(minDepth(nodeT));
		int coins[] = {186,419,83,408};
		System.out.println(coinChange(coins,6249));

	}
	
	
	
	 public static int coinChange(int[] coins, int amount) {
	        int numOfCoinsMin = Integer.MAX_VALUE;
	        
	        PriorityQueue<Integer> pQueueMin = new PriorityQueue<>();
	        pQueueMin.add(numOfCoinsMin);
	        Arrays.sort(coins);
	        for(int i =(coins.length-1);i>=0;i--){
	            numOfCoinsMin = coinChangeHelper(coins,amount, coins[i],0, i, 0);
	            System.out.println(numOfCoinsMin +  " outside helper");
	            pQueueMin.add(numOfCoinsMin);
	        }
	        return pQueueMin.poll();
	    }
	    
	    public static int coinChangeHelper(int[] coins, int amount, int coin, int numOfCoins, int index, int valueOrg){
	         int value=valueOrg;
	        if(amount==0){
	            return numOfCoins;
	        }
	        // numOfCoins++;
	        
	         if (amount-coin>=0){
	            
	             amount = amount-coin;
	            numOfCoins++;
	             System.out.println("amount is " + amount + " numofCoins" + numOfCoins + " " + coin);
	            numOfCoins= coinChangeHelper(coins,amount,coin,numOfCoins,index, value);
	            
	        }else if(index-1>=0 ){
	             int counter=index-1;         
	             
	             while(counter>=0){
	                 int newCoin = coins[counter];  
	                 System.out.println("in while " + counter + " coin is " + newCoin + " amount is " + amount);
	                  if(amount-newCoin>=0){
	                  System.out.println( newCoin + " new coins "+ " num of coins " + numOfCoins);
	                 numOfCoins = coinChangeHelper(coins,amount,newCoin,numOfCoins,counter, value); 
	                 break;
	             }else{
	                 counter--;
	             }
	             }
	            
	               
	                
	              
	         }
	        else{
	             return -1;
	         }
	           
	        
	       
	        
	         
	        return numOfCoins;
	    }
	 public static int lengthOfLongestSubstring(String s) {
	     
	        
	       
	        if(s.isEmpty()) return 0;
	        
	        int subStringLengthMax=0;
	        Set<Character> strSet = new HashSet();
	        
	        int leftCounter=0;
	        int rightCounter=0;
	        int counter=0;
	        char[] arr = s.toCharArray();
	        
	        while(rightCounter<s.length()){
	            char value = arr[rightCounter];            
	            if(strSet.contains(value)){                
	                strSet.remove(arr[leftCounter]);
	                counter--;
	                leftCounter++;
	            }else{
	                 strSet.add(value);
	                 rightCounter++;
	                counter++;
	                
	            }
	            subStringLengthMax = Math.max(subStringLengthMax,rightCounter-leftCounter);
	           
	            
	            
	            
	        }
	        return subStringLengthMax;
	    }
	
	public static int minDepth(TreeNode root) {
        PriorityQueue<Integer> pQueueMin = new PriorityQueue<>();
        pQueueMin.add(Integer.MAX_VALUE);
        int treeHeight=0;
        
         minDepthHelper(root,treeHeight, pQueueMin);
        
        return pQueueMin.poll();
    }
    
    public static void minDepthHelper(TreeNode root, int treeHeight, PriorityQueue<Integer> pQueue){
        
        if(root==null){
            pQueue.add(treeHeight);
        }
        treeHeight++;
        if(root.left!=null) {
        	
        	minDepthHelper(root.left, treeHeight, pQueue);
        }else {
        	pQueue.add(treeHeight);
        }
        if(root.right!=null) {
        	
        	minDepthHelper(root.right, treeHeight, pQueue);
        }else {
        	pQueue.add(treeHeight);
        }
        
    }

	

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode mergedList = new ListNode(0);
		ListNode temp = mergedList;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
			} else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if (l1 == null) {
			temp.next = l2;
		} else if (l2 == null) {
			temp.next = l1;
		}

		return mergedList.next;

	}

}
