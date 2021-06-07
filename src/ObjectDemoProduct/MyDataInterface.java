package ObjectDemoProduct;

public interface MyDataInterface {

	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
	
	static String printingFromStaticFcnInterface(int value) {
		String res= "Printing from the static fcn in the interface w/ value of " + value;
		return res;
	}
	
}
