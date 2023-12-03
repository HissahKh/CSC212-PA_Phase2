public class ContactBST<T> {
	private BSTNode<T> root, current;
    
	   public ContactBST() {
		root = current = null;
		}
		public boolean empty() {
		return root == null;
		}
		public boolean full() {
		return false;
		}
		public T retrieve () {
		return current.data;
		}

		public boolean findKey(String tkey) {
		    if (empty()) {
		        return false;
		    }

		    BSTNode<T> p = root;
		    int compareResult = tkey.replaceAll("\\s+", "").compareTo(p.key.replaceAll("\\s+", ""));

		    while (p != null) {
		        if (compareResult == 0) {
		            current = p;
		            return true;
		        } else if (compareResult < 0) {
		            p = p.left;
		        } else {
		            p = p.right;
		        }

		        // Update compareResult inside the loop
		        if (p != null) {
		            compareResult = tkey.replaceAll("\\s+", "").compareTo(p.key.replaceAll("\\s+", ""));
		        }
		    }

		    return false;
		}

		
	//insert
		public boolean insert(String k, T val) {
		    BSTNode<T> p, q = current;
		    p = new BSTNode<T>(k, val);

		    if (empty()) {
		        root = current = p;
		        return true;
		    }

		    if (findKey(k)) {
		        current = q;
		        System.out.println("The Contact name is already in the PhoneBook");
		        return false;
		    }

		    if (findPhoneNumber(((Contact) p.getData()).getPhoneNumber())) {
		        System.out.println("The Contact number is already in the PhoneBook");
		        return false;
		    } else {
		        int compareResult = k.replaceAll("\\s+", "").compareTo(current.key.replaceAll("\\s+", ""));
		        if (compareResult < 0)
		            current.left = p;
		        else
		            current.right = p;
		        current = p;
		        return true;
		    }
		}



	    
	    //search
	    public void Search(int c, String str) {
	    

	    BSTNode<T> p;
	    p = root;
	    

	    switch (c) {
	        case 1 -> {
	            while (p != null) {
	                if (str.compareToIgnoreCase(((Contact) p.getData()).getContactName()) == 0) {
	                    System.out.println("\nContact found!");
	                    System.out.println("Name: " + ((Contact) p.getData()).getContactName());
	                    System.out.println("Phone Number: " + ((Contact) p.getData()).getPhoneNumber());
	                    System.out.println("Email Address: " + ((Contact) p.getData()).getEmailAddress());
	                    System.out.println("Address: " + ((Contact) p.getData()).getAddress());
	                    System.out.println("Birthday: " + ((Contact) p.getData()).getBirthday());
	                    System.out.println("Notes: " + ((Contact) p.getData()).getNote());
	                    
	           
	                } if (str.compareToIgnoreCase(((Contact) p.getData()).getContactName()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }break;}
	        
	        case 2 -> {
	            while (p != null) {
	                String s=""+((Contact) p.getData()).getPhoneNumber();
	                if (str.compareToIgnoreCase(s) == 0) {
	                    System.out.println("\nContact found!");
	                    System.out.println("Name: " + ((Contact) p.getData()).getContactName());
	                    System.out.println("Phone Number: " + ((Contact) p.getData()).getPhoneNumber());
	                    System.out.println("Email Address: " + ((Contact) p.getData()).getEmailAddress());
	                    System.out.println("Address: " + ((Contact) p.getData()).getAddress());
	                    System.out.println("Birthday: " + ((Contact) p.getData()).getBirthday());
	                    System.out.println("Notes: " + ((Contact) p.getData()).getNote());
	                    
	                    
	                } if (str.compareToIgnoreCase(s) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }break;}
	        case 3 -> {
	            while (p != null) {
	                if (str.compareToIgnoreCase(((Contact) p.getData()).getEmailAddress()) == 0) {
	                    System.out.println("\nContact found!");
	                    System.out.println("Name: " + ((Contact) p.getData()).getContactName());
	                    System.out.println("Phone Number: " + ((Contact) p.getData()).getPhoneNumber());
	                    System.out.println("Email Address: " + ((Contact) p.getData()).getEmailAddress());
	                    System.out.println("Address: " + ((Contact) p.getData()).getAddress());
	                    System.out.println("Birthday: " + ((Contact) p.getData()).getBirthday());
	                    System.out.println("Notes: " + ((Contact) p.getData()).getNote());
	                    
	                    
	                } if (str.compareToIgnoreCase(((Contact) p.getData()).getEmailAddress()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }break;}
	        case 4 -> {
	            while (p != null) {
	                if (str.compareToIgnoreCase(((Contact) p.getData()).getAddress()) == 0) {
	                    System.out.println("\nContact found!");
	                    System.out.println("Name: " + ((Contact) p.getData()).getContactName());
	                    System.out.println("Phone Number: " + ((Contact) p.getData()).getPhoneNumber());
	                    System.out.println("Email Address: " + ((Contact) p.getData()).getEmailAddress());
	                    System.out.println("Address: " + ((Contact) p.getData()).getAddress());
	                    System.out.println("Birthday: " + ((Contact) p.getData()).getBirthday());
	                    System.out.println("Notes: " + ((Contact) p.getData()).getNote());
	                    
	                    
	                } if (str.compareToIgnoreCase(((Contact) p.getData()).getAddress()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }break;}
	        case 5 -> {
	            while (p != null) {
	                if (str.compareToIgnoreCase(((Contact) p.getData()).getBirthday()) == 0) {
	                    System.out.println("\nContact found!");
	                    System.out.println("Name: " + ((Contact) p.getData()).getContactName());
	                    System.out.println("Phone Number: " + ((Contact) p.getData()).getPhoneNumber());
	                    System.out.println("Email Address: " + ((Contact) p.getData()).getEmailAddress());
	                    System.out.println("Address: " + ((Contact) p.getData()).getAddress());
	                    System.out.println("Birthday: " + ((Contact) p.getData()).getBirthday());
	                    System.out.println("Notes: " + ((Contact) p.getData()).getNote());
	                    
	                   
	                } if (str.compareToIgnoreCase(((Contact) p.getData()).getBirthday()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }
	            break;
	            }
	        
	    }
	 
	    
	}
		
	//method to search if number exist
		public boolean findPhoneNumber(int phoneNumber) {
			return findPhoneNumber1(root, phoneNumber);}

	public boolean findPhoneNumber1(BSTNode<T> p, int phoneNumber) {
		if (p == null) {
	        return false;
	    }

	    if (((Contact)p.getData()).getPhoneNumber()== phoneNumber) {
	        return true;  // Contact with the given phone number found
	    }

	    // Recursively search in the left and right subtrees
	    if (phoneNumber < ((Contact)p.getData()).getPhoneNumber()) {
	        return findPhoneNumber1(p.left, phoneNumber);
	    } else {
	        return findPhoneNumber1(p.right, phoneNumber);
	    }}
	

		//print for check
		public String print() {
		    StringBuilder result = new StringBuilder();
		    inOrderTraversal(root, result);
		    return result.toString();
		}

		public void inOrderTraversal(BSTNode<T> node, StringBuilder result) {
		    if (node != null) {
		        // Traverse the left subtree
		        inOrderTraversal(node.left, result);

		        // Append the current node's information to the result string
		        result.append(((Contact)node.getData()).getContactName()).append("\n");

		        // Traverse the right subtree
		        inOrderTraversal(node.right, result);
		    }
		}
		
	
		 
		  


		
		
		public void delete(String del) {
		    if (empty()) {
		        return;
		    }


		    BSTNode<T> parent = null;
		    BSTNode<T> current = root;
		    boolean isLeftChild = false;


		    while (current != null) {
		    	
		        int compareResult = del.compareToIgnoreCase(current.key.replaceAll("\\s+", ""));

		        if (compareResult == 0) {
		            break; 
		        }

		        parent = current;
		        if (compareResult < 0) {
		            current = current.left;
		            isLeftChild = true;
		        } else {
		            current = current.right;
		            isLeftChild = false;
		        }
		    }

		    if (current == null) {
		        return; 
		    }


		    if (current.left == null && current.right == null) {
		        if (current == root) {
		            root = null; 
		        } else if (isLeftChild) {
		            parent.left = null;
		        } else {
		            parent.right = null;
		        }
		    }
		  
		    else if (current.right == null) {
		        if (current == root) {
		            root = current.left; 
		        } else if (isLeftChild) {
		            parent.left = current.left;
		        } else {
		            parent.right = current.left;
		        }
		    } else if (current.left == null) {
		        if (current == root) {
		            root = current.right; 
		        } else if (isLeftChild) {
		            parent.left = current.right;
		        } else {
		            parent.right = current.right;
		        }
		    }
		   
		    else {
		        BSTNode<T> successor = getSuccessor(current);
		        if (current == root) {
		            root = successor; 
		        } else if (isLeftChild) {
		            parent.left = successor;
		        } else {
		            parent.right = successor;
		        }
		        successor.left = current.left;
		    }
		}


		private BSTNode<T> getSuccessor(BSTNode<T> node) {
		    BSTNode<T> parent = node;
		    BSTNode<T> successor = node;
		    BSTNode<T> current = node.right;

		    while (current != null) {
		        parent = successor;
		        successor = current;
		        current = current.left;
		    }

		    if (successor != node.right) {
		        parent.left = successor.right;
		        successor.right = node.right;
		    }

		    return successor;
	}
		
		
		public void addEvent(Event E,int Ch) {
			BSTNode<T> q = current;
			switch(Ch) {
			case 1:
				if(findKey(E.getContact())) {
					EventLinkedList List = ((Contact)current.getData()).getEvent();
					List.findfirst();
					if(!List.isEmpty()) {
					while(!List.last()) {
						if(((Event) List.retrieve()).getDateAndTime().equalsIgnoreCase(E.getDateAndTime())){
							System.out.println("The contact have an Event in the same time for the new Event");
							current = q; 
							return;
						}
						List.findnext();
					}
					if(((Event) List.retrieve()).getDateAndTime().equalsIgnoreCase(E.getDateAndTime())){
						System.out.println("The contact have an Event in the same time for the new Event");
						current = q; 
						return;
					}}
				((Contact)current.getData()).getEvent().add(E);
				System.out.println("Event added successfully");
				}
				else
					System.out.println("please check the contact name! ");
				break;
			case 2:
				boolean Exist = EventExist(E.getEventTitle());
				if(!Exist) {
					if(findKey(E.getContact())) {
						EventLinkedList List = ((Contact)current.getData()).getEvent();
						List.findfirst();
						if(!List.isEmpty()) {
						while(!List.last()) {
							if(((Event) List.retrieve()).getDateAndTime().equalsIgnoreCase(E.getDateAndTime())){
								System.out.println("The contact have an Appointment in the same time and date for the new Appointment");
								current = q; 
								return;
							}
							List.findnext();
						}
						if(((Event) List.retrieve()).getDateAndTime().equalsIgnoreCase(E.getDateAndTime())){//For last element
							System.out.println("The contact have an Appointment in the same time and date for the new Appointment");
							current = q; 
							return;
						}}
					((Contact)current.getData()).getEvent().add(E);
					System.out.println("Appoitment added successfully");
					}
					else
						System.out.println("please check the contact name! ");
				}
				else
					System.out.println("The Appointment is already booked");
				break;
						
			}
			current = q; 
			return;
			
		}
		
		public void PrintEventDetails(String T , int n) {//n for choice(Contact name or event title)
			BSTNode<T> q = current;
			switch(n) {
			case 1:
				findKey(T);
				EventLinkedList List = ((Contact)current.getData()).getEvent();
				List.findfirst();
				while(!List.last()) {
					System.out.println("Event title: "+ ((Event) List.retrieve()).getEventTitle());
					System.out.println("Contact name: "+((Event) List.retrieve()).getContact());
					System.out.println("Event date and time (MM/DD/YYYY HH:MM): "+((Event) List.retrieve()).getDateAndTime());
					System.out.println("Event location: "+((Event) List.retrieve()).getLocation());
					System.out.println();
					List.findnext();
					}
				System.out.println("Event title: "+ ((Event) List.retrieve()).getEventTitle());
				System.out.println("Contact name: "+((Event) List.retrieve()).getContact());
				System.out.println("Event date and time (MM/DD/YYYY HH:MM): "+((Event) List.retrieve()).getDateAndTime());
				System.out.println("Event location: "+((Event) List.retrieve()).getLocation());
				System.out.println();
			case 2:
				if(empty()){
					System.out.print("Phonebook is empty!");
					return;}
				else
					PrintEventByTitle(root,T);
				}
			current = q;
			return;
				
			}
		public void PrintEventByTitle(BSTNode<T> node, String eventTitle) {
			 if (node != null) {
			        EventLinkedList Data = ((Contact) node.getData()).getEvent();
			        EventLinkedList<Event> Events = Data;
			        Events.findfirst();

			        if (!Events.isEmpty()) {
			            while (!Events.last()) {
			                Event e = Events.retrieve();
			                if (e.getEventTitle().equalsIgnoreCase(eventTitle)) {
			                    System.out.println("Event found!");
			                    System.out.println("Event title: " + e.getEventTitle());
			                    System.out.println("Contact name: " + e.getContact());
			                    System.out.println("Event date and time (MM/DD/YYYY HH:MM): " + e.getDateAndTime());
			                    System.out.println("Event location: " + e.getLocation());
			                    System.out.println();
			                }
			                Events.findnext();
			            }

			            // For last element
			            Event e = Events.retrieve();
			            if (e.getEventTitle().equalsIgnoreCase(eventTitle)) {
			                System.out.println("Event found!");
			                System.out.println("Event title: " + e.getEventTitle());
			                System.out.println("Contact name: " + e.getContact());
			                System.out.println("Event date and time (MM/DD/YYYY HH:MM): " + e.getDateAndTime());
			                System.out.println("Event location: " + e.getLocation());
			                System.out.println();
			            }
			        }

			        // Continue to the next nodes
			        PrintEventByTitle(node.left, eventTitle);
			        PrintEventByTitle(node.right, eventTitle);
			    }
			
	    }
		
		
		//To check if appointment is already in or not 
		public boolean EventExist(String EventTitle) {
			boolean Exist = EventExist(root,EventTitle);
			return Exist;
	    }

	    public boolean EventExist(BSTNode<T> node, String eventTitle) {
	    	boolean Exist = false;
	    	if (node!=null) {
	    	EventLinkedList Data = ((Contact)node.getData()).getEvent();
	    	EventLinkedList <Event> Events = Data;
	    	Events.findfirst();
	    	if(!Events.isEmpty()) {
	    	while (!Events.last()) {
	    		Event e = Events.retrieve();
	    		if(e.getEventTitle().equalsIgnoreCase(eventTitle)) {
	    			Exist = true;
	    			return Exist;
	    		}
	    		else
	    			Events.findnext();	
	    	}}
	    	if(!Events.isEmpty()) {
	    	Event e = Events.retrieve();
	    	if(e.getEventTitle().equalsIgnoreCase(eventTitle)) {
    			Exist = true;
    			return Exist;
    		}
    		else
    			Events.findnext();}
	    	
	        if (node != null ) {
	        	EventExist(node.left,eventTitle);
	            EventExist(node.right,eventTitle);
	        }
	    	}
			return false;
	    }
	    //-------------------------------------------------------
		 


	//print contact by first name
	    public void printByFirstName(String Firstname) {
	    	printByFirstName(root,Firstname);
	    }
	   int c=0;
	public void printByFirstName(BSTNode<T> node,String name) {
	if(empty()){
	System.out.print("PhoneBook is empty!");
	return;}
	if (node != null ) {
	int ind = ((Contact) node.getData()).getContactName().indexOf(' ');
	String fName = ((Contact)node.getData()).getContactName().substring(0,ind);
	if (fName.equalsIgnoreCase(name)){
	System.out.println("\nContact found!");
						
	System.out.println("\nName: " + ((Contact) node.getData()).getContactName());
	System.out.println("Phone Number: " + ((Contact) node.getData()).getPhoneNumber());
	System.out.println("Email Address: " + ((Contact) node.getData()).getEmailAddress());
	System.out.println("Address: " + ((Contact) node.getData()).getAddress());
	System.out.println("Birthday;: " + ((Contact) node.getData()).getBirthday());
	System.out.println("Notes: " + ((Contact) node.getData()).getNote());
	c++;
	}	 
		 if(fName.compareToIgnoreCase(name)<0)
			 printByFirstName(node.left,name);
		 else
			 printByFirstName(node.right,name);
	}
	if(c==0){
	System.out.println("the contact is not found");}
	}
	
	public void printEventsInOrder() {
        printEventsInOrder(root);
    }
	
	public void printEventsInOrder(BSTNode<T> node) {
		
		if(empty()){
			System.out.print("PhoneBook is empty!");
			return;}
		if (node != null ) {
			EventLinkedList <Event> newList = new EventLinkedList<Event>();
			EventLinkedList <Event> Events = ((Contact)node.getData()).getEvent();
			
			if(!Events.isEmpty()) {
				Events.findfirst();
				while(!Events.last()) {
					newList.add(Events.retrieve());
					Events.findnext();
				}
				newList.add(Events.retrieve()); //for last element
			}
			
		
		printEventsInOrder(node.left);
		printEventsInOrder(node.right);
		newList.display();}
		//order
	}
	
	

	
	 
	  }
