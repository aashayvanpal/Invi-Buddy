package SmartInvestor;
/*
 version : A-1.0v
 */

import java.util.Scanner;


public class InvestmentCalculator {
	public float fifteenPercentCalc(float totalMoney) {
		float fifteenPercentAmount;
		fifteenPercentAmount = (float) (totalMoney * 0.15);
		return fifteenPercentAmount;
	}
	public float seventyPercentCalc(float totalMoney) {
		float seventyPercentAmount;
		seventyPercentAmount = (float) (totalMoney * 0.7);
		return seventyPercentAmount;
	}
	public float getCalculationType(boolean calculationType ,float fifteenPercent) {
		if(calculationType == true) {
			float fifteenPercentvalue = fifteenPercent; 
			return fifteenPercentvalue;
		}else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Direct Investment Amount :");
			float fifteenPercentMoney = sc.nextFloat();
			return fifteenPercentMoney;
		}
	}
}
