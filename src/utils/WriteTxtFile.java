package utils;

import java.io.FileWriter;
import java.io.IOException;

import rentacar.Customer;

public class WriteTxtFile {

	public static void writeCustomer(Customer customer,String filePath) {
		try {
			FileWriter writer = new FileWriter(filePath, true);
			writer.write("\n");
			writer.write(customer.getFirstName() + " , " + customer.getLastName() + " , " + customer.getSSN());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
