
public class AddressTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address myAddress2 = new Address();
		System.out.println(myAddress2);	
		Address myAddress = new Address("173 Happy St", "Cresskill", "New Jersey", "07626", "USA");
		//check same country
		System.out.println(myAddress.equalsCountry(myAddress2));
		//check same state
		System.out.println(myAddress.equalsState(myAddress2));
		//Check same city
		System.out.println(myAddress.equalsCity(myAddress2));

	}

}
