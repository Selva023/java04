package org.fullyabstract;

public class BankDetailsThree implements BankDetails,BankDetailsOne,BankDetailsTwo{

	@Override
	public void AccBal() {
		System.out.println("AccBal:23,500");
		
	}

	@Override
	public void AccNo() {
		System.out.println("AccNo:123456789");
		
	}

	@Override
	public void AccHolderName() {
		System.out.println("Name:Ravi");
		
		
	}
	public static void main(String[] args) {
		BankDetailsThree b =new BankDetailsThree();
		b.AccHolderName();
		b.AccNo();
		b.AccBal();
	}

}
