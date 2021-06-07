package objectDemo;

import java.util.*;

public class MainHolder {

	public static void main(String[] args) {

		// Abstraction
		MaleHumanClass maleObj = new MaleHumanClass();
		FemaleHumanClass femaleObj = new FemaleHumanClass();

	
		int b =maleObj.getMaleHeight();
		System.out.println(b);
		System.out.println(maleObj.setMaleHeight(10));
		b= maleObj.getMaleHeight();
		System.out.println(b);
		changeMale(maleObj);
		
		System.out.println(maleObj.MaleAge);
	}
	
	public static MaleHumanClass  changeMale(MaleHumanClass maleOb) {
		 MaleHumanClass  maleSecond = new MaleHumanClass(25,1990);
		 MaleHumanClass maleChanger = new MaleHumanClass();
		 System.out.println(maleSecond);
		 maleChanger = maleOb;
		 maleChanger.MaleAge = 50;
		 maleChanger=maleSecond;
		 maleChanger.MaleAge=90;
		 System.out.println(maleChanger.MaleAge);
		 return maleOb;
		
	}

}
