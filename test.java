class RBIBank {
	int balance;
	void deposit(int amt) {
		this.balance=this.balance + amt;
		System.out.println("From RBI bsuccessfully deposit......amount...+amt");
	}
	void withDraw(int amt) {
		this.balance=this.balance - amt;
		System.out.println("From RBI bsuccessfully withDrawn......amount...+amt");
	}
	void checkBalance() {
		System.out.println("From RBI avl balance......amount...+amt");
	}
}
class SBIBank extends RBIBank{
	public SBIBank(int balance) {
		//super (balance);
		this.balance=balance;
		
	}
	void deposit(int amt) {
		if(amt < 50000) {
			this.balance=this.balance+amt;
			System.out.println("from SBI succcessfully deposited....amount..."  + amt);
		}else {
			System.out.println("From SBI Limit exceeds");
		}
	}
	void withDraw(int amt) {
		if(amt <50000) {
			this.balance=this.balance - amt;
			System.out.println("From SBI successfully withDrawn.....amount.." + amt);
		}else {
			System.out.println("From SBI Day Limit exceeds");
		}
	}
}
class ICICIBank extends RBIBank {
	public ICICIBank(int balance) {
		this.balance=balance;
}
	void deposit(int amt) {
		if(amt <200000) {
			this.balance=this.balance + amt;
			System.out.println("From ICICI successfully deposited....amount..."+ amt);
		}else {
			System.out.println("From ICICI Day limit exceeds");
		}
	}
	void withDraw(int amt) {
		if(amt <50000) {
			this.balance=this.balance - amt;
			System.out.println("From ICICI successfully withDrawn.....amount.." + amt);
		}else {
			System.out.println("From ICICI Day Limit exceeds");
		}
	}
}
class HDFCBank extends RBIBank {
	public HDFCBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if(amt <100000) {
			this.balance=this.balance + amt;
			System.out.println("From HDFC successfully deposited....amount..."+ amt);
		}else {
			System.out.println("From HDFC Day limit exceeds");
		}
	}
	void withDraw(int amt) {
		if(amt <50000) {
			this.balance=this.balance - amt;
			System.out.println("From HDFC successfully withDrawn.....amount.." + amt);
		}else {
			System.out.println("From HDFC Day Limit exceeds");
		}
	}
}
public class test {
	public static void main(String[] args) {
	SBIBank sbi = new SBIBank(10000);
	ICICIBank icici = new ICICIBank(75000);
	HDFCBank hdfc = new HDFCBank(85000);
	
	System.out.println("For SBI Bank  Starts....");
	sbi.checkBalance();
	sbi.deposit(6000);
	sbi.checkBalance();
	sbi.deposit(67000);
	sbi.checkBalance();
	System.out.println("For SBI Bank   ENDS....");
	
	System.out.println("For ICICI Bank  Starts....");
	
	icici.checkBalance();
	icici.deposit(6000);
	icici.checkBalance();
	icici.deposit(67000);
	icici.checkBalance();
	System.out.println("For ICICI Bank   ENDS....");
	System.out.println("For HDFC Bank  Starts....");
	
	
	hdfc.checkBalance();
	hdfc.deposit(6000);
	hdfc.checkBalance();
	hdfc.deposit(67000);
	hdfc.checkBalance();
	
	System.out.println("For HDFC Bank   ENDS....");	
	}

}