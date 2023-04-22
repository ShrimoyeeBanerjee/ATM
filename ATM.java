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
 case 2: 

					                 System.out.print("1.FROM SAVING\n " + "2. FROM CURRENT \n\n");
                                                         System.out.print("Enter your choice : ");
					                 int witAccount = sc.nextInt(); // Keeps track of which account to withdraw from

					                 if (witAccount == 1)
              
                                                           {
                                                            System.out.println("\nYour  SAVING balance is: " + formatter.format(SAVING.getBalance()) + "\n");
                                                            System.out.println("How much money would you like to withdraw?");
					                    double withdraw = sc.nextDouble();
                                                            SAVING.withdraw(withdraw);
                                                            System.out.println("\nYour SAVING balance is now: " + formatter.format(SAVING.getBalance()) + "\n");
						           }

					                else if (witAccount == 2)

                                                          {
		                                            System.out.println("\nYour current balance is: " + formatter.format(CURRENT.getBalance()) + "\n");
                                                            System.out.println("How much money would you like to withdraw?");
						            double withdraw = sc.nextDouble();
                                                            CURRENT.withdraw(withdraw);
						            System.out.println("\nYour Checking balance is now: " + formatter.format(CURRENT.getBalance()) + "\n");
                                                          }
                                                     System.out.println("=================================================================================================");
                             			         break; 
  
				                   case 3:

					                     System.out.print("\nFrom which account do you wish to transfer funds ?\n ");
                                                             System.out.print("1.FROM SAVING\n " + "2. FROM CURRENT \n\n");
                                                             System.out.print("Enter your choice : ");
					                     int tranAccount = sc.nextInt(); 
  
					                 if (tranAccount == 1)
 
                                                          {
                                                           System.out.println("\nYour Savings balance is: " + formatter.format(SAVING.getBalance()) + "\n");
                                                           System.out.print("How much money do you wish to transfer from SAVING to CURRENT?\n ");
						           double tranAmount = sc.nextDouble();
                                                           SAVING.withdraw(tranAmount);
						           CURRENT.deposit(tranAmount);
                                                           System.out.println("\nYou successfully transferred " + formatter.format(tranAmount) + " from SAVING to CURRENT");
                                                           System.out.println("\nCURRENT Balance: " + formatter.format(CURRENT.getBalance()));
						           System.out.println("SAVING Balance: " + formatter.format(SAVING.getBalance()) + "\n");
                                                          }

					                else if (tranAccount == 2) 
                 
                                                          {
                                                           System.out.println("\nYour CURRENT balance is: " + formatter.format(CURRENT.getBalance()) + "\n");
                                                           System.out.print("How much money do you wish to transfer from CURRENT to SAVING?: ");
						           double tranAmount = sc.nextDouble();
                                                           CURRENT.withdraw(tranAmount);
						           SAVING.deposit(tranAmount);
                                                           System.out.println("\nYou successfully transferred " + formatter.format(tranAmount) + " from CURRENT to SAVING");
                                                           System.out.println("\nCURRENT Balance: " + formatter.format(CURRENT.getBalance()));
						           System.out.println("SAVING Balance: " + formatter.format(SAVING.getBalance()) + "\n");
						          }
                                                   System.out.println("=================================================================================================");
					                  break;
					 				
				                   case 4:
     
					                  System.out.println("\nCURRENT Balance: " + formatter.format(CURRENT.getBalance()));
					                  System.out.println("SAVING Balance: " + formatter.format(SAVING.getBalance()) + "\n");
					System.out.println("=================================================================================================");
					                  break;

				                   case 5:

                                                         System.out.print("\nPlease enter your Current PIN: \n");
		                                         VALUE = keyboard.nextInt();

		                                       while ( VALUE != PIN)
	                  	
                                                        {
					                 System.out.println("\nIncorrect PIN. TRY AGAIN.\n");
					                 System.out.print("\nRe-enter your current PIN: \n");
					                 VALUE = keyboard.nextInt();
		                                        }
                                                         System.out.print("\nEnter your new PIN: \n");
		                                         VALUE1 = keyboard.nextInt();

		                                      while(VALUE1==VALUE )

	                  	                        {
					                 System.out.println("\nEnter PIN is same as Current PIN .\n");
					                 System.out.print("\nPlease enter new PIN: \n");
					                 VALUE1 = keyboard.nextInt();
		                                        }
                        
                                                    
	                  	
                                                       
                                                        System.out.println("\nRe-enter new PIN:\n");
                                                        VALUE3 = keyboard.nextInt();
                                                       
                                                        if(VALUE1==VALUE3)
                                                            {
                                                              PIN=VALUE1;
                                                              System.out.print("\nPIN changed successfully\n");
                                                              break;
                                                           }
                                                       
                                                        else
                                                         { 
                                                             System.out.print("\nEnter PIN is not matched.\n\n");
                                                            while( VALUE3!= VALUE1)
                                                            {
                                                              System.out.print("\nPlease Re-enter matching PIN \n");
                                                              VALUE3= keyboard.nextInt();
                                                               if (VALUE3==VALUE1)
                                                                break;
                                                              System.out.print("\nEnter PIN is not matched.\n");
                                                             }
                                                            System.out.print("\nPIN changed successfully\n");
                                                           PIN=VALUE3;
                                                
                                                           }
                                                       System.out.println("=================================================================================================");
                                                            break; 

				                case 6:
                                                 

				   	              session = false;
					
					             break;

			                      }				 	
			}
	    

		     System.out.println("\nThank you for banking with us!\n");
                     System.out.println("\n....................HAVE A NICE DAY...............................\n");
	}

}


class Account

         {
          String type;
	  double balance;
	  double rate;


	  void setType(String accType)
     
          {
		
		type = accType;
          }

          void setBalance(double accBal)
         
          {
		
		balance = accBal;
	  }

	  void setRate(double accRate)
         {
		
		rate = accRate;
         }

	 void deposit(double dep) 
        {
		
		balance += dep; // Take the Account object's balance and add to it the current deposit
	}

	 void withdraw(double wit)
        {
		
		balance -= wit; // Take the Account object's balance and subtract from it the current withdrawal
	}


	 String getType()
        {
		
		return type;
	}

	 double getBalance()
        {
		
		return balance;
	}

	 double getRate()
        {
		
		return rate;
	}

}
