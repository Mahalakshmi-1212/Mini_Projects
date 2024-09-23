package pkaccount.sb;
import pkaccount.*;
import pkbanking.pkinterface.*;
public class SBAccount extends Account implements Transaction,InterestRate
{

public SBAccount()
{
super();
}

public SBAccount(int accnumber, double init_balance)
{
super(accnumber,init_balance);
System.out.println("Your SB Account is created with the following credentials:");
System.out.println("Your Account Number : "+accnumber);
System.out.println("Balance : "+init_balance);
}

public void deposit(double amount)
{
System.out.println("Previous Balance : "+balance);
System.out.println("Deposit Amount : "+amount);
if(amount > 0)
{
balance += amount;
System.out.println("Current Balance : "+balance);
}
else
System.out.println("Invalid Amount");
}

public void withdraw(double amount)
{
System.out.println("Previous Balance : "+balance);
System.out.println("Deposit Amount : "+amount);
if(balance - amount > min_balance)
{
balance -= amount;
System.out.println("Current Balance : "+balance);
}
else
System.out.println("Invalid Amount");
}

public void calc_interest()
{
System.out.println("Previous Balance : "+balance);
double interest = balance * sbrate/100;
System.out.println("Interest Amount : "+interest);
balance += interest;
System.out.println("Current Balance : "+balance);
}
}

