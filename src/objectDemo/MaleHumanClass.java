package objectDemo;

public class MaleHumanClass extends HumanAbstractClass {
	public int MaleAge=0;
	public int MaleBirth =0;
	private int MaleHeight;
	final int MaleSize=20;

	public MaleHumanClass() {
		
		
	}
	
	public MaleHumanClass(int age,int birth) {
		 this.MaleAge =age;
		 MaleBirth = birth;
	}
	
	//@Override
	public void humanRun() {
		System.out.println("Male Human is Running");
//		HumanAbstractClass.defaultHappyHuman();
		
	}
	
	public int getMaleHeight() {
		return MaleHeight;
	}
	
	public int setMaleHeight(int b) {
		this.MaleHeight=b;
		return this.MaleHeight;
	}
	
	@Override
	public void humanAvgSize() {
//		this.HumanStartDate = "Humans started 10,000";
		System.out.println("Male Average size is 5'10");
	}
	
	public int updateMaleAge() {
		this.MaleAge=1;
		return this.MaleAge;
	}
	
	public int updateMaleAge(int num) {
		this.MaleAge = num;
		return this.MaleAge;
	}
	
	public String sameFunction() {		
		 return "hello from sameFunction with no input parameters";
	}
	
	public String sameFunction(int nm) {
		 StringBuilder returnVar = new StringBuilder("hello from sameFunction");
		 returnVar.append(nm);
		 returnVar.append("with int as input parameter");
		 return returnVar.toString();
		
	}
	 public void eat(){
	      System.out.println("Boy is eating");
	   }

	@Override
	public void humanBreath() {
		// TODO Auto-generated method stub
		
	}	

}
