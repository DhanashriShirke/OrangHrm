import java.util.Scanner;
class Account1
{
         private int acctno;
		 private int pswd;
		 private double balance;
		 Scanner sc=new Scanner(System.in);
		 Account1(int acctno,int pswd,double balance)
		{
			 this.acctno=acctno;
			 this.pswd=pswd;
			 this.balance=balance;
		}
		public double getBalance()
	{
			System.out.println("enter pswd");
			int pswd=sc.nextInt();
			if(pswd==this.pswd)
		{
				return balance;
		}
		else
		{
			System.out.println("enter correct pswd");
			return 0.0;
		}
	}
	public void setDeposit()
	{
		System.out.println("enter money");
		double money=sc.nextDouble();
		balance=balance+money;
	}
	public void setWithdraw()
	{
		System.out.println("enter pswd");
		int pswd=sc.nextInt();
		if(pswd==this.pswd)
		{
			System.out.println("enter money");
			double money=sc.nextDouble();
			if(money<=balance)
		    {
			   balance=balance-money;
		    }
		    else
		   {
				System.out.println("insufficient funds");
		   }
		}
		else
			System.out.println("incorrect pswd");
	}

}


