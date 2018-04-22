class MyEmployee {
	private String name;
	private String address;
	private int number;
	
	public MyEmployee(String name, 
		String address, int number) {
		System.out.println("Constructor of class Employee");
		
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public void mailCheck() {
		System.out.println("Post check to: " + this.name
			+ " " + this.address);
	}
	
	public String toString() {
	    return name + " " + address + " " + number;	
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddr) {
		address = newAddr;
	}
	
	public int getNumber() {
		return number;
	}
}


class MySalary extends MyEmployee {
	private double salary;
	
	public MySalary(String name, String address,
		int number, double salary) {
		super(name, address, number);
		
		setSalary(salary);
	}
	
	public void mailCheck() {
		System.out.println("Function mailCheck() of class Salary");
		System.out.print("Post check to: " + getName()
		    + " , Salary is: " + salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		if(newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("Calculate salary and pay to: " + getName());
		
		return salary/52;
	}
}

public class VirtualDemo {
	public static void main(String[] args) {
		MySalary s = new MySalary("Employee A", "Peking", 3, 3600.00);
	    MyEmployee e = new MySalary("Employee B", "Shanghai", 2, 2400.00);
	    
	    System.out.println("Use reference of Salary to call mailCheck() -- ");
	    s.mailCheck();
	    
	    System.out.println("Use reference of Employee to call mailCheck() --");
	    e.mailCheck();	
	}
}
