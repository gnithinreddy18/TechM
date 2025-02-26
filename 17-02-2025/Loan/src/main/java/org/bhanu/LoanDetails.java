package org.bhanu;

public class LoanDetails {
	private String name;
	private String loanType;
	private int amt;
	private int period;
	private int intrest;
	public void setName(String name) {
		this.name=name;
	}
	public void setLoanType(String loanType) {
		this.loanType=loanType;
	}
	public void setAmt(int amt) {
		this.amt=amt;
	}
	public void setPeriod(int period) {
		this.period=period;
	}
	public void display() {
		System.out.println("Recipient Name: "+name);
		System.out.println("Type of Loan: "+loanType);
		System.out.println("Loan Amount: "+amt);
		System.out.println("Loan Period: "+period);
		if(loanType.equals("Housing Loan")) {
			System.out.println("Intrest: "+(amt*period*8)/100);
		}
		else {
			System.out.println("Intrest: "+(amt*period*10)/100);
		}
	}
}
