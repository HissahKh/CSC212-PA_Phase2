import java.util.Scanner;

public class PhoneBook {
public static void main(String [] args){
Scanner input = new Scanner(System.in);

ContactBST <Contact> ContactBST = new ContactBST<Contact>();

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
	case 1:
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
		break;
		
		
		
	case 2:
		//search for a Contact

	        System.out.println("enter your search criteria");
                int cr=input.nextInt();
                String s;
                switch(cr){
                    case 1:
                        System.out.print("enter contact's name: ");
                        s=input.nextLine();
                        ContactBST.Search(cr,s);
                    case 2:
                         System.out.print("enter contact's phone number: ");
                        s=input.nextLine();
                        ContactBST.Search(cr,s);
                        
                    case 3:
                         System.out.print("enter contact's email address: ");
                        s=input.nextLine();
                        ContactBST.Search(cr,s);
                        
                    case 4:
                         System.out.print("enter contact's address: ");
                        s=input.nextLine();
                        ContactBST.Search(cr,s);
                        
                    case 5:
                         System.out.print("enter contact's birthday: ");
                        s=input.nextLine();
                        ContactBST.Search(cr,s);
	
		break;
		
		
		
	case 3:
		//Delete Contact
	
		
		break;
		
		
	case 4:
		//add an event or appointment
	
break;
		
	case 5:
	
		//Print Event Details
		
		break;
		
	case 6:
		//Print contacts by first name
		
		break;
		
		
	case 7:
		//Print all events alphabetically 
break;


case 8:
	ch = 8; //Exit 
	break;
	
	default:
		System.out.println("Please enter the correct number!");
	}
	

}while(ch != 8);
String contactsInfo = ContactBST.print();
System.out.println(contactsInfo);

	}}
