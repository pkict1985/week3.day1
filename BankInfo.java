package week3.day1;

//subclass/inherited class
public class BankInfo extends AxisBank{
	public void saving() {
		System.out.println("Saving from BankInfo");
	}
	
	public void fixed() {
		System.out.println("fixed from BankInfo");
	}
	
	@Override
	protected void deposit() {
		System.out.println("deposit from BankInfo");
	}
	public static void main(String[] args) {
		// If a Parent type reference refers
        // to a Parent object, then Parent's
        // method is called
		AxisBank objAB=new AxisBank();
		objAB.deposit();
		
		// If a Parent type reference refers
        // to a Child object , then Child's method()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
		AxisBank objAB2=new BankInfo();
		objAB2.deposit();
		
	}
}
