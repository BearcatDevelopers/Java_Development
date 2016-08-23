import java.util.*;
import java.text.*;

//http://docs.oracle.com/javase/tutorial/deployment/webstart/

public class Financial_Calculator {
	
	static double intDeferInterest = 0;
	
	static double principal = 0;
	
	static double interest = 0;
	
	static double repay_time = 0;
	
	static String yes_no = null;
	static int defer_interest = 0; 
	
	static double[] values; 
	static int[] college;
	static int ColStartMonth; 
	static int ColStartYear;
	
	static int ColEndMonth;
	static int ColEndYear;
	static int lengthofCollege;
	
	
	static double ColLength = 0; 
        
        static double monthlyPayment = 0;
        static double basicInterest = 0;
        static double interestPayment = 0;
	
	
	
	static double[] getValues(){
		// 
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your principal? ");
		
		principal = in.nextDouble();
		
		
		System.out.println("What is your interest percentage? Please use a decimal: ");
		interest = in.nextDouble();
		
		System.out.println("What is the expected time it will take your to repay the loan? Please use months: ");
		repay_time = in.nextDouble(); 
		
		
		
		values = new double[] {principal, interest, repay_time};
		
		return values; 
		
	}
	
	static String deferInterest(){
		
		do{
			Scanner pass_in = new Scanner(System.in);
			System.out.println("Are you deferring interest? Please type 'yes' or 'no'" );
			yes_no = pass_in.nextLine().toLowerCase();
		
			if(!(yes_no.contains("yes") || yes_no.contains("no"))){
				System.out.println("That is an incorrect input.");
		}
		
		}while(!(yes_no.contains("yes") || yes_no.contains("no")));
		
		return yes_no;
		
		
	}
	
	static int eduLength(){
		
		do{
			Scanner date_in = new Scanner(System.in);
			
			System.out.println("What is your expected college start month? Please use the number value of the month (1-12): ");
			ColStartMonth = date_in.nextInt(); 
			System.out.println("What is your expected college start year?: ");
			ColStartYear = date_in.nextInt();
			System.out.println("What is your expected graduation month? Please use the number value of the month (1-12): ");
			ColEndMonth = date_in.nextInt();
			System.out.println("What is your expected graduation year?: ");
			ColEndYear = date_in.nextInt();
			
			if(ColStartMonth<0 || ColStartYear < 0 || ColStartMonth > 12 || ColEndMonth  < 0 || ColEndYear <0|| ColEndMonth > 12){
				System.out.println("Please make sure you are using the required value");
			}
			}while(ColStartMonth<0 || ColStartYear < 0 || ColStartMonth > 12 || ColEndMonth  < 0 || ColEndYear <0|| ColEndMonth > 12);
			
			lengthofCollege = ((ColEndYear - ColStartYear)*12)+ (ColEndMonth-ColStartMonth);
	                
	        return lengthofCollege;
	
	}
	
	
	
	public static void main(String[] args) {
	
		getValues();
		deferInterest();
	    eduLength();

	if (yes_no.contains("yes")) {

			lengthofCollege = lengthofCollege + 6;

    //        basicInterest = values[0] * (values[1]/12) * (lengthofCollege);
    //        System.out.print(basicInterest);
    //        monthlyPayment = (basicInterest + values[0])* java.lang.Math.pow((1+values[1]),(values[2]/12));
    //        monthlyPayment = monthlyPayment/12;


            //Calculated simple compounded interest while in college P(1+rt)
            basicInterest = values[0] * (values[1]) * (lengthofCollege/12);
            
            //Calculates monthly payments for college loans. Adds interest accumulated and multiplies by P(1+r/n)^nt
            monthlyPayment = (values[0]+ basicInterest) * (( values[1]/12)/( 1-java.lang.Math.pow ( 1+ ( values[1]/12 ), -( values[2] ) ) ) );
            
            System.out.println("Your monthly payment is $" + monthlyPayment);

		
	} else if(yes_no.contains("no")) {
            
            //Calculates interest payment using P(1+r(1))/12
            interestPayment = (values[0] * values[1] * (1))/12;
            
            //Calculates monthly payment of college loans without any addition of interest P(1+r/n)^nt
            
            monthlyPayment = values[0] * (( values[1]/12)/( 1-java.lang.Math.pow ( 1+ ( values[1]/12 ), -( values[2] ) ) ) );
            
            //monthlyPayment = (values[0]* java.lang.Math.pow((1+values[1]/12),(12* (values[2])/12)))/values[2];
                
            System.out.println("Your monthly payment is $" +    monthlyPayment);
            System.out.println("Your monthly interest payment is $" + interestPayment);
	}
        else {
            System.out.println("Did not work");
        }
	
	
        }
}