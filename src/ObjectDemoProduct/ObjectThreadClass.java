package ObjectDemoProduct;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class ObjectThreadClass implements Runnable{
	
	int valueOne;
	int valueTwo;
	int currSum;
	ObjectThreadClass(int valueOne, int valueTwo){
		this.valueOne= valueOne;
		this.valueTwo= valueTwo;
	}

	@Override
	public void run() {
		
		try {
			System.out.println(addFunction());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public int addFunction() throws InterruptedException {
		if(currSum>10) {
//			TimeUnit.SECONDS.sleep(15);
			valueOne+=50;
		}else {
//			TimeUnit.SECONDS.sleep(15);
		}
		currSum = valueOne+valueTwo;
		return currSum;
	}

}
