package objectDemo;

import java.util.ArrayList;

public class OnlyPositiveArrayList extends ArrayList<Integer>{

	@Override
	public void add(int index, Integer e) {
		
		if(e >=0) {
			super.add(index,e);
		}
		else {
			System.out.println("You can only add positive values");
		}
	}
	
	
}
