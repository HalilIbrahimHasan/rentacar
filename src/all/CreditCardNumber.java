package all;

import java.util.Scanner;

public class CreditCardNumber {
	
	Scanner scan = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private String cardNumber;
	
	//CreditCardNumber Constructor
	 public CreditCardNumber() {
		 
		this.firstName = getFirstName(); 
		this.lastName = getLastName();
		this.cardNumber = getCardNumber();
	
	 }

	 
	 //Asks for valid input
	 public void enterText() {
		System.out.println("Error: Invalid Entry. Please Enter Again:" ); 
      }
	 
	 
	 public boolean isEmpty(String input) {
		 int len = input.length();
		 if(len==0) {
			 return true;
		 }else if(input.trim().equals("")) {
			 return true;
		 }
		 return false;
	 }			
	 
	public boolean allLetter(String input) {
		 int count = 0;
		 String name = input.toLowerCase();
		 for (int j = 0; j < input.length(); j++) {
			 if(name.charAt(j)>='a' &&  name.charAt(j)<='z') 
				 count++;		
		}
		 return count == input.length();
	}
	
	public boolean allNumbers(String cardNum) {
		int count = 0;
		for (int j = 0; j < cardNum.length(); j++) {
			 if(cardNum.charAt(j)>='0' &&  cardNum.charAt(j)<='9') 
				 count++;		
		}
		return count == cardNum.length();
	}
		 
	 //Credit card Validity Check
	 public boolean cardValidityCheck(String cardNum) {
		  cardNum = cardNum.replaceAll("[\\s-/@$%&*]", "");
		  //System.out.println(cardNum);
		  return cardNum.length()==16 && allNumbers(cardNum)  ? true : false;
	
	 }
	  	 

	public String getFirstName() {
		boolean result;
		do {
			System.out.println("First Name:");
			firstName = scan.nextLine();
			result = !isEmpty(firstName) && allLetter(firstName);
			if(!result) {
				enterText();
			}
					
		}while(!result);
		
			return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		boolean result = false;
		do {
			System.out.println("Last Name:");
			lastName = scan.nextLine();
			result = !isEmpty(lastName) && allLetter(lastName);
			if(!result) {
				enterText();
			}
		}while(!result);
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getCardNumber() {
		boolean result = false;
		do {
			System.out.println("Card Number:");
			cardNumber = scan.nextLine();
			result = !isEmpty(cardNumber) && cardValidityCheck(cardNumber);
			if(!result) {
				enterText();
			}
		}while(!result);
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	@Override
	public String toString() {
		return "CreditCardNumber2 [firstName=" + firstName + 
				", lastName=" + lastName + ", cardNumber=" + cardNumber+ "]";
	}

}
