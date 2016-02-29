import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Comparator;
import java.util.Collections;

//import java.util.List;
public class Tester
{  
          
	public static void main(String[] args)  throws FileNotFoundException 
	{   int i;
          String info;
          String[] infosp;
	    File f=new File("C:\\Users\\Aditya\\Desktop\\midsem2input.txt");
		Scanner sc=new Scanner(f);

          ArrayList<Student> arrL=new ArrayList<>();
             
            for(i=0;i<50;i++)
            {   info=sc.nextLine().trim();
                infosp=info.split(" ");
            arrL.add(new Student(infosp));
            }  // add info if 50 students to arrayList.
         
           
              Collections.sort(arrL,new Compare());            
          
            
                Classroom c=new Classroom(arrL);
                c.getNeigbours(13);
              sc.close();
                   
	}

}
