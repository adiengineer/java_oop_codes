import java.util.Scanner;
public class Tester 
{
    
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
        int N,i,M;   
        String info,query;
        String[] infosp,querysp;
          N=Integer.parseInt(sc.nextLine().trim());
          
          EmpTree t=new EmpTree();
          Employee[] staff=new Employee[N]; //only creates array of references to objects.
          
            
          for(i=0;i<N;i++)
            {    
            	info=sc.nextLine().trim();
            	infosp=info.split(" ");
                        staff[i]=new Employee(infosp); //actual employee created, now this will be pased around.
                       t.addToTree(staff[i], t.root);      
            }  // employees created, filled and added to the tree.
          
          M=Integer.parseInt(sc.nextLine());
          
          for(i=0;i<M;i++)
          {
        	  query=sc.nextLine().trim();
        	  querysp=query.split(" ");
        	  
        	  t.search(Integer.parseInt(querysp[0]), Integer.parseInt(querysp[1]), t.root);
        	  
          }
          sc.close();
	}

}
