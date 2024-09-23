package pkcustomer;
import java.io.*;
import pkaccount.sb.*;
import pkaccount.fd.*;
public class Customer
{
int cust_id;
String name, address;
SBAccount sb;
FDAccount fd;
BufferedReader br;
static int sbacno = 102001;
static int fdacno = 756001;

public Customer()
{
cust_id = 0;
name = null;
address = null;
sb = null;
fd = null;
br = null;
}

public Customer(int cust_id,String name,String address)
{
this.cust_id = cust_id;
this.name = name;
this.address = address;
br = new BufferedReader( new InputStreamReader( System.in));
}

public void createAccount(int type)throws IOException
{
if(type == 1)
{
System.out.println("Enter amount to open your new SB Account:");
double amount = Double.parseDouble(br.readLine());
sb = new SBAccount(sbacno++,amount);
}
else if(type == 2)
{
System.out.println("Enter amount,period to open your new FD Account:");
double amount = Double.parseDouble(br.readLine());
int period = Integer.parseInt(br.readLine());
fd = new FDAccount(fdacno++,period,amount);
}
else
System.out.println("Invalid Type!");
}

public void transaction(int type)throws IOException
{
if(type == 1)
{
System.out.println("Enter amount to deposit in your SB Account");
double amount = Double.parseDouble(br.readLine());
sb.deposit(amount);
}
else if(type == 2)
{
System.out.println("Enter amount to withdraw from your SB Account");
double amount = Double.parseDouble(br.readLine());
sb.withdraw(amount);
}
else if(type == 3)
sb.calc_interest();
else if(type == 4)
fd.close();
}
}



