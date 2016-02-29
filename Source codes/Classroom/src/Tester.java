import java.io.*;
import java.util.Scanner;
public class Tester 
{ public static void main(String[] args) throws FileNotFoundException
	{ int i,j; 
	File f=new File("C:\\Users\\Aditya\\Desktop\\studentinfo.txt");
	    Scanner sc=new Scanner(f);
	    Scanner sc1=new Scanner(System.in);
	     String info;
	     String[] infosp;
	    Classroom c=new Classroom();
	  int teacherq;
 	    for(i=0;i<5;i++)
 	    {for(j=0;j<10;j++)
 	        {  if (j%2==0)
 	              {  info=sc.nextLine().trim();
 	        	       infosp=info.split(" ");
 	        	       c.fillstudent(i,j,infosp);
 	              }
 	        }
 	    }
 	    
 	   for(i=0;i<5;i++)
	    {for(j=0;j<10;j++)
	        {  if (j%2!=0)
	              {  info=sc.nextLine().trim();
	        	       infosp=info.split(" ");
	        	       c.fillstudent(i,j,infosp);
	              }
	        }
	    }//student filled accordingly
 	    	
 	  c.printmonneighbours(); 
 	    
 	     teacherq=Integer.parseInt(sc1.nextLine().trim());
 	     c.tellneighbours(teacherq);
	}
}

