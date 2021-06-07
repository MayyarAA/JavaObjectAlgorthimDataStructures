package ObjectDemoProduct;

public class PenObject implements objInterface{
	int penPrice;
	
	PenObject(int penPrice ){
		this.penPrice = penPrice;
	}
	
	public static void main(String[] args) {		
		PenObject penOne = new PenObject(-35);
		penOne.checkValueIsValid(penOne.penPrice);
		int result =20; 
//				super.addTwoSum(k,j);
	}
	
	public static void displayNumber(int k) {
//		this.k = k;
		
		System.out.println("Number is from static fcn " + k);
	}

	@Override
	public void helperVoidFcn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkValueIsValid(int value) {
		if(value<0) {
			System.out.println(errorValueIsNegative);
		}
	}

}
