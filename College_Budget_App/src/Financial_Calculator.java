import java.util.Scanner;

public class Financial_Calculator {
	
	static double intDeferInterest = 0;
	
	static double principal = 0;
	
	static double interest = 0;
	
	static double repay_time = 0;
	
	static String yes_no = null;
	static int defer_interest = 0; 
	
	static double[] values; 
	
	
	
	static double[] getValues(){
		// 
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your principal? ");
		
		principal = in.nextDouble();
		
		
		System.out.println("What is your interest percentage? Please use an integer: ");
		interest = in.nextDouble();
		
		System.out.println("What is the expected time it will take your to repay the loan? Please use years: ");
		repay_time = in.nextDouble(); 
		
		System.out.println("Are you deferring interest? Please type 'yes' or 'no'" );
		yes_no = in.nextLine().toLowerCase();
		
//		if(yes_no.equals("yes")) {
//			defer_interest = 1;
//		} else {
//			defer_interest = 0;
//		}
		
		double[] values = new double[] {principal, interest, repay_time};
		
		return values; 
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	// This is going to be a 2-part calculator: 
	// 1. Calculate how much fucking money you owe those assholes at Sally Mae
	// 2. Calculate how to build your retirement big enough that the government will [try to] steal it from you. 
	// Let's do this. 
	
	getValues();
	System.out.print(values[0]);
	System.out.print(values[1]);
	System.out.print(values[2]);
	
	//Student loan
	//You'll need a variable to capture the amount of money you have loaned to you
	// ... which means you'll need a way to import that number. see above "import java.util.Scanner;"
	// Here's how to declare a scanner: import it above, then follow the following syntax
	Scanner in = new Scanner(System.in);
	
	// and here is your loan amount. Remember that "in" is the name of our scanner, which we use to import values and shit.
	// nextDouble() means "the next double that gets typed in is equal to 'loanAmount'
	double loanAmount = in.nextDouble();
	
	// Good work. Now you'll need to input whether or not you're deferring interest after college. 
	System.out.println("Will you be deferring interest after college? Please type 'Yes' or 'No': ");
	
	// *NOTE TO DAN - YOU NEED TO BULLETPROOF YOUR INPUTS*
	String defInterest = in.next();
	
	// change it to lowercase in case (because) your users are idiots. 
	defInterest = defInterest.toLowerCase();
	
	if (defInterest == "yes")
		System.out.println("You have deferred your interest.");
		// If yes, we'll need to use a compound interest equation *KEVIN GET THE GODDAMN EQUATION*
		
		// This means your interest will compound in college and you'll have a new principle amount.
		// We'll be calculating monthly repayment costs, which are typically over 10 years (120 payments)
	
		// That formula is A = P(1 + (r/n))^t - *KEVIN WILL GOOGLE THIS AND GIVE IT MEANING LATER* 
		// Declare variables for each: 
		int A;
		int P; 
		int r; 
		int n; 
		int t; 
	}
		// write out the formula. Answer will be how much you owe per month if you defer interest AND do not pay it. 
	
	
	
	public String DeferInterest(){
		String answer = null;
		
		int x = 0;
		while(x > 1){
			Scanner scanIn = new Scanner(System.in);
			
			System.out.println("Are you going to defer interest? 'Yes' or 'no': ");
			
			answer = scanIn.next();
			answer = answer.toLowerCase();
			
			if(answer == "yes"){
				x = 0;
				System.out.println("Print this shit");
			} else if(answer == "no") {
				x = 1;
				System.out.println("Still printing this shit");
			} else {
				x = 2;
				System.out.println("Wrong! Try again.");
			}
			
		}
		
		
		if(answer == "yes") {
			intDeferInterest = 1;
		} else if(answer == "no") {
			
			intDeferInterest = 0; 
		} else { 
			
		}
		
		return answer;
	}
}