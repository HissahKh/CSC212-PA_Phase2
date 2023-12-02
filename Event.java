public class Event{
	
	private String eventTitle;
    private String dateAndTime;
    private String location;
    private String Type;
    private String ContactName;
    
   
    public Event(){
    	
    	 this.eventTitle = null;
         this.dateAndTime = null;
         this.location = null;
         this.Type = null;
         this.ContactName = null;
         
    }
    
    public Event(String eventTitle, String dateAndTime, String location, String Type,String ContactName){
    	
        this.eventTitle = eventTitle;
        this.dateAndTime = dateAndTime;
        this.location = location;
        this.Type = Type;
        this.ContactName = ContactName;
        
    }
    
    
    // setter's

    public void setEventTitle(String eventTitle){
    	
        this.eventTitle = eventTitle;
        
    }

    public void setDateAndTime(String dateAndTime){
    	
        this.dateAndTime = dateAndTime;
        
    }

    public void setLocation(String location){
    	
        this.location = location;
        
    }
    
    public void setType(String Type) {
    	this.Type = Type;
    }

  
    
    
    // getter's

    public String getEventTitle(){
    	
        return eventTitle;
        
    }

    public String getDateAndTime(){
    	
        return dateAndTime;
        
    }

    public String getLocation(){
    	
        return location;
        
    }
    
    public String getType() {
    	return Type;
    }
    
    public String getContact() {
    	return ContactName;
    }


    
    
    
    public void display(){
    	
    	System.out.println("\nEvent title:"+eventTitle);
    	System.out.println("Date and time of event:"+dateAndTime);
    	System.out.println("Location of event:" +location);
    	System.out.println("The Type:" +Type);
    	
    	
    }
    
}
