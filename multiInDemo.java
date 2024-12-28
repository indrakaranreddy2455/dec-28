//is /has relation
class person {
	int aadhar;
	String name;
	String address;
}
class Worker extends person{
	Address permanentAddress;//worker is a person
	Address tempAddress;//worker has permanent address
	Address offAddress;//worker has office address
}
class Address{
	String street;
	String flat;
	String pincode;
}
public class multiInDemo {
	public static void main(String[] args) {

	}
	
}
