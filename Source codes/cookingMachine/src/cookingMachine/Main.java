package cookingMachine;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      int t,l,a,b;
      
      Scanner sc = new Scanner(System.in);
      
      t=Integer.parseInt(sc.nextLine());
      
      //test case loop.
      for(l=1;l<=t;l++)
      {
    	 int divcount=0;
    	  String input=sc.nextLine().trim();
    	  String [] inputsp=input.split(" ");
    	  
    	  a=Integer.parseInt(inputsp[0]);
    	  b=Integer.parseInt(inputsp[1]);
    	  
    	  double pb=Math.log(b)/Math.log(2.0);
    	  //now check if a is a power of two.
    	  double powerchecker=Math.log(a)/Math.log(2.0); //pc is log to base 2. If int then power of 2. else not.
    	  
    	  if (powerchecker==(int)powerchecker) //then it is actually an int.
    		System.out.println((int)Math.abs(powerchecker-pb));
    	  
    	  else
    	  {
    	    while(powerchecker!=(int)powerchecker) //while pc is not a power of 2. imp change pc.
    	    {
    	    	if (a%2==0)
    	    		a=a/2;
    	    	else
    	    		a=(a-1)/2; //divide the number accordingly.
    	    	powerchecker=Math.log(a)/Math.log(2.0);
    	    	divcount++;
    	    }
    	    
    	    //when prog comes here, pc will have a power of 2.
    	    System.out.println((int)(Math.abs(powerchecker-pb))+divcount);
    	  }
    		  
      }
	}

}
