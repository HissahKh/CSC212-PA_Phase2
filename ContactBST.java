
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

		public boolean findkey(String tkey) {
			BSTNode<T> p = root,q = root; 
			if(empty())
			return false;
			
			int compareResult = tkey.compareTo(p.key);
			while(p != null) {
			q = p; 
			
			if(p.key.replaceAll("\\s+","").equalsIgnoreCase(tkey.replaceAll("\\s+",""))) {
			current = p; 
			return true;
			} 
			else
			if(compareResult < 0)
			p = p.left; 
			else
			p = p.right;
			} current = q; return false;
			}

		
	//insert
		public boolean insert(String k ,T val) {
			BSTNode<T> p , q =  current;
			p =  new BSTNode<T>(k, val);
			if (empty()) {
	            root = current = p;
	            return true;
	        }
	  

	        if (findkey(k)) {
	            current = (BSTNode<T>) q;  // findName() modified current
	            System.out.println("The Contact name is already in the PhoneBook");
	            return false; // Contact with the same name already exists
	        }
	        
	        if(findPhoneNumber(((Contact)p.getData()).getPhoneNumber())) {
	        	System.out.println("The Contact number is already in the PhoneBook");
	        	return false;}
	        
	      
	        else {
	            // current is pointing to parent of the new key
	            int compareResult = k.replaceAll("\\s+","").compareTo(current.key.replaceAll("\\s+",""));
	            if (compareResult < 0)
	                current.left = (BSTNode<T>) p;
	            else
	                current.right = (BSTNode<T>) p;
	            current = (BSTNode<T>) p;
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
	                    
	                    return;
	                } else if (str.compareToIgnoreCase(((Contact) p.getData()).getContactName()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }}
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
	                    
	                    return;
	                } else if (str.compareToIgnoreCase(s) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }}
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
	                    
	                    return;
	                } else if (str.compareToIgnoreCase(((Contact) p.getData()).getEmailAddress()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }}
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
	                    
	                    return;
	                } else if (str.compareToIgnoreCase(((Contact) p.getData()).getAddress()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }}
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
	                    
	                    return;
	                } else if (str.compareToIgnoreCase(((Contact) p.getData()).getBirthday()) < 0) {
	                    p = p.left;
	                } else {
	                    p = p.right;
	                }
	            }}
	    }
	   

	    
	        System.out.print("Contact not found");
	    
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

		//print
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
			switch(Ch) {
			case 1:
				findkey(E.getContact());
				((Contact)current.getData()).getEvent().add(E);
				System.out.println("Event added successfully");
				break;
			case 2:
				boolean Exist = EventExist(E.getEventTitle());
				if(!Exist) {
					findkey(E.getContact());
					((Contact)current.getData()).getEvent().add(E);
					System.out.println("Appoitment added successfully");
				}
				else
					System.out.println("The Appointment is already booked");
						
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
	public void printByFirstName(BSTNode<T>node,String name){
	BSTNode<T> q=root;
	int c=0;
	if(empty()){
	System.out.print("tree is empty!");
	return;}
	
	int ind = ((Contact) node.getData()).getContactName().indexOf(' ');
	String fName = ((Contact)node.getData()).getContactName().substring(0,ind);
	if (fName.equalsIgnoreCase(name)){
	System.out.println("\nContact found!");
						
	System.out.println("\nName;" + ((Contact) node.getData()).getContactName());
	System.out.println("Phone Number;" + ((Contact) node.getData()).getPhoneNumber());
	System.out.println("Email Address;" + ((Contact) node.getData()).getEmailAddress());
	System.out.println("Address;" + ((Contact) node.getData()).getAddress());
	System.out.println("Birthday;" + ((Contact) node.getData()).getBirthday());
	System.out.println("Notes:" + ((Contact) node.getData()).getNote());
	c++;
	}
	 if (node != null ) {
		 if(fName.compareToIgnoreCase(name)<0)
     	EventExist(node.left,name);
		 else
         EventExist(node.right,name);
     }
	if(c==0){
	System.out.println("the contact is not found");}
	}

	
	 
	  }

	
	 
	  }
