package com.training.org;

public class GetLoanType {

	
	
	public InterestRate getInterestRate(String loanType){  
		if(loanType == null){  
			return null;  
		}  
		if(loanType.equalsIgnoreCase("HOMELOAN")) {  
			return new HomeLoan();  
		}   
		else if(loanType.equalsIgnoreCase("CarLoan")){  
			return new CarLoan();  
		}   
		else if(loanType.equalsIgnoreCase("PersonalLoan")) {  
			return new PersonalLoan();  
		} 
		else if(loanType.equalsIgnoreCase("BusinessLoan")) {  
			return new BusinessLoan();  
		} 
		return null;  
	}
}
	
	

