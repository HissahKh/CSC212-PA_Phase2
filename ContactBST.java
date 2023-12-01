
public class ContactBST<T>{
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
  

        if (findkey(k)) {
            current = (BSTNode<T>) q;  // findName() modified current
            System.out.println("The Contact name is already in the PhoneBook");
            return false; // Contact with the same name already exists
        }
        
        if(findPhoneNumber(((Contact)p.getData()).getPhoneNumber())) {
        	System.out.println("The Contact number is already in the PhoneBook");
        	return false;}
        
        
        if (empty()) {
            root = current = (BSTNode<T>) p;
            return true;
        } 
        
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
    public void Search(int c,String str){
        if (empty()){
            System.out.println("tree is empty");    
        }
        BSTNode<Contact> p=root;
        int n=0;
        
        
        switch(c){
            case 1:
               
                while (p!=null){
                    if(str.compareToIgnoreCase((Contact)p.data.getContactName())=0){
                        System.out.println("\nContact found!");
					
					System.out.println("\nName;" + ((Contact) p.getData()).getContactName());
							
					System.out.println("Phone Number;" + ((Contact) p.getData()).getPhoneNumber());
							
					System.out.println("Email Address;" + ((Contact) p.getData()).getEmailAddress());
				   
					System.out.println("Address;" + ((Contact) p.getData()).getAddress());
											
					System.out.println("Birthday;" + ((Contact)p.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) p.getData()).getNote());
					n++;
					 return; 
                    }
                    
                    else
                        if(str.compareToIgnoreCase((Contact)p.data.getContactName())<0){
                            p=p.left;
                        }
                        else
                            p=p.right;
                    
                  
                        
                }
                
            case 2:
                while(p!=null){
                   if (str.compareToIgnoreCase((Contact)p.data.getPhoneNumber())=0) {
                       System.out.println("\nContact found!");
					
					System.out.println("\nName;" + ((Contact) p.getData()).getContactName());
							
					System.out.println("Phone Number;" + ((Contact) p.getData()).getPhoneNumber());
							
					System.out.println("Email Address;" + ((Contact) p.getData()).getEmailAddress());
				   
					System.out.println("Address;" + ((Contact) p.getData()).getAddress());
											
					System.out.println("Birthday;" + ((Contact) p.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) p.getData()).getNote());
					n++;
					 return; 
                                         
                   }
                   
                   else
                        if(str.compareToIgnoreCase((Contact)p.data.getPhoneNumber())<0){
                            p=p.left;
                        }
                        else
                            p=p.right;
                    
                }
                
            case 3:
                while(p!=null){
                    if (str.compareToIgnoreCase((Contact)p.data.getEmailAddress())=0){
                         System.out.println("\nContact found!");
					
					System.out.println("\nName;" + ((Contact) p.getData()).getContactName());
							
					System.out.println("Phone Number;" + ((Contact) p.getData()).getPhoneNumber());
							
					System.out.println("Email Address;" + ((Contact) p.getData()).getEmailAddress());
				   
					System.out.println("Address;" + ((Contact) p.getData()).getAddress());
											
					System.out.println("Birthday;" + ((Contact) p.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) p.getData()).getNote());
					n++;
					 return; 
                                         
                    }
                    else
                        if(str.compareToIgnoreCase((Contact)p.data.getEmailAddress())<0)
                            p=p.left;
                        
                        else
                            p=p.right;
                }
                
            
            case 4:
                while(p!=null){
                   if (str.compareToIgnoreCase((Contact)p.data.getAddress())=0){
                      System.out.println("\nContact found!");
					
					System.out.println("\nName;" + ((Contact) p.getData()).getContactName());
							
					System.out.println("Phone Number;" + ((Contact) p.getData()).getPhoneNumber());
							
					System.out.println("Email Address;" + ((Contact) p.getData()).getEmailAddress());
				   
					System.out.println("Address;" + ((Contact) p.getData()).getAddress());
											
					System.out.println("Birthday;" + ((Contact)p.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) p.getData()).getNote());
					n++;
					 return; 
                                         
                   }
                   else
                        if(str.compareToIgnoreCase((Contact)p.data.getAddress())<0)
                            p=p.left;
                        
                        else
                            p=p.right;
                   
                }
                
            case 5:
                while(p!=null){
                    if(str.compareToIgnoreCase((Contact)p.data.getBirthday())=0){
                        System.out.println("\nContact found!");
					
					System.out.println("\nName;" + ((Contact) p.getData()).getContactName());
							
					System.out.println("Phone Number;" + ((Contact) p.getData()).getPhoneNumber());
							
					System.out.println("Email Address;" + ((Contact) p.getData()).getEmailAddress());
				   
					System.out.println("Address;" + ((Contact) p.getData()).getAddress());
											
					System.out.println("Birthday;" + ((Contact) p.getData()).getBirthday());
													
					System.out.println("Notes:" + ((Contact) p.getData()).getNote());
					n++;
					 return; 
                    }
                     else
                        if(str.compareToIgnoreCase((Contact)p.data.getBirthday())<0)
                            p=p.left;
                        
                        else
                            p=p.right;
                    
                }
            
        }
        
        if(n==0)
            System.out.print("contact not found");
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

	private void inOrderTraversal(BSTNode<T> node, StringBuilder result) {
	    if (node != null) {
	        // Traverse the left subtree
	        inOrderTraversal(node.left, result);

	        // Append the current node's information to the result string
	        result.append(((Contact)node.getData()).getContactName()).append("\n");

	        // Traverse the right subtree
	        inOrderTraversal(node.right, result);
	    }
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
	 
}

	


