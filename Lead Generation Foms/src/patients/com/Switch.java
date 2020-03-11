package patients.com;
import java.io.*;
import patients.com.*;
import java.util.*;
import java.util.stream.*;

public class Switch {
	public static void main(String args[]) {
		
	
		Patients pat = new Patients();
		boolean isTrue =true;
		
		while(isTrue) {
		System.out.println("/////////////// Hello  Please Choose one of the Options below ///////////////////// ");
		System.out.println("1. Enter details as a patient");
		System.out.println("2. Access as admin");
		Scanner select = new Scanner(System.in);
		int choice = select.nextInt();
		switch(choice)
		{
		case 1: pat.addDetails();
			break;
		case 2: 
			String username, password;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter username:");//username:user
	        username = s.nextLine();
	        System.out.print("Enter password:");//password:user
	        password = s.nextLine();
	        
	        if(username.equals("user") && password.equals("user"))
	        {
	            System.out.println("Authentication Successful");
	            System.out.println("1. Display all the patients details");
	            System.out.println("2. Sort all the patients details");
	            Scanner userIn = new Scanner(System.in);
	            int userChoice = userIn.nextInt();
	            switch(userChoice)
	            {
	            case 1:
	            	break;
	            case 2:
	            	System.out.println("1. Sort by starting letter");
	            	System.out.println("2. Sort by country");
	            	System.out.println("3. Sort by problem");
	            	Scanner sort = new Scanner(System.in);
	            	int sortInput = sort.nextInt();
	            	switch(sortInput)
	            	{
	            	case 1: 
	            	}
	            }
	        }
	        else
	        {
	            System.out.println("Authentication Failed");
	        }s.close();
			
		}
	}

}
}
