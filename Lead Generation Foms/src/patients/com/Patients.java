package patients.com;
import java.util.*;
import java.util.ArrayList;

public class Patients {
	public void addDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your phone Number");
		String phone=sc.nextLine();
		System.out.println("Enter your email");
		String email=sc.nextLine();
		System.out.println("Enter your country");
		String country=sc.nextLine();
		System.out.println("Enter your problem");
		String problem=sc.nextLine();
		sc.close();
		System.out.println("Your Name: "+name);
		System.out.println("Your Phone number: "+phone);
		System.out.println("Your Email: "+email);
		System.out.println("Your Country: "+country);
		System.out.println("Your Problem: "+problem);
		
		
		ArrayList<String> details = new ArrayList<String>();
		
		details.add( name);
		details.add( phone);
		details.add( email);
		details.add( country);
		details.add( problem);
		sc.close();
	}
}

