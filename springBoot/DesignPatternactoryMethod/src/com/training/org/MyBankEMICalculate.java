package com.training.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBankEMICalculate {

	public static void main(String args[])throws IOException{  
		GetLoanType loanType = new GetLoanType();  

		System.out.print("Enter the name of Loan for which the EMI will be generated: ");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

		String LoanName=br.readLine();  
		System.out.print("Enter the Amountr of: ");
		double amount=Double.parseDouble(br.readLine());  

		System.out.print("Enter the year of EMI: ");
		int year=Integer.parseInt(br.readLine());  
	
		InterestRate p = loanType.getInterestRate(LoanName);  
		//call getRate() method and calculateBill()method of DomesticPaln.  

		System.out.print("EMI for "+LoanName+" for "+amount+" in "+year+" year is: ");  
		p.getRate();  
		p.calculateEMI(amount,year);  
	}  

}
