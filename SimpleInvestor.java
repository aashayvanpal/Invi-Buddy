package SmartInvestor;
/*
 version : A-1.0v
 App Goals:
 1.Calculate Investments 
 2.Calculate Interest and compound interest (Todo)
 */

import java.util.Scanner;


public class SimpleInvestor extends InvestmentCalculator{
	public static void main(String args[]) {
		System.out.println("yo");

		Scanner sc = new Scanner(System.in);
		

		//variables
		int calculationProcess,investmentType;
		float totalMoney,stockPrice;
		boolean calculationType = false; 
		System.out.println("Enter your Process : \n1.Calculation \n2.Direct Invest");

		calculationProcess = sc.nextInt();
		
		float fifteenPercentMoney = 0;
		
		
		switch(calculationProcess) {
		case 1:{
			System.out.println("Enter your Total Money Savings :");

			
			totalMoney = sc.nextFloat();
			InvestmentCalculator I1 = new InvestmentCalculator();
			fifteenPercentMoney = I1.fifteenPercentCalc(totalMoney);
			float seventyPercentMoney = I1.seventyPercentCalc(totalMoney);

			System.out.println("Your Total Money :" + totalMoney);
			System.out.println("15% for Investing :" + fifteenPercentMoney );
			System.out.println("15% for Saving :" + fifteenPercentMoney);
			System.out.println("70% for Using :" + seventyPercentMoney);
			System.out.println("----------------------");
			calculationType = true;
			
		}
		case 2:{
			InvestmentCalculator I1 = new InvestmentCalculator();
			fifteenPercentMoney = I1.getCalculationType(calculationType,fifteenPercentMoney);
			System.out.println("What type of stock you want to buy ?? \n 1.Risky stocks \n 2.Dividend stocks ");
			investmentType = sc.nextInt();
			switch(investmentType) {
			case 1:{
				//for risky stocks
				System.out.println("Inside for risky stocks");
				stockPrice = fifteenPercentMoney / 2;
				System.out.println("Buy 2 stocks worth:" + Math.round(stockPrice));
				break;
			}
			case 2:{
				//for dividend stocks
				System.out.println("Inside for dividend stocks");
				stockPrice = fifteenPercentMoney / 3;
				System.out.println("Buy 3 stocks worth:" + Math.round(stockPrice));
				break;
			}
			default :{
				System.out.println("Wrong input!!!!");
				break;
			}
			}
			break;
		}
		default:{
			System.out.println("Invalid Process flow option");
			break;
		}
		}
		System.out.println("End of program");
	}
}
	
	
