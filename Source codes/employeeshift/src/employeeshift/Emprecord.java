package employeeshift;

public class Emprecord
{  private  int noofemp,limit,noofappli,idlast=0,newlast=0;
    
 public int getLimit() {
	return limit;
}
public void setLimit(int limit) {
	this.limit = limit;
}
public int getNoofappli() {
	return noofappli;
}
public void setNoofappli(int noofappli) {
	this.noofappli = noofappli;
	 applicantid=new int[noofappli];
}
public int getNoofemp() {
	return noofemp;
}
public void setNoofemp(int noofemp) {
	this.noofemp = noofemp;
}
private Employee headlist[]=new Employee[1000];
    private Employee newlist[]=new Employee[500];
    private int[] applicantid;
     int headlast=0;  
  
     public void fillheadlist(Employee e)
     { if (headlast<noofemp)
    	{headlist[headlast]=e;
    	
 	   headlast++;}
     }
     
      
   public void fillapplicantid(int id)
    { int i;
    	if (idlast<noofappli)
           {  applicantid[idlast]=id;
              idlast++;
           }
    	
    }
   
   public void receiveemp(Employee e)
   { if (newlast<500)
       {newlist[newlast]=e;
            newlast++;
	   }
   }
   
    public void shiftemp()//one case handeled
       { int i,j,k,l,count=0;
           Employee temp;
    	if (noofappli<=limit)
             {   for(i=0;i<applicantid.length;i++)
                   {      for(j=0;j<headlist.length;j++)
                            {   if(headlist[j]!=null)  //mod imp as java does not allow null compariosions
                            	
                	            {if (applicantid[i]==headlist[j].getId())
                                  {  this.receiveemp(headlist[j]);
                            	       headlist[j]=null;
                            	         break;
                                  }
                                }
                            }
            	 
                   }
    	     }
    	
    	else
    	{  //bubblesort according to tenure and then salary
    		  for(k=0;k<noofemp;k++)
    		     {  for(l=0;l<noofemp-k-1;l++)
    		           {   if (headlist[l]!=null &&headlist[l+1]!=null) 
    		    	 {if (headlist[l].getTenure()<headlist[l+1].getTenure())
    		               {//swap
    		        	        temp=headlist[l];
    		        	         headlist[l]=headlist[l+1];
    		        	         headlist[l+1]=temp;
    		               }
    		    	 
    		          
    		           else if (headlist[l].getTenure()==headlist[l+1].getTenure())//then sort by salary
    		                  {  if (headlist[l].getSalary()<headlist[l+1].getSalary())
    		                       {//swap
    		                	       temp=headlist[l];
    		                	       headlist[l]=headlist[l+1];
    		                	       headlist[l+1]=temp;
    		                       }//swapped
    		                  
    		                 }
    		           }//
    		                
    		           for(i=0;i<applicantid.length;i++)
                       {      for(j=0;j<headlist.length;j++)
                                {   if(headlist[j]!=null)  //mod imp as java does not allow null compariosions
                                	
                    	            {if (applicantid[i]==headlist[j].getId() &&j<limit)
                                      {  this.receiveemp(headlist[j]);
                                	       headlist[j]=null;
                                	         break;
                                      }
                                    }
                                }
                	 
                       }
    		    	   }
    			 }
    	}
    	
       }
    
     public void printdatabases()
       { int i;
          System.out.println("HQ");
    	 for(i=0;i<1000;i++)
    	      { if (headlist[i]!=null)
    		        System.out.println(headlist[i].getId());
    	      }
    	 
    	 System.out.println("NEW");
    	  for(i=0;i<limit;i++)
    	     {  if(newlist[i]!=null)
    	           System.out.println(newlist[i].getId());
    	     }
    	}
}