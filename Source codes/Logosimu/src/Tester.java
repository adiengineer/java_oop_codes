import java.util.Scanner;
public class Tester
{public static void main(String[] args)
	{ String input;
	   String[] inputsp;
	Scanner sc=new Scanner(System.in);   
	Sketchpad s=new Sketchpad();
	     Turtle t=new Turtle(40,40);
	     
	     while(1==1)
	     {input=sc.nextLine().trim();
	         if (input.equals("END"))
	        	  break;
	         else
	         {if (input.contains(" "))
	              {inputsp=input.split(" ");
	               t.move(Integer.parseInt(inputsp[1]),s);      	     
	              }
	         else
	         { if (input.equals("UP")||input.equals("DOWN"))
	        	  t.setpenfunction(input);
	         else if (input.equals("RIGHT")|| input.equals("LEFT"))
	        	    t.setfacing(input);
	         else if (input.equals("SHOW"))
	        	     s.displaypad();
	         }
	         }
	     }
	     sc.close();
    }

}
