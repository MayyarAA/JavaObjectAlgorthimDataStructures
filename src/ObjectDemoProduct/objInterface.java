package ObjectDemoProduct;

 interface objInterface {
	public static final int interFaceNum = 101;
	String errorValueIsNegative= "Error due to the value provided is negative";
	
	void checkValueIsValid(int value);
	
	public static void objectReference() {
		
		
	}
	public static int addTwoSum(int a, int b) {
		
		System.out.println(interFaceNum);
		int value = a+b;
		return (value);
	}
	
	public static String   removeSpace(String str) {
		String removedSpaces= "new string"; 
		return removedSpaces;
	}
	
	public void helperVoidFcn();

}
