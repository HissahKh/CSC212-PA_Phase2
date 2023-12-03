public class EventLinkedList<T>{

	  private Node<T> head;
	  private Node<T> current; 
		
		
		
		// needs modifying 
		

		public EventLinkedList() {
			
			head = current = null;
			
		}

		public EventLinkedList(Node<T> head) {
			
			head = head;
			
		}
		
		public boolean isEmpty() {
			
			return head == null;
			
		}
		
		public void findfirst () {
		       current = head;
		 }
		
		public void findnext () 
		{ current = current.next;
		 }
		
		 public T retrieve () {
		return current.getData(); }
		 
		public void update (T val) 
		{ current.data = val;
		}
		
		
		public boolean last () {
			return current.next == null;
			}
		
		
		
//add
		public void add(T n) {
			Node<T> newNode = new Node<>(n);
			

			if (head == null || ((Event)head.getData()).getEventTitle().replaceAll("\\s+","").compareToIgnoreCase(((Event)newNode.getData()).getEventTitle().replaceAll("\\s+","")) > 0) 
			{
				newNode.next = head;
				head = newNode;
			}
			else {
				 Node current = head;
			     while (current.next != null && ((Event)current.next.getData()).getEventTitle().replaceAll("\\s+","").compareToIgnoreCase(((Event)newNode.getData()).getEventTitle().replaceAll("\\s+","")) < 0)  {
			         current = current.next;
			     }
			     newNode.next = current.next;
			     current.next = newNode;
			     current = current.next;
			}}


		
		
		
		

//-------------------------------------------
		
		public void delete(T d) {
			
			if(isEmpty())
				return ;   //message?
			
			if(head.getData().equals(d)) {
				head = head.getNext();
				return;
			}
			
			else {
				
	            Node<T> current = head.getNext();
	            Node<T> previous = head;
	            	
				while (current != null) {
					
					if(current.getData().equals(d))
						previous.setNext(current.getNext());
					
					else {
						
						previous = current;
						
						current = current.getNext();
			
					}
					
				}
						
			}
		
		
		
		
		

	}
		
		public boolean exist(Event c) {
			
			Node<Event> current = (Node<Event>) head;
			
			while(current != null){
				
				if(current.getData().getEventTitle().compareTo(c.getEventTitle().replaceAll("\\s+","")) == 0 )
				   return true;
					
				current = current.getNext();
				
			}
			
			return false;
				
			
		}
		public void display() {
	        Node current = head;
	        while (current != null) {
	        	System.out.println("Event title: "+ ((Event) current.getData()).getEventTitle());
				System.out.println("Contact name: "+((Event) current.getData()).getContact());
				System.out.println("Event date and time (MM/DD/YYYY HH:MM): "+((Event) current.getData()).getDateAndTime());
				System.out.println("Event location: "+((Event) current.getData()).getLocation());
				System.out.println();
	            
	            current = current.next;
	        }
	        System.out.println();
	    }


	  

	}
