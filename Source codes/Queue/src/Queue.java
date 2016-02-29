

public class Queue 
{  
	private Node head=null;
      private Node tail=null;
      
      public void insert(int a)//queue composes of a set of nodes 
      {if (head==null)
          { head=new Node();
    	     head.setData(a);
    	     tail=head;
    	     head.setNext(null);
          }
      
      else
          {  tail.setNext(new Node());
    	         tail.getNext().setData(a);
    	         tail=tail.getNext();
    	         tail.setNext(null);
          }
    	  
      }//insert at the tail of the queue.
      
      public int delete()
      {    if (head==tail)
            {  head=null;
    	       tail=null;
    	       //  System.out.println("Queue is now empty!");
            }
    	   
           else    
            {  head=head.getNext();
        	 
            }
      }
      
      public void show()
      { Node curr=head; 
    	    while(curr!=null)
    	    {  System.out.println(curr.getData());
    	    	curr=curr.getNext();
    	    }
      }
}
