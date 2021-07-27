import java.util.Scanner;

class Person{
	private String name;
	private String gender;
	private int age;
	public Person(String name, String gender, int age) {

		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Name=" + name + ", Age=" + age ;
	}

}

class Employee extends Person{
	private String id;
	private String department;
	private double salary;
	public Employee(String name, String gender, int age, String id, String department, double salary) {
		super(name, gender, age);
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Salary=" + salary ;
	}

}

class Faculty extends Employee{
	private String initial;
	private String rank;
	public Faculty(String name, String gender,int age, String id, String department, double salary, String initial,
			String rank) {
		super(name,gender, age, id, department, salary);
		this.initial = initial;
		this.rank = rank;
	}
	public String getInitial() {
		return initial;
	}
	public void setInitial(String initial) {
		this.initial = initial;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Faculty Name: "+super.getName()+"\nRank: " + rank +"\nAge: "+super.getAge()+"\nSalary: $"+super.getSalary()+"\nInitial: " + initial ;
	}





}



public class Inheritance {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//String name=in.nextLine();
		//String gen=in.next();
		//int age=in.nextInt();
		//String id=in.next();
		//String dept=in.next();
		//double salary=in.nextDouble();
		//String initial=in.next();
	//	String rank=in.next();
		//Faculty F1=new Faculty(name,gen,age,id,dept,salary,initial,rank);
		Faculty F1=new Faculty("Dr. William B. Poucher","Male",55,"SH132","CSE",1000000.0,"WBPh","Professor");
		System.out.println(F1.toString());
		in.close();
	}

}
