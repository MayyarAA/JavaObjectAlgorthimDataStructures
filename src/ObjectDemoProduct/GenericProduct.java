package ObjectDemoProduct;

public class GenericProduct<T extends Number> {
	
	T num;
	
	GenericProduct(T num){
		this.num = num;
	}
	
	double squareFcn() {
		
		double value = num.doubleValue()*num.doubleValue();
		
		return value;
	}
	
	boolean isEqual( GenericProduct<?> value) {
		boolean isEq =false;
		
		if(Math.abs(value.num.doubleValue()) ==Math.abs(num.doubleValue())) {
			isEq=true;
		}
		
		return isEq;
	}

}
