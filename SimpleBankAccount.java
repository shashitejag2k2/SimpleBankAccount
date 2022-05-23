import java.util.*;
class Details{
	public double total=0;
public void Index(String username,int userid){
	System.out.println("Hello "+username);
	System.out.println("Your Id is:"+userid);
	int option;
 do {
	System.out.println("--------------------------------");
	System.out.println("Choose n option");
	System.out.println("1).Bank Balance");
	System.out.println("2).Bank Deposite");
	System.out.println("3).Bank withdraw");
	System.out.println("4).Exit");

	
	
	Scanner sc=new Scanner(System.in);
	option =sc.nextInt();

	switch(option) {
	case 1: System.out.println("-----------------");
	        System.out.println("You have selected Bank Balance option: ");
	        double bb= bankbalance();
	        
	        System.out.println("Your bank balance: "+bb);
	        break;
	case 2: System.out.println("-----------------");
             System.out.println("You have selected Bank Deposite option: ");
             double bd= bankdeposite();
             System.out.println("Money Deposited");
             System.out.println("Your bank balance: "+bd);
             break;
	case 3:  System.out.println("-----------------");
             System.out.println("You have selected Bank withdrw option: ");
             double bw= bankwithdraw();
             System.out.println("Money withdrawn");
             System.out.println("Your bank balance: "+bw);
             break;
	case 4:  System.out.println("-----------------");
	         System.out.println("Thank you");
	         break;
	 default:System.out.println("Choose correct option");
	 }
 }
while(option !=4);}
	
    
             
  
public double bankbalance() {
	return total;
}
public double bankdeposite(){
	Scanner s=new Scanner(System.in);
	double vel=s.nextDouble();
	total=total+vel;
	return total;
}
public double bankwithdraw() {
	Scanner s=new Scanner(System.in);
	double draw=s.nextDouble();
	if(total<draw) {
	   System.out.println("Insufficient balance ");
	   
	}
	else if(total>draw) {
	 total= total-draw;
	}
	return total;
	
}



}
class SimpleBankAccount{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name and userid to access the account");
	     String username=s.nextLine();
		   int   userid =s.nextInt();
		  Details bank=new Details();
           bank.Index(username,userid);
	}

	
}
