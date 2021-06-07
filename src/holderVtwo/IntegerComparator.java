package holderVtwo;
import java.util.*;
public class IntegerComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
//		long b =25;
//		int a = (int) b;
		// TODO Auto-generated method stub
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
//		IntegerMap i1 = (IntegerMap)o1;
//		IntegerMap i2 = (IntegerMap)o2;
		
		
		
		
		return i1.compareTo(i2);
	}

	

}
