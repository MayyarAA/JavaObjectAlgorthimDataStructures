package ObjectDemoProduct;

public class PenBlue implements objInterfaceTwo{

	@Override
	public void checkValueIsValid(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void helperVoidFcn() {
		// TODO Auto-generated method stub
		
	}

}


//Java program to demonstrate the case
//when two interfaces are overridden

//Creating Interface One
interface GfG{
public default void display()
{
   System.out.println("GEEKSFORGEEKS");
}
}

//Creating Interface Two
interface gfg{

public default void display() 
{
   System.out.println("geeksforgeeks");
}
}

