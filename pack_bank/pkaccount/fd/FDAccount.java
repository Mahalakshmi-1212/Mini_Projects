package pkaccount.fd;
import pkaccount.*;
import pkbanking.pkinterface.*;
public class FDAccount extends Account implements InterestRate
{
int period;

public FDAccount()
{
super();
period = 0;
}

public FDAccount(int accnumber,int period,double deposit_amount)
{
super(accnumber,deposit_amount);
this.period = period;
System.out.println("Your FD Account is created with the following credentials:");
System.out.println("Your Account Number : "+accnumber);
System.out.println("Deposited Amount : "+deposit_amount);
System.out.println("Period : "+period);
}

public double calc_interest()
{
return balance * period * fdrate /(100 * 12);
}

public void close()
{
System.out.println("Previous Balance : "+balance);
double interest = calc_interest();
System.out.println("Interest Amount : "+interest);
balance += interest;
System.out.println("Current Balance : "+balance);
}
}