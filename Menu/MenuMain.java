import java.util.Scanner;

public class MenuMain {
	
	static int UserInput;
	static int yogurtCount = 0;
	static int fruitMapleCount = 0;
	static int veggieCount = 0;
	static int toastCount = 0;
	static int hashCount = 0;
	static double yogurt = 5.00;
	static double fruitMaple = 3.50;
	static double veggie = 7.00;
	static double toast = 2.00;
	static double hash =5.00;		
	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Breakfast bar!\n*******************************");
		
		do
		{
			System.out.println("Here's our menu:\n1. Yogurt Parfait..............$5.00\n2. Fruit and Maple Oatmeal.....$3.50\n"
					+ "3. Veggie Sandwich............$7.00\n"
					+ "4. Toast.......................$2.00\n5. Hash Brown and Small Coffee....$5.00"
					+ "\nWhat would you like to order? Enter your choice as: 1-5\n(Enter 0 at anytime to quit program)");
			UserInput = in.nextInt();
			
			if(UserInput==1)
			{
				System.out.println("How many?:");
				UserInput = in.nextInt();
				yogurtCount = yogurtCount+UserInput;
				System.out.println("Would you like to order more? 1 = yes and 2 = no:");
				UserInput = in.nextInt();
					if(UserInput==1)
					{
						System.out.println("Please continue!");
					}
					else
					{
						//This tells them how many of each item they ordered
						System.out.println("\nHere's your order:\nYogurt Parfait..."+yogurtCount+"\nFruit and Maple Oatmeal..."+fruitMapleCount+"\n"
					+ "Veggie Sandwich..."+veggieCount+"\n"
					+ "Toast..."+toastCount+"\nHash Brown and Small Coffee.."+hashCount);
						//Totals the counts w/prices
						System.out.println("\nYour total will come to: $"+((yogurtCount*yogurt)+(fruitMapleCount*fruitMaple)+
								(veggieCount*veggie)+(toastCount*toast)+(hashCount*hash)));
						break;
					}
			}
			else if(UserInput==2)
			{
				System.out.println("How many?:");
				UserInput = in.nextInt();
				fruitMapleCount = fruitMapleCount+UserInput;
				System.out.println("Would you like to order more? 1 = yes and 2 = no:");
				UserInput = in.nextInt();
					if(UserInput==1)
					{
						System.out.println("Please continue!");
					}
					else
					{
						//This tells them how many of each item they ordered
						System.out.println("\nHere's your order:\nYogurt Parfait..."+yogurtCount+"\nFruit and Maple Oatmeal..."+fruitMapleCount+"\n"
					+ "Veggie Sandwich..."+veggieCount+"\n"
					+ "Toast..."+toastCount+"\nHash Brown and Small Coffee.."+hashCount);
						//Totals the counts w/prices
						System.out.println("\nYour total will come to: $"+((yogurtCount*yogurt)+(fruitMapleCount*fruitMaple)+
								(veggieCount*veggie)+(toastCount*toast)+(hashCount*hash)));
						break;
					}
				
			}
			else if(UserInput==3)
			{
				System.out.println("How many?:");
				UserInput = in.nextInt();
				veggieCount = veggieCount+UserInput;
				System.out.println("Would you like to order more? 1 = yes and 2 = no:");
				UserInput = in.nextInt();
					if(UserInput==1)
					{
						System.out.println("Please continue!");
					}
					else
					{
						//This tells them how many of each item they ordered
						System.out.println("\nHere's your order:\nYogurt Parfait..."+yogurtCount+"\nFruit and Maple Oatmeal..."+fruitMapleCount+"\n"
					+ "Veggie Sandwich..."+veggieCount+"\n"
					+ "Toast..."+toastCount+"\nHash Brown and Small Coffee.."+hashCount);
						//Totals the counts w/prices
						System.out.println("\nYour total will come to: $"+((yogurtCount*yogurt)+(fruitMapleCount*fruitMaple)+
								(veggieCount*veggie)+(toastCount*toast)+(hashCount*hash)));
						break;
					}
				
			}
			else if(UserInput==4)
			{
				System.out.println("How many?:");
				UserInput = in.nextInt();
				toastCount = toastCount+UserInput;
				System.out.println("Would you like to order more? 1 = yes and 2 = no:");
				UserInput = in.nextInt();
					if(UserInput==1)
					{
						System.out.println("Please continue!");
					}
					else
					{
						//This tells them how many of each item they ordered
						System.out.println("\nHere's your order:\nYogurt Parfait..."+yogurtCount+"\nFruit and Maple Oatmeal..."+fruitMapleCount+"\n"
					+ "Veggie Sandwich..."+veggieCount+"\n"
					+ "Toast..."+toastCount+"\nHash Brown and Small Coffee.."+hashCount);
						//Totals the counts w/prices
						System.out.println("\nYour total will come to: $"+((yogurtCount*yogurt)+(fruitMapleCount*fruitMaple)+
								(veggieCount*veggie)+(toastCount*toast)+(hashCount*hash)));
						break;
					}
				
			}
			else if (UserInput==5)
			{
				System.out.println("How many?:");
				UserInput = in.nextInt();
				hashCount = hashCount+UserInput;
				System.out.println("Would you like to order more? 1 = yes and 2 = no:");
				UserInput = in.nextInt();
					if(UserInput==1)
					{
						System.out.println("Please continue!");
					}
					else
					{
						//This tells them how many of each item they ordered
						System.out.println("\nHere's your order:\nYogurt Parfait..."+yogurtCount+"\nFruit and Maple Oatmeal..."+fruitMapleCount+"\n"
					+ "Veggie Sandwich..."+veggieCount+"\n"
					+ "Toast..."+toastCount+"\nHash Brown and Small Coffee.."+hashCount);
						//Totals the counts w/prices
						System.out.println("\nYour total will come to: $"+((yogurtCount*yogurt)+(fruitMapleCount*fruitMaple)+
								(veggieCount*veggie)+(toastCount*toast)+(hashCount*hash)));
						break;
					}
			}
			else if(UserInput>5)
			{
				System.out.println("This is not a menue. Please try again!");
			}
		}
		while(UserInput!=0);

	}

}
