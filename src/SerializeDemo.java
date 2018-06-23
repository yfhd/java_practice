
import java.io.*;

class EmployeeTemp implements java.io.Serializable {
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	
	public void mailCheck() {
		System.out.println("Mailing a check to" + name + " " + address);
	}
}

public class SerializeDemo {
    public static void main(String[] args) {
    	EmployeeTemp e = new EmployeeTemp();
    	e.name = "Reyan Ali";
    	e.address = "Phokka Kuan, jAmbehta Peer";
    	e.SSN = 11122333;
    	e.number = 101;
    	
    	try {
    		FileOutputStream fileOut = 
    		    new FileOutputStream("epmloyee.ser");
    		ObjectOutputStream out = new ObjectOutputStream(fileOut);
    		out.writeObject(e);
    		out.close();
    		fileOut.close();
    		System.out.print("Serialized data is saved in employee.ser");
    	} catch(IOException i) {
    		i.printStackTrace();
    	}
    }
}  
