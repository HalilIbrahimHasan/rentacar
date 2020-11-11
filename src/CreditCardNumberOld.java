import java.util.Scanner;

public class CreditCardNumberOld {
	
	Scanner scan = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private long cardNumber;
	
	//CreditCardNumber Constructor
	 public CreditCardNumberOld() {
				 
		 creditCard(cardNumber, firstName, lastName);
		 
	 }
	 
	 
	
	 //Get Credit Card information
	 public void creditCard(long cardNum, String firstN, String lastN) {
	
		
		 //Checking if the user leave first name and last name area blank
		 do{		 
				 System.out.println("First Name: ");
				 firstN = scan.nextLine().toLowerCase().trim();
				 if(firstN.isEmpty()) {
		             System.out.println("Error: First Name cannot be empty.Please Enter a valid First Name:"); 
					 firstN = scan.nextLine().toLowerCase().trim();
		             continue;
		         }else {
		        	 this.setFirstName(fName(firstN));
		         }
			 
		 }while(firstN.isEmpty());
		 this.setFirstName(fName(firstN));

		 do{
			 System.out.println("Last Name: ");
			 lastN = scan.nextLine().toLowerCase().trim();
			 if(lastN.isEmpty()) {
	             System.out.println("Error: Last Name cannot be empty.Please Enter a valid Last Name:");
	             lastN = scan.nextLine().toLowerCase().trim();
	             continue;
	         }else {
	        	 this.setLastName(lName(lastN));
	         }
		 
	 }while(lastN.isEmpty());
	  this.setLastName(lName(lastN));
		do {
			 System.out.println("Card Number: ");
			 cardNum = scan.nextLong();
			 if (cardValidityCheck(cardNum)!=true) {
				 System.out.println("Error: Card number must be 16 digits without any space. \nPlease Enter a valid Card Number:");
				 cardNum = (scan.nextLong());
				 continue;
			 }else {
	        	  this.cardNumber = cardNum;
	         }
		}while(cardValidityCheck(cardNum)==false);
		this.cardNumber = cardNum;
		 scan.close(); 
		 
}
	 
	 //First name and last name validity check 
	 public String fName(String fName) {
		 String result="";
			 if(!fName.equals("")) {
				 for (int i = 0; i < fName.length()-1; i++) {
					if(fName.charAt(i)>='a' &&  fName.charAt(i)<='z')
						result = this.firstName = fName;
					else
						result = "Invalid Last Name"; 
						
				 }
			 }else
		 		 result = "Invalid Last Name";
		return result;		 
	 }
	 
	 public String lName(String lName) {
		 String result="";
		 	 if(!lName.equals("")) {
				 for (int i = 0; i < lName.length()-1; i++) {
					if(lName.charAt(i)>='a' &&  lName.charAt(i)<='z')
						result = this.lastName = lName;
					else
						result = "Invalid Last Name";
				 }
		 	 }else
		 		 result = "Invalid Last Name";
		return result;
		}
	 
	 //Credit card Validity Check
	 public boolean cardValidityCheck(long cardNum) {
		  String num = cardNum + "";
		  num.replaceAll("\\s", "");
	      int  theSize= num.length();
	      
		 return(theSize==16 ? true : false);
	
	 }
	  	 

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public long getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "CreditCardNumber [firstName=" + firstName + ", lastName=" + lastName + ", cardNumber=" + cardNumber
				+ "]";
	}
}