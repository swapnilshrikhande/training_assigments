package problem5;

public class Curr_acc extends Account
{

	float balance=0,deposit=0,rate=0;
	
	public void getdata(String name, int accountno, String typeofAcount)
	{
		this.customerName=name;
		this.accountNumber=accountno;
		this.typeOfAccount=typeofAcount;
	}
	
	public void display()
	{
		System.out.println("Customer Name  :"+customerName);
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Type   :"+typeOfAccount);
		System.out.println();
	}
	
	public void deposit(float deposit)
	{
		balance=balance+deposit;
		System.out.println("The amount deposited ="+deposit);
	}
	
	public void displayBal()
	{
		System.out.println("The Balance is="+balance);
	}
	
	public void interest(float rate)
	{
		balance=((balance*rate)/100)+balance;
		System.out.println("The Balance after interest ="+balance);
	}
	
	
	public void balChk(float minimal)
	{
		if(balance < minimal)
		{
			System.out.println("Balance is insufficient for Banking");
		}
		
		else
		{
			System.out.println("Balance is sufficient for Banking");
		}
	}
	
	
	public static void main(String[]args)
	{
		Curr_acc c=new Curr_acc();
		c.getdata("Seema",1234,"Current");
		c.display();
		c.deposit(5000);
		c.displayBal();
		c.interest(6);
		c.balChk(1000);
		
	}
	
}
