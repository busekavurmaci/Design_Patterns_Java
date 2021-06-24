package Factory_Bank;

public class Customer {

	public int Id;
	public String name;
	public String address;
	public int phoneNo;
	public int acctNo;
	
	//Constructor
	public Customer(int id, String name, String address, int phoneNo, int acctNo) {
		Id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.acctNo = acctNo;
		
		System.out.println("Customer Information");
		System.out.println("Id: "+ id+" Name: "+ name + " Phone: "+ phoneNo+ " Account No: "+ acctNo);
		System.out.println("-----");
	}

}
