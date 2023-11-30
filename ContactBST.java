
public class ContactBST<T>{
 private BSTNode<T> root, current;
    
    public ContactBST(){
        root=current=null;
    }
    
    public boolean empty(){
        return root==null;
        
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
}

	


