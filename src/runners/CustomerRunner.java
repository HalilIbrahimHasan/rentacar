package runners;

import java.util.List;
import all.*;
import rentacar.Customer;
import utils.ReadTxtFiles;
import utils.WriteTxtFile;

public class CustomerRunner {

	static Customer customer = new Customer();
	 
	
	public static void main(String[] args) throws Exception {
		
		customer.setFirstName("Firuza");
		customer.setLastName("Kasiri");
		customer.setSSN("222-55-5555");
		String filePath = "AllCustomers.txt";
		
		CreditCardPortal cardPortal = new CreditCardPortal();
		cardPortal.setCardNumber("123456789");
		cardPortal.setCvvCode("123");
		cardPortal.setFullName(customer.getFirstName()+customer.getLastName());
		
		customer.setCreditCard(cardPortal);
		
		WriteTxtFile.writeCustomer(customer,filePath);
//		List <Customer> list = ReadTxtFiles.readCustomer( filePath);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getFirstName());
//			System.out.println(list.get(i).getLastName());
//			System.out.println(list.get(i).getSSN());
//
//		}
		System.out.println(isNewCustomer(filePath));
//		isNewCustomer(filePath);
		
	}
	
	
	public static boolean isNewCustomer(String filePath) throws Exception {
		
		List <Customer> list = ReadTxtFiles.readCustomer( filePath);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getFirstName());
			

			if(list.get(i).getFirstName().trim().equalsIgnoreCase("Murat")) {
				if(list.get(i).getLastName().trim().equalsIgnoreCase("Cakiroglu")) {
					if(list.get(i).getSSN().trim().equalsIgnoreCase("222-22-2222")) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	
}
