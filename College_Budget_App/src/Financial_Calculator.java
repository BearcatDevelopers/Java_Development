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
	
<<<<<<< HEAD
	static int[] eduLength(){
		Scanner date_in = new Scanner(System.in);
		
		System.out.println("What is your expected college start month? Please use the number value of the month (1-12): ");
		ColStartMonth = date_in.nextInt(); 
		System.out.println("What is your expected college start year? Please use the full number value of the year (ex: 2016): ");
		ColStartYear = date_in.nextInt();
		System.out.println("What is your expected graduation month? Please use the number value of the month (1-12): ");
		ColEndMonth = date_in.nextInt();
		System.out.println("What is your expected graduation year? Please use the full number value of the year (ex: 2016): ");

		ColEndYear = date_in.nextInt();
		
		college = new int[] {ColStartMonth, ColStartYear, ColEndMonth, ColEndYear}; 
		
		lengthofCollege = ((ColEndYear - ColStartYear)*12)+ (ColEndMonth-ColStartMonth);
        System.out.print(lengthofCollege);        
        return college;
=======
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
>>>>>>> 5009d175fad3346ccf4eb86757c6944fd1d9246b
		
	
	}
	
	
	
	public static void main(String[] args) {
	// This is going to be a 2-part calculator: 
	// 1. Calculate how much fucking money you owe those assholes at Sally Mae
	// 2. Calculate how to build your retirement big enough that the government will [try to] steal it from you. 
	// Let's do this. 
	
	getValues();
	deferInterest();
    eduLength();
    System.out.println(yes_no);
	if (yes_no.contains("yes")) {

			lengthofCollege = lengthofCollege + 6;
<<<<<<< HEAD
//=======
=======
            basicInterest = values[0] * (values[1]/12) * (lengthofCollege);
            System.out.print(basicInterest);
            monthlyPayment = (basicInterest + values[0])* java.lang.Math.pow((1+values[1]),(values[2]/12));
            monthlyPayment = monthlyPayment/12;

>>>>>>> 5009d175fad3346ccf4eb86757c6944fd1d9246b
            //Calculated simple compunded interest while in college P(1+rt)
            basicInterest = values[0] * (values[1]) * (lengthofCollege/12);
            
            //Calculates monthly payments for college loans. Adds interest accumulated and multiplies by P(1+r/n)^nt
            monthlyPayment = ((basicInterest + values[0])* java.lang.Math.pow((1+values[1]/12),(12*(values[2])/12)))/(values[2]);
            
            System.out.println(monthlyPayment);
 
		
		//do the methods for yes
		// declare ColLen for college length
		//write calculation
		
	} else if(yes_no.contains("no")) {
            
            //Calculates interest payment using P(1+r(1))/12
            interestPayment = (values[0] * values[1] * (1))/12;
            
            //Calculates monthly payment of college loans without any addition of interest P(1+r/n)^nt
<<<<<<< HEAD
            monthlyPayment = ( (values[0])* java.lang.Math.pow( ( 1+(values[1]/365) ),( 365* ( ( values[2] )/12 ) ) ) )/(values[2]);
=======
            
            monthlyPayment = values[0] * (( values[1]/12)/( 1-java.lang.Math.pow ( 1+ ( values[1]/12 ), -( values[2] ) ) ) );
            
            //monthlyPayment = (values[0]* java.lang.Math.pow((1+values[1]/12),(12* (values[2])/12)))/values[2];
>>>>>>> 5009d175fad3346ccf4eb86757c6944fd1d9246b
            
		//do the methods for no
		//declare ColLen for college length
		//write calculation
                
            System.out.println("Your monthly payment is $" +    monthlyPayment);
            System.out.println("Your monthly interest payment is $" + interestPayment);
	}
        else {
            System.out.println("Did not work");
        }
	
	/*System.out.println(yes_no);
	System.out.println(values[0]);
	System.out.println(values[1]);
	System.out.println(values[2]);*/
	// write out the formula. Answer will be how much you owe per month if you defer interest AND do not pay it. 
	
        }
}