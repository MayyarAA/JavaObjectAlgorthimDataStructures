package holderVtwo;
import java.io.*;
import java.util.*;
import java.lang.*;
public class SolverPb {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine().trim());
		String k = "50 182";
				//"24 986";
		String ns = " 589 343 609 61 222 759 955 889 147 691 950 844 431 621 749 68 537 784 36 227 186 39 854 630 225 749 924 360 258 767 945 956 319 727 412 26 356 2 550 497 585 516 965 343 76 914 143 197 949 73" ; 
				  HashSet<Integer> set = new HashSet<Integer>();
//				  set.c
				
				//"557 217 627 358 527 358 338 272 870 362 897 23 618 113 718 697 586 42 424 130 230 566 560 933";
		String[] ss = k.trim().split(" ");
		
		
//		while(t-->0) {
//			String inputLine[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(ss[0]);
			int X = Integer.parseInt(ss[1]);
			int[] A = new int[n];
			ss = ns.trim().split(" ");
					//br.readLine().trim().split(" ");
			for(int i =0;i<n;i++) {
				A[i] = Integer.parseInt(ss[i]);				
			}
			int c[] = {20,358,586,42};
			
//			System.out.println(TripleClass.find3Numbers(c, c.length, X));
//			System.out.println(Math.abs(a));
			
//		}
	}	
//	24 986
//	557 217 627 358 527 358 338 272 870 362 897 23 618 113 718 697 586 42 424 130 230 566 560 933
}

//A is 358 B is 586 C is 42
class TripleClass{
	public static boolean find3Numbers(int A[], int n, int X) { 
        boolean isTriplet = false;
       //given arr[] 
       Arrays.sort(A);
       //sumArr[n], contain sumArr[i] = X-arr[i] 
       //loop arr[], if you find 2 values that sumArr[i] return tru;
       HashMap<Integer,Integer> nMap = new HashMap<>();
        int[] sumArr = new int[n];
        for(int i =0;i<n;i++){
            int diff = X- A[i];
            nMap.put(A[i],diff);
            if(diff==944 || diff==628|| diff==400) {
            	System.out.println( A[i] + " diff is -> " + diff );
            }
        }
//        System.out.println("does map contain " + nMap.containsKey(358));
        int leftCounter=0;
        int rightCounter= n-1;
        int currSum=0;
        while(rightCounter>leftCounter){
        	currSum = A[rightCounter] + A[leftCounter];
        	if(A[leftCounter]==42 || A[rightCounter] ==586) {
        		System.out.println( "A[lef] -> " + A[leftCounter] + " A[right] -> " + A[rightCounter]);
        	}
            int res = X-currSum;
            if(nMap.containsKey(res)) {
            	return true;
            }
            if(nMap.containsValue(currSum)){
            	System.out.println(A[rightCounter] + " " +A[leftCounter]+  " ");
                if(nMap.get(A[rightCounter])!=currSum ){
                    if(nMap.get(A[leftCounter])!=currSum){
                    	
                        return true;
                    }
                }
            }
            if(currSum>X){
                rightCounter--;
            }else{
                leftCounter++;
            }
            
        }
        
        return isTriplet;
    }
	
	public static boolean isNumV2(int A[], int n, int X) {
		  HashMap<Integer,Integer> nMap = new HashMap<>();
	        int[] sumArr = new int[n];
	        for(int i =0;i<n;i++){
	            int diff = X- A[i];
	            nMap.put(A[i],diff);
	            if(diff==944 || diff==628|| diff==400) {
	            	System.out.println( A[i] + " diff is -> " + diff );
	            }
	        }
	        
	        for(int i=0;i<A.length;i++) {
				int a =A[i];
				for(int j=i+1;j<A.length;j++) {
					int b= A[j];
					int currSum = a+b;
					 if(nMap.containsValue(currSum)){
						 if(nMap.get(A[j])!=currSum ){
			                    if(nMap.get(A[i])!=currSum){			                
			                        return true;
			                    }
			                }
					}
				}
			}
	        
		return false;
	}
	
	public static boolean isNum(int A[], int n, int X) {
		
		for(int i=0;i<A.length;i++) {
			int a =A[i];
			for(int j=i+1;j<A.length;j++) {
				int b= A[j];
				for(int k=j+1;k<A.length;k++) {
					int c= A[k];
					if(a+b+c==X) {
						System.out.println("A is " + a + " B is " + b + " C is "+ c);
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> nums = new ArrayList<>();
        if(matrix==null|| matrix.length==0) return nums;
        
        int topRow=0;
        int bottomRow = matrix.length-1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length-1;
        int size = (matrix.length*  matrix[0].length);
        
        while(nums.size()<size){
            for(int i=leftColumn ; i<=rightColumn && nums.size()<size;i++){
                int value = matrix[topRow][i];
                nums.add(value);
            }
            topRow++;
            for(int i=topRow;i<=bottomRow&& nums.size()<size;i++){
                int value = matrix[i][rightColumn];
                nums.add(value);
            }
            rightColumn--;
            for(int i=rightColumn;i>=leftColumn && nums.size()<size;i--){
                int value = matrix[bottomRow][i];
                nums.add(value);
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && nums.size()<size;i--){
                int value = matrix[i][leftColumn];
                nums.add(value);
            }
            leftColumn++;
            if(nums.size()>=size){
                break;
            }
            
        }
        return nums;
}

public static int findArea(int arr[], int n)
{
    //unordered_set<int> s;
     
    Set<Integer> s = new HashSet<>();
  
    // traverse through array
    int first = 0, second = 0;
    for (int i = 0; i < n; i++) {
  
        // If this is first occurrence of
        // arr[i], simply insert and continue
        if (!s.contains(arr[i])) {
            s.add(arr[i]);
            continue;
        }
  
        // If this is second (or more)
        // occurrence, update first and
        // second maximum values.
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        } else if (arr[i] > second)
            second = arr[i];
    }
    return (first * second);
}



}
