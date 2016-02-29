import java.util.Scanner;
public class Solver 
{  
    public static void main(String[] args) 
	{ Scanner sc=new Scanner(System.in);
    	int t,k,i,j,st=0,pt=0,omt=0,ost=0;
    	char[] arr;
    	String expression;
    	
		   t=Integer.parseInt(sc.nextLine().trim());
        for(k=1;k<=t;k++) //test case loop
        {  expression=sc.nextLine().trim();
        	arr=new char[expression.length()];//array made to hold the expression
        	for(i=0;i<arr.length;i++)
        		arr[i]=expression.charAt(i);//array filled now check balance
        	
        	for(i=0;i<arr.length;i++)
        	{st=0;pt=0;omt=0;ost=0;
        	     if(arr[i]=='}'||arr[i]==')'||arr[i]==']')
        	    	 continue;
        	     if(i==arr.length-1)//last postition
        	     {if (arr[i]=='{'||arr[i]=='('||arr[i]=='[')
        	    	 {System.out.println("NO");
        	    	   break;
        	    	 }
        	    	 
        	     }
        		for(j=i+1;j<arr.length;j++)
        		{if (arr[i]=='{')
        		    { if (arr[j]==arr[i])
        			      st++;
        		    else if (arr[j]=='('||arr[j]=='[')
        		    	  omt++;
        		    else if (arr[j]==')'||arr[j]==']')
        		    	  ost++;
        		    else if(arr[j]=='}')
        		          pt++;
        		    	
        		       if(pt>st)
        		           {  if(omt==ost)
        		    	   break;  //partner found.
        		           else
        		               {System.out.println("NO");
        		        	      break;
        		               }
        		           }
        		    }
        		
        		else if(arr[i]=='(')
        		    {if (arr[j]==arr[i])
      			      st++;
      		    else if (arr[j]=='{'||arr[j]=='[')
      		    	  omt++;
      		    else if (arr[j]=='}'||arr[j]==']')
      		    	  ost++;
      		    else if(arr[j]==')')
      		          pt++;
      		    	
      		       if(pt>st)
      		           {  if(omt==ost)
      		    	   break;  //partner found.
      		           else
      		               {System.out.println("NO");
      		        	      break;
      		               }
      		           }
        			
        		    }
        		
        		else if(arr[i]=='[')
    		    {if (arr[j]==arr[i])
  			      st++;
  		    else if (arr[j]=='{'||arr[j]=='(')
  		    	  omt++;
  		    else if (arr[j]=='}'||arr[j]==')')
  		    	  ost++;
  		    else if(arr[j]==']')
  		          pt++;
  		    	
  		       if(pt>st)
  		           {  if(omt==ost)
  		    	   break;  //partner found.
  		           else
  		               {System.out.println("NO");
  		        	      break;
  		               }
  		           }
    			
    		    }
        		}
        		if (ost!=omt)
        			break;
        	}
        	if (i==arr.length)
        		System.out.println("YES");
        }
        sc.close();
	}

}
