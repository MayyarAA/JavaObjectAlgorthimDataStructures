package holder;

import java.util.*;

public class Solverka {

	public static void main(String[] args) {
		int nums[] ={42,33,60}; 
//			{51,32,43};
//			{ 51,71,17,42 };

//		solutionOld(10410);
		System.out.println(solution(nums));
		HashMap<Integer,Integer> nMap = new HashMap<>();
//		nMap.put(key, value);
//		System.out.println(0%10);

	}
	
	public static void solutionOld(int N) {
		while(N>0) {
			int enable_print = N%10;
			if(enable_print==0 && N%10!=0) {
				enable_print = 1;
			}else if(enable_print >=0){
				System.out.print(N%10);
			}
			N=N/10;
		}
	}
	
	public static void solution(int N) {
	      
	      while(N > 0) {
	        int enable_print = N % 10;
	        if(enable_print==0) {
	        	enable_print = N/10;
	        }else {
	        	
	        	System.out.print(N % 10);
	        }
	        N = N / 10;


	      }
	    }
	
	
	
	public static void reverseV2(int N) {
		int rev = 0;
		while(N>0) {
			  int enable_print = N % 10;
			  N= N/10;

			  
			  rev = rev * 10 + enable_print;
			
		}
		 System.out.println(rev);
	}
	
	public class sumObject{
		int sumValue;
		HashSet<Integer> sumPairs = new HashSet<>();
		public sumObject(int sumValue, int sumPair) {
			this.sumValue = sumValue;
			this.sumPairs.add(sumPair);
		}
		
	}
	
	public static int solution(int[] A) {
		
		int num=0;
		int leftCounter=0;
		int rightCounter=0;
		int currSum = 0;
		int sumMax=0;
		
	
		
		HashMap<Integer,Integer> sumMap = new HashMap<>();
//		for(int i=0;i<A.length;i++) {
//			int b = sumFunction(A[i]);
//			
//		}
		
		for(int i=0;i<A.length;i++) {
			int sumOfDigits = sumFunction(A[i]);
			if(sumMap.containsKey(sumOfDigits)) {
				currSum = A[i] + sumMap.get(sumOfDigits);
				sumMax = Math.max(sumMax, currSum);
			}else {
				sumMap.put(sumOfDigits,A[i]);
			}
			
		}
		
		
		if(sumMax==0) {
			sumMax=-1;
		}
		return sumMax;
	}
	
	public static int sumFunction(int value) {
		int sumValue=0;
				while(value>0){
					sumValue+= value%10;
					value = value/10;
					
				}
				return sumValue; 
	}
	
	
	public static int isNeg(int[] A) {
		int result=0;
		int negCounter=0;
		int positiveCounter=0;
		
		for(int i =0;i<A.length;i++) {
			if(A[i]==0) {
				return 0;
			}else if(A[i]<0) {
				negCounter+=1;
			}
		}
			if(negCounter%2==0) {
				result=1;
			}else {
				result=-1;
			}
		
		
		return result;
	}
	
	
	
	
	
	
	
//	public static int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
////            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
////            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
//    }
	

	public static int maximumToys(List<Integer> prices, int k) {
		
		if (k <= 0)
			return 0;
		if (prices.isEmpty())
			return 0;
		// given int[] prices , int k budget
		// find num of items k can buy
		int sum = 0;
		int leftCounter = 0;
		int rightCounter = 0;
		int numOfToys = 0;
		int maxCounter = 0;
		Integer pricesArr[] = new Integer[prices.size()];
		prices.toArray(pricesArr);
		Arrays.sort(pricesArr);
		System.out.println(Arrays.toString(pricesArr));

		while (rightCounter < prices.size()) {
			if ((sum + pricesArr[rightCounter]) <= k) {

				sum = sum + pricesArr[rightCounter];
				numOfToys += 1;
				maxCounter = Math.max(numOfToys, maxCounter);
			}
			if (sum > k) {
				sum = sum - pricesArr[leftCounter];
				leftCounter++;
				numOfToys -= 1;
			}
			rightCounter++;
		}
		return maxCounter;
	}

	public static int[] counterFunction(int N, int[] A) {
		int[] counterArr = new int[N];
		int maxCounterValue = 0;

		// given arr[N] == 0
		// if(A[i] <= N) => arr[A[i]-1] +=1;
		// if(A[i]=N+1) => for all arr[i] = MAX_VALUE

		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N && A[i] >= 1) {
				int indexValue = A[i];
				counterArr[indexValue - 1] = increase(counterArr[indexValue - 1]);
				maxCounterValue = Math.max(maxCounterValue, counterArr[indexValue - 1]);
			} else if (A[i] == (N + 1)) {
				maxCounter(counterArr, maxCounterValue);
			}
		}
		return counterArr;
	}

	public static int increase(int X) {
		X += 1;
		return X;
	}

	public static void maxCounter(int[] A, int maxCounterValue) {
		Arrays.fill(A, maxCounterValue);
	}

}
