import java.io.*;
import pkcustomer.*;
class BankDemo
{
public static void main(String arg[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Customer c[] = new Customer[5];
int ch1,ch2,ch3,cid,i=0;
do 
{
System.out.println("Welcome to Simren Bank");
System.out.println("Main Menu");
System.out.println("SB Account ----1");
System.out.println("FD Account ----2");
System.out.println("Exit ----------3");
System.out.println("Enter Your Choice : ");
ch1 = Integer.parseInt(br.readLine());
switch(ch1)
{
case 1:
do 
{
System.out.println("Simren Bank");
System.out.println("SB Account Menu");
System.out.println("New SB Account opening ----1");
System.out.println("Deposit -------------------2");
System.out.println("Withdraw ------------------3");
System.out.println("Interest Calculation ------4");
System.out.println("Exit  ---------------------5");
System.out.println("Enter Your Choice : ");
ch2 = Integer.parseInt(br.readLine());
switch(ch2)
{
case 1:
System.out.println("Enter your Name, Address : ");
String name = br.readLine();
String address = br.readLine();
c[i] = new Customer(300+i,name,address);
c[i].createAccount(1);
System.out.println("Your Customer ID : "+(300+i));
i++;
break;//sb menu
case 2:
System.out.println("Enter your Customer ID : ");
cid = Integer.parseInt(br.readLine());
c[cid%10].transaction(1);
break;//sb menu
case 3:
System.out.println("Enter your Customer ID : ");
cid = Integer.parseInt(br.readLine());
c[cid%10].transaction(2);
break;
case 4:
System.out.println("Enter your Customer ID : ");
cid = Integer.parseInt(br.readLine());
c[cid%10].transaction(3);
break;
case 5:
break;//sb menu
default:
System.out.println("Invalid SB Accoun Menu Choice!");
break;
}
}while(ch2 != 5);
//sb details
break;//main menu
case 2:
do 
{
System.out.println("Simren Bank");
System.out.println("FD Account Menu");
System.out.println("FD Account opening ----1");
System.out.println("FD Account close ------2");
System.out.println("Exit ------------------3");
System.out.println("Enter Your Choice : ");
ch3 = Integer.parseInt(br.readLine());
switch(ch3)
{
case 1:
System.out.println("Enter your Name, Address : ");
String name = br.readLine();
String address = br.readLine();
c[i] = new Customer(600+i,name,address);
c[i].createAccount(2);
System.out.println("Your Customer ID : "+(600+i));
i++;
break;
case 2:
System.out.println("Enter your Customer ID : ");
cid = Integer.parseInt(br.readLine());
c[cid%10].transaction(4);
break;
case 3:
break;
default:
System.out.println("Invalid FD Account Menu Choice!");
break;
}
}while(ch3 != 3);
//fd details
break;//main menu
case 3:
break;//main menu
default:
System.out.println("Invalid Main Menu Choice!");
break;
}
}while(ch1 != 3);
}
}