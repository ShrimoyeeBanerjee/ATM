import java.text.NumberFormat; 
import java.util.Scanner; 

 class ATM
            {
	
	         public static void main(String[] args) 
               {
	        
		int PIN;
                int TEMP=1234,VALUE1,VALUE3=0;
                PIN=TEMP;
                System.out.println("\n\n\n..............................WELCOME TO THE STATE BANK OF INDIA..............................\n\n\n");
                Scanner keyboard = new Scanner(System.in);
		System.out.print("\nPlease enter your PIN: \n");
		int VALUE = keyboard.nextInt();
                while ( VALUE!= PIN)
		 {
		  System.out.println("\nIncorrect PIN. TRY AGAIN.\n");
		  System.out.print("\nPlease enter your PIN:\n ");
		  VALUE = keyboard.nextInt();
		 }
                Account CURRENT = new Account();  //create first account that is cheking         
		CURRENT.setType("Checking");
		CURRENT.setBalance(0.00);
		CURRENT.setRate(0.00);

		Account SAVING = new Account();  //create second account that is saving
		SAVING.setType("Savings");
		SAVING.setBalance(0.00);
		SAVING.setRate(2.00);

		NumberFormat formatter = NumberFormat.getCurrencyInstance(); // getCurrancyInstance() is inbuild method in java to use formatt double currency saving
		Scanner sc = new Scanner(System.in); 

		boolean session = true; // it will break the (while) loop when false

		while (session) 
                              {
                               System.out.print("\nSelect transaction: \n \n"
			       + "1. Deposit Money \n"
			       + "2. Withdraw Money \n"
		               + "3. Transfer Funds \n"
			       + "4. Check Account Balance\n"
                               + "5. Change pin\n"
			       + "6. End Session\n \n"
			       + "Enter selection: ");

			      int selection = sc.nextInt(); // for select

                              switch (selection)
                                                {
                                                 case 1:
					                 System.out.print("1.FROM SAVING\n "+"2. FROM CURRENT \n\n");
                                                         System.out.print("Enter your choice :");
                                                         int depAccount = sc.nextInt(); // for select which account to  be select either saving or Current

					                 if (depAccount == 1)
                                                            
                                                            {
                                                              System.out.println("\nYour SAVING balance is: " + formatter.format(SAVING.getBalance()) + "\n");
                                                              System.out.println("How much money would you like to deposit?");
						              double deposit = sc.nextDouble();
                                                              SAVING.deposit(deposit);
                                                              System.out.println("\nYour SAVING balance is now: " + formatter.format(SAVING.getBalance()) + "\n");
			                                     }

                                                         else if (depAccount == 2)
                                                 
                                                            {
						              System.out.println("\nYour CURRENT balance is: " + formatter.format(CURRENT.getBalance()) + "\n");
                                                              System.out.println("How much money would you like to deposit?");
						              double deposit = sc.nextDouble();
                                                              CURRENT.deposit(deposit);
                                                              System.out.println("\nYour CURRENT balance is now: " + formatter.format(CURRENT.getBalance()) + "\n");
                                                           }
                                                     
                                                         System.out.println("=================================================================================================");
					                      break;
