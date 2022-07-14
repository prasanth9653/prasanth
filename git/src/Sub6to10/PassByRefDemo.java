package Sub6to10;

public class PassByRefDemo {

	public static void main(String[] args) {
		
		MyBank2 sbi=new MyBank2();
		
		Money mymoney=new Money();
		
		sbi.acceptMoney(mymoney);
		sbi.TransferMoney(1000, null);
		
	}
}
	class MyBank2{
		public void acceptMoney(Money m)
		{
			
		}
		public void TransferMoney(int amt,Account acct)
		{
			acct.credit(100);
			acct.debit(200);
		}
	}
	class Money
	{
		
	}
	class Account{
		public void debit(int dird)
		{
			System.out.println("Debited...."+dird);
			
		}
		public void credit(int crtd)
		{
			System.out.println("Credited ....."+crtd);
		}
		
	}


