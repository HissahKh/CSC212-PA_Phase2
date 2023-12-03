import java.util.Scanner;

public class PhoneBook {
 public static void main(String [] args){
Scanner input = new Scanner(System.in);

ContactBST <Contact> ContactBST;
        ContactBST = new ContactBST<>();

System.out.println("WelcometotheLinkedTreePhonebook!");
int ch = 0;
do{
	System.out.println("Please choose an option:");
	System.out.println("1.Add a contact");
	System.out.println("2.Search for a contact");
	System.out.println("3.Delete a contact");
	System.out.println("4.Schedule an event");
	System.out.println("5.Print event details");
	System.out.println("6.Print contacts by firstname");
	System.out.println("7.Print all events alphabetically");
	System.out.println("8.Exit");
	int choice = input.nextInt();
	ch = choice;
	switch (choice)
	{
	case 1 -> {
            //Add a Contact
            System.out.println("Enter the contact's name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Enter the contact's phone number: ");
            int number = input.nextInt();
            System.out.println("Enter the contact's email address: ");
            String email = input.next();
            System.out.println("Enter the contact's address: ");
            String adrs = input.next();
            System.out.println("Enter the contact's birthday: ");
            String Birthday = input.next();
            System.out.println("Enter any notes for the contact: ");
            String note = input.next();
            EventLinkedList <Event> Event = new EventLinkedList<Event>(); //Event LinkedList for each Contact
            Contact newContact = new Contact(name , number , email , adrs , Birthday , note, Event); //creating new contact
            ContactBST.insert(name, newContact); //add the contact to the list by order
            System.out.println("Thank you");
        }
	//search
	case 2 -> {
            if(ContactBST.empty()){
                System.out.println("Phone book is empty");
            }
            else{
            System.out.println("enter your search criteria");
            System.out.println("1.Name");
	    System.out.println("2.PhoneNumber");
	    System.out.println("3.Email Address");
	    System.out.println("4.Address");
	    System.out.println("5.Birthday");
            int cr=input.nextInt();
            String s;
            switch(cr){
                case 1 -> {
                    System.out.print("enter contact's name: ");
                    input.nextLine();
                    s=input.nextLine();
                    ContactBST.Search(cr,s);
                    break;
                    }
                case 2 -> {
                    System.out.print("enter contact's phone number: ");
                    int n=input.nextInt();
                    String phn=""+n;
                    ContactBST.Search(cr,phn);
                    break;
                    }
                case 3 -> {
                    System.out.print("enter contact's email address: ");
                    s=input.next();
                    ContactBST.Search(cr,s);
                    break;
                    }
                case 4 -> {
                    System.out.print("enter contact's address: ");
                    input.nextLine();
                    s=input.nextLine();
                    ContactBST.Search(cr,s);
                    break;
                    }
                case 5 -> {
                    System.out.print("enter contact's birthday: ");
                    input.nextLine();
                    s=input.nextLine();
                    ContactBST.Search(cr,s);
                    break;
                    }
             
            }
            
            
        }break;}
		
		
		
	case 3 -> {
		// Delete Contact

		System.out.println("Enter delete criteria: ");
		
		System.out.println("1.Name");
		System.out.println("2.PhoneNumber/n");
		
		System.out.print("Enter your choice: ");
		
		int choice2 = input.nextInt();
		
		System.out.println();
	

		if (choice2 == 1) {
			
			System.out.print("Enter the contact name/n");
			
			input.nextLine();
			
			String delName = input.nextLine();

			ContactBST.delete(delName);

		}

		if (choice2 == 2) {
			
			System.out.print("Enter the phone number of the contact/n");
			
			String delPhone = input.next();

			ContactBST.delete(delPhone);

		}

		break;
        }
		
		//add event
	case 4 -> {
		System.out.println("Enter Type:");
		System.out.println("1- Event");
		System.out.println("2- Appointment");
		int Ch = input.nextInt();
		System.out.println("Enter event title: ");
		input.nextLine();
		String title = input.nextLine();
		System.out.println("Enter the contact name: ");
		String contact_n = input.nextLine();
		System.out.println("Enter event date and time: ");
		String date_time = input.nextLine();
		System.out.println("Enter event location: ");
		String location = input.nextLine();
		String Type;
		if (Ch ==1)
			 Type = "Event";
		else
			Type = "Appointment";
		Event NewEvent = new Event(title,date_time,location,Type,contact_n);
		ContactBST.addEvent(NewEvent, Ch);
		System.out.println("Thank you");
		
		
		
	}
		//print event details
	case 5 -> {
		System.out.println("Enter search critiria: ");
		System.out.println("1- Contact name ");
		System.out.println("2- Event title ");
		int c = input.nextInt();
		switch(c) {
		case 1:
			System.out.println("Enter the contact name: ");
			input.nextLine();
			String name = input.nextLine();
			ContactBST.PrintEventDetails(name, c);
		case 2:
			System.out.println("Enter the Event title: ");
			input.nextLine();
			String title = input.nextLine();
			ContactBST.PrintEventDetails(title, c);
		if(c != 1 && c != 2 )
			System.out.println("Please Enter 1 or 2 ");
		}
        }
	//Print contacts by first name	
	case 6 -> {
            System.out.println("enter contact's first name: ");
            String name=input.next();
            ContactBST.printByFirstName(name);
            break;
            
        }
		
		
	case 7 -> {
        }


case 8 -> ch = 8; //Exit
	
	default -> System.out.println("Please enter the correct number!");
	}
    
    //Delete Contact
    //add an event or appointment
    //Print contacts by first name
    //Print all events alphabetically
    	

}while(ch != 8);
String contactsInfo = ContactBST.print();
System.out.println(contactsInfo);

	}
}
