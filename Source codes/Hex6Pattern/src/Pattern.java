import java.util.Scanner;
public class Pattern 
{
   
	public static void main(String[] args) 
	{  Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int starsperline=Integer.parseInt(sc.nextLine().trim());
      int i,numberofspaces=starsperline-1,j;
    
      int firstloopcontroller=starsperline-1;
      for(i=1;i<=firstloopcontroller;i++)
      {
    	 //print required spaces
    	  for(j=1;j<=numberofspaces;j++)
    		 System.out.print(" ");
    	  
    	  for(j=1;j<=starsperline;j++)
    		  System.out.print("*");
    	  System.out.println("");
    	 
    	  starsperline=starsperline+2;
    	  numberofspaces--;
      }
      
      
      for(j=1;j<=starsperline;j++)
    	  System.out.print("*");
      System.out.println("");
      
      starsperline=starsperline-2;
     numberofspaces=1;
      for(i=1;i<=firstloopcontroller;i++)
      {
    	 //print required spaces
    	  for(j=1;j<=numberofspaces;j++)
    		 System.out.print(" ");
    	  
    	  for(j=1;j<=starsperline;j++)
    		  System.out.print("*");
    	  System.out.println("");
    	  starsperline=starsperline-2;
    	  numberofspaces++;
      }
	}
	
	 
    

}
