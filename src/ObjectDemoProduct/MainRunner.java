package ObjectDemoProduct;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class MainRunner {
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> arrList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		
		
//		GenericProduct<Number> genProd = new GenericProduct<Number>(34);
//		GenericProduct<Double> genProd2 = new GenericProduct<Double>( 0.4443);	
//
//		
		ObjectThreadClass threadClassOne = new ObjectThreadClass(10,15);
		Thread threadObject = new Thread(threadClassOne);
		Thread threadObjectTwo = new Thread(threadClassOne);
		threadObject.start();
		threadObject.join(0);
		threadObjectTwo.start();
		if(threadObject.isAlive()) {
			System.out.println("threadObject is currently running");
		}
//		System.out.println(Thread.activeCount());
		
//		TimeUnit.SECONDS.sleep(1);
		if(threadObject.isAlive()) {
			System.out.println("threadObject is currently running");
		}
		System.out.println(threadClassOne.valueOne);
	}
	
	
	
	
	
	public static void DBConnectionCall(int a) {
		
		int[] nums= new int[5];
		
		try {
			System.out.println("above the nums in try");
			int val = 10/0;
			nums[21] = 6;
			System.out.println("below the nums in try, if error this will not execute ");
			//call to DB
			
		}
		catch(ArrayIndexOutOfBoundsException indexOutOfBoud){
			System.out.println("Error" + indexOutOfBoud);
			
			//catch error if the call to db does not work
		}catch(Exception e){
			System.out.println("Error" + e);
		}
		finally {
			//log to console the db connection metadata result
			//this will always execute no matter what
		}
	}

}


