import java.util.*;
public class Classroom 
{
      Student[][] classroom=new Student[5][10]; //creates an array of referencs to students.
       int monitorId=0;
       Student monitor;
       
       public  Classroom(ArrayList<Student> arrL)
       {
              int i,j,temp=0;
              for(i=0;i<5;i++)
              {
            	  for(j=0;j<10;j++)
            	  {
            		  if (j%2==0)
            			  {classroom[i][j]=arrL.get(temp);
            			     temp++;
            			  }
            	  }
              }
              
              for(i=0;i<5;i++)
              {
            	  for(j=0;j<10;j++)
            	  {
            		  if (j%2!=0)
            			  {classroom[i][j]=arrL.get(temp);
            			     temp++;
            			  }
            	  }
              }
              
           monitor=arrL.get(12); //assigned the monitor. 
       }   // class room arranged in the required order. checked ok.
       
       public void getNeigbours(int id)
       {
    	   int i,j,k,l;
    	   Student regstudent=null;
    	   
    	   
    	      for(i=0;i<5;i++)
    	      {
    	    	  for(j=0;j<10;j++)
    	    		  if (classroom[i][j].id==id)
    	    		  {  regstudent=classroom[i][j];
    	    		      regstudent.x=i;
    	    		      regstudent.y=j;
    	    		  }  
    	      }
    	     
    	    
    	      if (regstudent==null)
    	    	  System.out.println("ID NOT FOUND");
    	      else
    	      { 
    	    	  if (regstudent.x==0 || regstudent.x==4) //diff rules for first and the last bench
    	        {
    	    	    int[][] arr=new int[8][2];
    	    	    arr[0][0]=regstudent.x-1; arr[0][1]=regstudent.y;
	                arr[1][0]=regstudent.x+1; arr[1][1]=regstudent.y;
	                arr[2][0]=regstudent.x; arr[2][1]=regstudent.y-1;
	                arr[3][0]=regstudent.x; arr[3][1]=regstudent.y+1;
	                arr[4][0]=regstudent.x-1; arr[4][1]=regstudent.y-1;
	                arr[5][0]=regstudent.x+1; arr[5][1]=regstudent.y+1;
	                arr[6][0]=regstudent.x-1; arr[6][1]=regstudent.y+1;
	                arr[7][0]=regstudent.x+1; arr[7][1]=regstudent.y-1;
	                
	                
	                System.out.println(regstudent.name+"s'neigbours are :");
	                for(k=0;k<8;k++)
	                {
	                	
	                	
	                		if ((arr[k][0]>=0&&arr[k][0]<5)&&(arr[k][1]>=0&&arr[k][1]<10))
	                			System.out.println(classroom[arr[k][0]][arr[k][1]].name+" "+classroom[arr[k][0]][arr[k][1]].id);
	                	
	                }     
    	        }
    	       else
    	       {   int[][] arr=new int[6][2];
    	                arr[0][0]=regstudent.x; arr[0][1]=regstudent.y+1;
    	                arr[1][0]=regstudent.x; arr[1][1]=regstudent.y-1;
    	                arr[2][0]=regstudent.x-1; arr[2][1]=regstudent.y;
    	                arr[3][0]=regstudent.x+1; arr[3][1]=regstudent.y;
    	                arr[4][0]=regstudent.x+1; arr[4][1]=regstudent.y+1;
    	                arr[5][0]=regstudent.x-1; arr[5][1]=regstudent.y+1;
    	                
    	                System.out.println(regstudent.name+"s'neigbours are :");
    	                for(k=0;k<6;k++)
    	                {
    	                	
    	                	
    	                		if ((arr[k][0]>=0&&arr[k][0]<5)&&(arr[k][1]>=0&&arr[k][1]<10))
    	                			System.out.println(classroom[arr[k][0]][arr[k][1]].name+" "+classroom[arr[k][0]][arr[k][1]].id);
    	                	
    	                }     
    	       } 
    	      }
       }
}
