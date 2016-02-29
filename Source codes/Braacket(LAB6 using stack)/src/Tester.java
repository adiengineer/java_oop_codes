import java.util.Scanner;
public class Tester {

	public static void main(String[] args) 
	{   int n,t,i;
	     char curr,prev;
	     String line;
	
		Scanner sc=new Scanner(System.in);
		
		Stack s=new Stack();
		
	    n=Integer.parseInt(sc.nextLine().trim());
        for(t=1;t<=n;t++)
           {   line=sc.nextLine().trim();
        	     
                 for(i=0;i<line.length();i++)
                 {   curr=line.charAt(i);   
                	 
                     if (curr=='['||curr=='{'||curr=='(')
                     s.push(curr);
                     else if (curr==']'||curr=='}'||curr==')')	 
                     { prev=s.pop();
                           
                    	 if ((curr==']'&&prev!='[')||(curr==')'&&prev!='(')||(curr=='}')&&prev!='{')
                    	 {System.out.println("NO");
                    		break; 
                    	 }
                     }
                 }
                 if (i==line.length())
                	 System.out.println("YES");
           }
	}

}
