package employeeshift;
import java.io.*;
import java.util.Scanner;
public class Tester 
{ public static void main(String[] args) throws FileNotFoundException
	{ int noofemp,i;
	   String line;
	   String[] linesp; 
	 File f=new File("C:\\Users\\Aditya\\Desktop\\Employeerecord.txt");
	    Scanner sc=new Scanner(f);
	   noofemp=Integer.parseInt(sc.nextLine().trim());
	   
	 Employee[] staff=new Employee[noofemp];
	 Emprecord r=new Emprecord();
	    r.setNoofemp(noofemp);
	    for(i=0;i<noofemp;i++)
	       staff[i]=new Employee();//creates employees
	    
	   for(i=0;i<noofemp;i++)
	     {
	         line=sc.nextLine().trim();
	        linesp=line.split(", ");
	         staff[i].gettoknowyourself(linesp); //info sent to employees
	         staff[i].register(r);//info sent to record.
	        // staff[i].introduce();//check data has been stoed 
		 }//now start the shift
	   
	    line=sc.nextLine().trim();
	    linesp=line.split(" ");
	   // System.out.println(linesp[0]+linesp[1]);//check ok
	    r.setNoofappli(Integer.parseInt(linesp[0]));
	    r.setLimit(Integer.parseInt(linesp[1]));//have set limit and noofappli.no of apli and limit scanned.
	   
	    for(i=0;i<Integer.parseInt(linesp[0]);i++)
	          {    
	    	r.fillapplicantid(Integer.parseInt(sc.nextLine().trim()));
	          }//all data has now been read.now start shift imple
	    
	       r.shiftemp();
	  
	    	r.printdatabases();
	    
	  
	   sc.close();
	}

}
