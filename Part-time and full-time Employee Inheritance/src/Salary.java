import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String address;
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	

}
class Employee extends Person{
	private String department;
	private String designation;
	public Employee(String name, int age, String address, String department, String designation) {
		super(name, age, address);
		this.department = department;
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
class PartTimeEmployee extends Employee{
	private double hours;
	private double rate;
	public PartTimeEmployee(String name, int age, String address, String department, String designation, double hours,
			double rate) {
		super(name, age, address, department, designation);
		this.hours = hours;
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "PartTimeEmployeee [hours=" + hours + ", rate=" + rate + "]";
	}
	public double salary(double hour,double rate){
		double salary=hour*rate*4;

		return salary;
	}	

}
class FullTimeEmployee extends Employee{
	private double basic;
	private double allowance;
	public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic,
			double allowance) {
		super(name, age, address, department, designation);
		this.basic = basic;
		this.allowance = allowance;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public String toString() {
		return "FullTimeEmployee [basic=" + basic + ", allowance=" + allowance + "]";
	}
	public double salary(double basic,double allowance) {
		allowance=allowance/100;
		double salary=basic+(allowance*basic);
		return salary;
	}



}
public class Salary {

	public static void main(String[] args) {
		//String name, int age, String address, String department, String designation, double hours,
		//double rate
		Scanner in=new Scanner(System.in);
		//input hour
		double hour=in.nextDouble();
		//input rate
		double rate=in.nextDouble();
		//input basic salary of fulltime employee
		double basic=in.nextDouble();
		PartTimeEmployee P1=new PartTimeEmployee("Rania",21,"Cantonment","CSE","Student",hour,rate);
		FullTimeEmployee P2=new FullTimeEmployee("Rania",21,"Cantonment","CSE","Student",basic,25);
		System.out.println("Salary(PT): "+P1.salary(hour, rate));
		System.out.println("Salary(FT): "+P2.salary(basic, 25));
		in.close();
	}

}
