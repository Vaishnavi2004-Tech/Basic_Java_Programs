public class Banking {
	String bankName,accountNumber,accountHolderName,accountType;
	int pinNumber;
	double accountBalanceAmount;
	
	Banking()	// Default constructor
	{}	
	
	Banking(String bn,String accnum,String accholdername,String acctype,int pin,double bal)
	{
		bankName = bn;
		accountNumber = accnum;
		accountHolderName = accholdername;
		accountType = acctype;
		pinNumber = pin;
		accountBalanceAmount = bal;
	}
	void getCustomerDetails()
	{
		System.out.println("**************************************************s");
		System.out.println("Bank Name - " + bankName);
		System.out.println("Bank Account Number - " + accountNumber);
		System.out.println("Bank Account Holder Name - " + accountHolderName);
		System.out.println("Bank Account Type - " + accountType);
		System.out.println("Bank Pin Number - " + pinNumber);
		System.out.println("Bank account Balance - " + accountBalanceAmount);
	}

	public static void main(String[] args) {
		
		
		Banking sachin = new Banking("HDFC","HDFC1234","SACHIN","SAVINGS",1122,5600);
		Banking karthick = new Banking("SBI","SBI3344","KARTHICK","SAVINGS",2233,8500);
		Banking srini = new Banking("ICICI","ICICI4455","SRINI","SAVINGS",1100,13000);
		sachin.getCustomerDetails();
		karthick.getCustomerDetails();
		srini.getCustomerDetails();

	}

}