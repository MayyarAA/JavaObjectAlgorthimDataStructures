package holderVtwo;
import java.util.*;
public class SolverP1 {
	public static void main(String[] args) {
		Integer[] nums = {4, 99999, 2, 2, 99999, 4, 4, 4}; 
//			{5, 2, 9, 1, 7, 4, 6, 3, 8};
		List<Integer> list = Arrays.asList(nums);
//		System.out.println(Arrays.toString(runningMedianOfThree(list).toArray()));
		sortByElementFrequency(list);
		System.out.println(Arrays.toString((list).toArray()));
		factorFactorial(10);
		long factorialN = factorialUsingForLoop(10);
//		primeFactors(factorialN);
		primeFactors(112);
		
	}
	
	//1a3b2c1a
	
	public static void sortByElementFrequency(List<Integer> items) {
		Integer fir = items.get(0);
		Integer sec = items.get(1);
//		List<IntegerMap> mapInt = new ArrayList<IntegerMap>();
////		IntegerComparator compareHelper = new IntegerComparator();
//		HashMap<Integer,Integer> nMap = new HashMap<Integer, Integer>();
//		for(int i =0;i<items.size();i++) {
//			nMap.put(items.get(i), nMap.getOrDefault(items.get(i), 0)+1);
//		}
//		Set<Integer> listOfKeys = nMap.keySet();
//		Integer[] keyArr = new Integer[listOfKeys.size()];
//		
//		listOfKeys.toArray(keyArr);
//		for(int i=0;i<keyArr.length;i++) {
//			int val = keyArr[i];
//			IntegerMap thing = new IntegerMap(val,nMap.get(val));
//			mapInt.add(thing);
//		}
		Collections.sort(items, new IntegerComparator());
		
		
		
		for(int i =0;i<items.size();i++) {
			
//			items.set(i, element)
//			System.out.println("This value is " + mapInt.get(i));
		}
		
	}
	
		
	public static long factorialUsingForLoop(int n) {
	    long fact = 1;
	    for (int i = 2; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}
	
	
	
	public static List<Integer> runningMedianOfThree(List<Integer> items){
		List<Integer> listResult = new ArrayList<>();
		
		int leftCounter=0;
		int rightCounter= 2;
		Integer fir = items.get(leftCounter);
		Integer sec = items.get(leftCounter+1);
		
		listResult.add(fir);
		listResult.add(sec);
		while(rightCounter<items.size()) {
			Integer[] tempArr = new Integer[3];
			tempArr[0] = items.get(leftCounter);
			tempArr[1] = items.get(leftCounter+1);
			tempArr[2] = items.get(rightCounter);
			Arrays.sort(tempArr);
			Integer median = tempArr[1];
			listResult.add(median);
			leftCounter++;
			rightCounter++;
		}
		
		return listResult;
	}
	
	public static List<Integer> factorFactorial(int n)
    {
		List<Integer> list = new ArrayList<Integer>();
        while (n%2==0)
        {
        	list.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {

            while (n%i == 0)
            {
            	list.add(i);
                n /= i;
            }
        }

        if (n > 2)
        	list.add(n);
        return list;
    }

}
