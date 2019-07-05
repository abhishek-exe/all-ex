package java8;

public class Employee {
	int age;
	String loc;
	String name;
	Phone phone;
	public Phone getPhone() {
		return phone;
		
	}
public void setPhone(Phone phone) {
	this.phone = phone;
}
public Employee(int age,String loc,String name) {
	super();
	this.age=age;
	this.loc=loc;
	this.name=name;
}
public int getage() {
	return age;
}
public void setage (int age) {
this.age=age;
}

}