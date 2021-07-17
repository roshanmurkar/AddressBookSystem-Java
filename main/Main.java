package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		int i = 1;
		person.setFirstName("roshan");
		person.setLastName("Murkar");
		person.setAddress("at post sawantwadi sindhudurg");
		person.setCityName("sawaantwadi");
		person.setStateName("maharastra");
		person.setZipCode("416510");
		person.setPhoneNumber("1234567890");
		person.setEmailAddress("host@gmail.com");
		
		
		//printing all info
		System.out.println("first Name :-" + person.getFirstName() 
							+ " \nLast Name :-" + person.getLastName()
							+ " \naddress :-" + person.getAddress() 
							+ " \ncity Name :-" + person.getCityName() 
							+ "\nstate Name :-"+ person.getStateName() 
							+ " \nzip :-" + person.getZipCode() + " "
							+ "\nphone :-" + person.getPhoneNumber()
							+ " \nemail :-" + person.getEmailAddress());
	}

}
