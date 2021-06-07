package objectDemo;
import java.util.*;

abstract class HumanAbstractClass {
	
	
	
	private String HumanStartDate  = "started 100,000 years ago";
	private String CreditCard = "10101010";
	
	public abstract void  humanRun();
	
	public void humanCredCard() {
		char[] updateString = this.CreditCard.toCharArray();
		for(int i =0 ; i < updateString.length -4;i++) {
			updateString[i]='*';
			
		}
		System.out.println(Arrays.toString(updateString));
		
	}
	
	public  void humanAvgSize() {
		System.out.println("Human Average Size is 5'10'");
	}
	
	public  void defaultHappyHuman() {
		System.out.println("Default Happy Human is working");
	}
	
	public abstract void humanBreath();
	
	public String getHumanStartDate() {
		
		return this.HumanStartDate;
	}
	
	 //Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	   
	   

}
