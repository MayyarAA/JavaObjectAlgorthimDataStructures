package holder;

import java.util.*;
import java.util.stream.Stream;

public class Solver {

	public static void main(String[] args) {

		int[] pob = new int[] { 1, 1, 0, 3, 5, 0, 7 };
		System.out.println(maxProd());
		
	}
	
	public static int maxProd() {      
		int maxProdValue = 0;
		
		int[] intArr = {5,3,2,5,7,0};
		
		for(int i =0 ; i< intArr.length ; i++) {
			
			int firInt = intArr[i];
			for(int j= (i+1) ; j < (intArr.length -1);  j ++ ) {
				
				int secInt = intArr[j];
				int localMax = firInt * secInt;
				if(maxProdValue < localMax) {
					maxProdValue = localMax;
				}
			}
		}
		
		return maxProdValue;
	}

	public static Boolean palin() {
		String strOne = "hello";
		String strTwo = "ttott";
		Boolean temp = false;
		char[] charArr = strTwo.toCharArray();

//		int leng = strTwo.length();
		int leng = charArr.length;
		int counter = 0;
		for (int i = 0; i < ((leng - 1) / 2); i++) {

//			if (strOne.charAt(i) == strOne.charAt((leng - i))) {
//				counter++;
//			}
			if (charArr[i] == charArr[(leng - 1)]) {
				counter++;
			}

		}

		if (counter == (leng - 1) / 2) {
			temp = true;
		}

		return temp;
	}

	public static void fibSeq() {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 8;
	}

	public static void namGetter() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Thank you for your input");
	}

	public static void printArr(int[] a) {
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

	}

	public static void printArrDRY(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
		}

	}

	public static int calculator() {

		int value = 0;

		return value;
	}

	public static int add(int a, int b) {
		int result = a + b;

		return result;
	}

	public static int multiply(int a, int b) {
		int result = 0;
		for (int i = 0; i < b; i++) {
			result += a;
		}

		return result;
	}

	public static int zeroArr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				return i;
			}
		}

		return -1;
	}

	public static void testMax() {

//		int a=(Integer) null;
//		int b=(Integer) null;
		int a = -5;
		int b = 4;
//		boolean wasThrown = false;
//		
//		try{
		int result = max(a, b);
//					
//				
//		}
//		catch(Exception e){
//			wasThrown = true;
//		}
////		int result =	max(a,b);
//		
		System.out.println(result);
//		
	}

	public static int max(int a, int b) {

		if (a >= b) {
			return a;
		}

		else
			return b;

	}

	public static void q2() {
		ArrayList<Integer> holderr = new ArrayList<>();
		holderr.add(1);
		holderr.add(5);
		holderr.add(4);
		holderr.add(3);
		holderr.add(7);
		holderr.add(6);
		int fg = 0;

		for (int i = 0; i < holderr.size(); i++) {
//			System.out.println(holderr.get(i));
			for (int j = 1; j < holderr.size(); j++) {
				if (holderr.get(i) > holderr.get(j)) {
					if (fg < holderr.get(i)) {
						fg = holderr.get(i);
					}

				}
			}

		}

		System.out.println(holderr);
		System.out.println(fg);
	}

}
