
/* This is EXTREMLY Important. In the recursive funciton I was gradually sliding down curr until it reached null. then i was assigning it a node and thought it 
  was getting connected in the tree. but remember that null represents some arbitrary location in memory which is not assigned to anybody
  though this is inconsistent with the usual pointer behaviour.*/
public class EmpTree 
{
	Node root=null;

	public void addToTree(Employee e, Node curr) //recursive is easier,when called first insert Employee and root.
	{    
		if (root==null)
	{
		root=new Node(e);
		System.out.println("INSERTED");
		return;
	} //changed important first condition.  
		
	
                    		 
	       if (curr.e.getTenure()>e.getTenure())
	    	   {  if (curr.left!=null)
	    	   addToTree(e,curr.left);
	    	   else
	    	      {
	    		       curr.left=new Node(e);
	    		         return;
	    	      }
	    	   }
	       
	       if (curr.e.getTenure()<e.getTenure())
	    	   {  if (curr.right!=null)
	    	   addToTree(e,curr.right);
	    	   else
	    		   {curr.right=new Node(e);
	    		       return;
	    		   }
	    	   }
	       
	       if (curr.e.getTenure()==e.getTenure())
	       {
	    	   if (curr.e.getSalary()>e.getSalary())
	    		   { if (curr.left!=null)
	    		   addToTree(e,curr.left);
	    		   else
	    		   {  curr.left=new Node(e);
	    			    return;
	    		   }
	    		   }
	    	   if (curr.e.getSalary()<=e.getSalary()) //if equal i choose to put it on to the right.
	    	       {  if (curr.right!=null)
	    		   addToTree(e,curr.right);
	    	       else
	    	           {
	    	    	       curr.right=new Node(e);
	    	    	        return;
	    	           }
	    	       }
	    	       
	       }
	        // is this necessary or will the compiler return anyway.
	}// the fact that such a tree is binary allows us to not write a return condition in the recursive part to handle what if null is not found, but that cant happen
	
     boolean AtLeastOneInstanceFound=false;	
public void search(int queryTenure,int querySalary,Node curr)
	{                           
		if (curr==null)
		{       if (AtleastOneInstanceFound==false)
			System.out.println("NOT FOUND");
                         else
                             AtLeastOneInstanceFound=false;
			return;
		}
		
		if (curr.e.getTenure()==queryTenure&&curr.e.getSalary()==querySalary)
		{
			System.out.println(curr.e.getId());//if found report id.
		//	return; dont return here as there may be more than one employees with the same id.
                         AtLeastOneInstanceFound=true;
		}
		
		if (curr.e.getTenure()>queryTenure)
	         search(queryTenure,querySalary,curr.left);
		if (curr.e.getTenure()<queryTenure)
			 search(queryTenure,querySalary,curr.right);
		if (curr.e.getTenure()==queryTenure)
		{
			if (curr.e.getSalary()>querySalary)
		         search(queryTenure,querySalary,curr.left);
			if (curr.e.getSalary()<=querySalary) // channged here
		         search(queryTenure,querySalary,curr.right);
			
		}
		return; //this return is not necessary because the curr ref will becime null at some point.
	}
}
