package repeatchecker;
import java.util.Arrays;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
   // the test case needs long and bigInt.
		int t,l;
		
		Scanner sc=new Scanner(System.in);
		
		//get t.
		t=Integer.parseInt(sc.nextLine().trim());
		
		//test case loop.
		for(l=1;l<=t;l++)
		{
		long A,B,C,K;
			double x1,x2;
			double deter;
			String query;
			
			query=sc.nextLine().trim();
			
			//get the a b k's isolated.
		   String[] querysp=query.split(" ");
		   System.out.println(querysp[0]+querysp[1]+querysp[2]+querysp[3]);
		   //get the numbers as longs.
		   A=Integer.parseInt(querysp[0]);
		   B=Integer.parseInt(querysp[1]);
		   C=Integer.parseInt(querysp[2]);
		   K=Integer.parseInt(querysp[3]);
		   
		   deter=B*B-4*A*(C-K); //deter is correct.
		   System.out.println(deter);
		  
		   double root=Math.sqrt(deter);
		   System.out.println(root);
		   x1=(-B+root)/2*A;
		   x2=(-B-root)/2*A;
		  System.out.println(x1);
		  System.out.println(x2);
		   
		   if (C-K>=0)
		   System.out.println("0");
			   
		   else if (x1<0 && x2<0)
			   System.out.println("No ans");
		   
		   else if (x1>=0 && x2<0)
		   {
			   System.out.println((int)Math.ceil(x1)); 
		   }
		   
		   else if (x1<0 && x2>=0)
		   {
			   System.out.println((int)Math.ceil(x2));
		   }
		   
		   else if(x1>=0 && x2>=0)
		   {
			   if (x1<x2)
				   System.out.println((int)Math.ceil(x1));
			   else if (x1>x2)
				   System.out.println((int)Math.ceil(x2));
			   else if (x1==x2)
				   System.out.println((int)Math.ceil(x1));
		   }
		}
	}
	
}


