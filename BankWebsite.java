package ui;
import java.util.Scanner;

import entity.Account;
 import entity.Account;

public class BankWebsite {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Scanner userInput2 = new Scanner(System.in);
		Scanner userInput3 = new Scanner(System.in);
		
		System.out.println("Enter 1st person Name,Account Number & Ifsc Code (resp) : ");
		
		Account person1 = new Account();
		
		String personNameFromUser = userInput.nextLine();	
		person1.setName(personNameFromUser);
		
		int personAccountNumberFromUser = userInput2.nextInt();
		person1.setAccountNumber(personAccountNumberFromUser);
		
		int personIfscCodeFromUser = userInput3.nextInt();
		person1.setIfscCode(personIfscCodeFromUser);
		
		System.out.println("======== Details of 1st Person ========");
		System.out.println("Name : "+person1.getName());
		System.out.println("Account Number : "+person1.getAccountNumber());
		System.out.println("Ifsc Code : "+person1.getIfscCode());
		System.out.println("==========================\n");
		
		System.out.println("Enter 2nd person Name,Account Number & Ifsc Code (resp) : ");
		
		Account person2 = new Account();
		
		String person2NameFromUser = userInput.nextLine();	
		person2.setName(person2NameFromUser);
		
		int person2AccountNumberFromUser = userInput2.nextInt();
		person2.setAccountNumber(person2AccountNumberFromUser);
		
		int person2IfscCodeFromUser = userInput3.nextInt();
		person2.setIfscCode(person2IfscCodeFromUser);
		
		System.out.println("======== Details of 2nd Person ========");
		System.out.println("Name : "+person2.getName());
		System.out.println("Account Number : "+person2.getAccountNumber());
		System.out.println("Ifsc Code : "+person2.getIfscCode());
		System.out.println("==========================\n");
	}

}
