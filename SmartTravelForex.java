

import java.util.Scanner;

public class SmartTravelForex {

    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {
      double exerate = 0;
 	   if(amount>0)
		{
 	   		if(choice == 1)
			{
 		   		exerate = amount * 0.67;
 	   		}
 	   		else if(choice == 2)
			{
 		   		exerate = amount * 85.37;
 	  		}
 	   		else if(choice == 3)
			{
 		   		exerate = amount * 94.5;
 	   		}
 	   		else if(choice == 4)
			{
 		   		exerate = amount * 74.3;
 	   		}
 	   		else if(choice == 5)
			{
 		   		exerate = amount * 20.25;
 	  		}
			else
			{
				exerate = -1;
			}
			
 	    }
		else
		{
			exerate = -1;
		}
		return (exerate);
    }

    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
        double result=0;
		if(amountToBeConverted>0){

        double[] arr = new double[5];
        arr[0]=0.67;
        arr[1]=85.37;
        arr[2]=94.5;
        arr[3]=74.3;
        arr[4]=20.25;
        
        double source = arr[sourceCurrency-1];
        double target = arr[targetCurrency-1];
        
        if(sourceCurrency != targetCurrency) {
        result = (amountToBeConverted * source)/target;
        }
        else if(sourceCurrency == targetCurrency) {
        	result = (amountToBeConverted * target);
        }
		}
		else{
			result = -1;
		}
		return result;
    }

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
		System.out.println("     1      10     20      50      100");
    	System.out.println("JPY  0.67   6.7    13.4    33.5    67.8");
    	System.out.println("EUR  85.37  853.7  1787.4  4268.5  8537.8");
    	System.out.println("GBP  94.5   945.8  1890.0  4725.0  9450.0");
    	System.out.println("USD  74.3   743.0  1486.0  3715.0  7430.0");
    	System.out.println("AED  20.25  202.5  405.0   1012.5  2025.0");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
		
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = sc.nextInt();
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = sc.nextInt();
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = sc.nextInt();
            sc.close();
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }
}