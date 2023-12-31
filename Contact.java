class Contact implements Comparable<String>{
    
	private String contactName;
	private int phoneNumber;
	private String emailAddress;
	private String address;
	private String birthday;
	private String notes;
	private EventLinkedList <Event> Event;


	public Contact(){
		
		contactName = null;
		phoneNumber = (Integer) null;
		emailAddress = null;
		address = null;
		birthday = null;
		notes = null;
		Event = null;
		
	}

	public Contact(Contact c){
		
		contactName = c.contactName;
		phoneNumber = c.phoneNumber;
		emailAddress = c.emailAddress;
		address = c.address;
		birthday = c.birthday;
		notes = c.notes;
		Event = new EventLinkedList<Event>();
		
	}

	public Contact(String contactName, int phoneNumber, String emailAddress, String address, String birthday, String notes,EventLinkedList  Event){
		
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		this.birthday =birthday;
		this.notes = notes;
		this.Event = Event;
		
	}
	
	
	//setter's
	
	
	public void setContactName(String n){
			
		contactName = n;
			
	}

	public void setPhoneNumber(int p){
			
		phoneNumber = p;
			
	}	

	public void setEmailAddress(String e){
			
		emailAddress = e;
			
	}

	public void setAddress(String a){
			
		address = a;
			
	}

	public void setBirthday(String b){
			
		birthday = b;
			
	}

	public void setNotes(String no){
			
		notes = no;
			
	}


	
	// getter's
	
	
	public String getContactName(){
		
		return contactName;
		
	}

	public int getPhoneNumber(){
		
		return phoneNumber;
		
	}

	public String getEmailAddress(){
		
		return emailAddress;
		
	}

	public String getAddress(){
		
		return address;
		
	}

	public String getBirthday(){
		
		return birthday;
		
	}

	public String getNote(){
		
		return notes;
		
	}
	
	public EventLinkedList getEvent() {
		return Event;
	}
	

	
	public void display(){
		
		System.out.println("\nName:" + getContactName());
		System.out.println("Phone Number:" + getPhoneNumber());
		System.out.println("Email Address:" + getEmailAddress());
		System.out.println("Address:" + getAddress());
		System.out.println("Birthday:" + getBirthday());	
		System.out.println("Notes:" + getNote() + "\n");		

	}

	
	@Override
	public int compareTo(String s){
		
		return contactName.compareTo(s);
		
	}

	public int compareTo(Contact c){
		
		return contactName.compareTo(c.contactName);
		
	}

}
