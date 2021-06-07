package holderVtwo;

public class Person {
	
	int weight;
	int sigOne;
	private static Person singleInstance = null;
	private Person(){
		
	}
	
	Person(int w){
		this.weight =w;
	}
	public static Person getInstance(int val) {
		if(singleInstance==null) {
			singleInstance = new Person(val);
		}
		return singleInstance;
	}

}
