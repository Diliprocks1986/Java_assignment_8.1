//Program to generate a user-defined exception BankATMException whenever withdrawal is done for balance less than 10000.

// BankATMException class extending Exception class
class BankATMException extends Exception{  
 BankATMException(String s){  
  super(s);  
 }  
}  
// Librery class
class BankAtm {
	// Variables
	int atmId;
	String bankName;
	String location;
	double balance;
	// Constructor for Account Creation
	public BankAtm(){
		System.out.print("Please Enter the ATM ID: ");
		this.atmId = Integer.parseInt(System.console().readLine());
		System.out.print("Please Enter the Bank Name: ");
		this.bankName = System.console().readLine();
		System.out.print("Please Enter Location of Bank: ");
		this.location = System.console().readLine();
		System.out.print("Please Deposit Lump sum amount : ");
		this.balance = Integer.parseInt(System.console().readLine());
		System.out.print("Account Created Succesfully\n");
		
	}
	// with Draw method
	public void withdraw()throws BankATMException{
		// checking balance more than 10000 or not?
		if (balance>10000){
		System.out.print("Please Enter the withdrawal amount: ");
		int amt = Integer.parseInt(System.console().readLine());
		// checking withdrawn amount > balance or not
		if(amt<balance){
			balance = (balance - amt);
			System.out.print("Withdrawn "+ amt +" Rs, Available balance in your account is "+balance);
			//throws exception if withdrawn amount > BALANCE
		}else{throw new BankATMException("dont have sufficient balance to withdraw "+ amt+ " please Try Again"); }
		// throw exception if bal <10000
		}else{throw new BankATMException("Your Bank Balance is lessthan 10K Withdrawl not possiable"); }
		
	}
	// diposit method
	public void deposit(){
		System.out.print("Please Enter the amount which you want to deposit: ");
		int amt = Integer.parseInt(System.console().readLine());
		balance = amt + balance;
		System.out.print("Amount Submited Succesfully available balance in your account is :" + balance);
	}
	// account Details method
	public void details(){
		System.out.println("Your ATM ID is: "+ atmId);
		System.out.println("Your Bank Name is: "+ bankName);
		System.out.println("Your Bank Lacation is: "+ location);
		System.out.println("Available Balance in Your A/c is: "+ balance);
	}
	public int bankMenu(){
	System.out.println("\n----- Welcome to Bank's ATM Menu -----");		
		System.out.println("\nPRESS 1 - WithDraw balance");
		System.out.println("PRESS 2 - Deposit Amount");
		System.out.println("PRESS 3 - Account Information");
		System.out.println("PRESS 4 - Cancel");
	//System.out.println("For Deposit  Enter :2");
	System.out.print("\nEnter your Choice : ");
	int select = Integer.parseInt(System.console().readLine());
	return select;
	}
	
}

public class validateTransact{
	public static void main(String[] args){	
	// first object
	BankAtm ab = new BankAtm();
	int select = ab.bankMenu();
	switch(select)
            {
            case 1:
			 try{ 
                ab.withdraw();
				 }catch(Exception e){System.out.println("Exception occured: "+ e);} 
                break;
            case 2:
                ab.deposit();
                break;
			case 3:
                ab.details();
                break;
			case 4:
               System.exit(0) ;
                break;
	
	}
	//  second object
	BankAtm bc = new BankAtm();
	int select1 = bc.bankMenu();
	
	switch(select1)
            {
            case 1:
			 try{ 
                bc.withdraw();
				 }catch(Exception e){System.out.println("Exception occured: "+ e);} 
                break;
            case 2:
                bc.deposit();
                break;
			case 3:
                bc.details();
                break;
			case 4:
               System.exit(0) ;
                break;
	
	}
	// Third object
	BankAtm cd = new BankAtm();
	int select2 = cd.bankMenu();
	
	switch(select2)
            {
            case 1:
			 try{ 
                cd.withdraw();
				 }catch(Exception e){System.out.println("Exception occured: "+ e);} 
                break;
            case 2:
                cd.deposit();
                break;
			case 3:
                cd.details();
                break;
			case 4:
               System.exit(0) ;
                break;
	
	}
	
	}
}