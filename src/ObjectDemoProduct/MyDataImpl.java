package ObjectDemoProduct;


public class MyDataImpl implements MyDataInterface {

	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
		MyDataInterface.printingFromStaticFcnInterface(2);
	}
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");
		
		return str == null ? true : false;
	}
}