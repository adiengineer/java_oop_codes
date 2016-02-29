
public class Classroom
{      
	Student[][] student=new Student[5][10];
       
     Classroom()
     {  int i,j;
    	 for(i=0;i<5;i++)
    	 {for(j=0;j<10;j++)
    		   student[i][j]=new Student();
    		 
    	 }
     }

	private int monitorroolno=13;
    
   public void fillstudent(int row,int column,String info[])
   {   student[row][column].setName(info[0]);
        student[row][column].setId(Integer.parseInt(info[1]));
   }
    
    public void printmonneighbours()
    {   System.out.println(student[1][4].getName()+" "+student[1][4].getId());
    System.out.println(student[1][5].getName()+" "+student[1][5].getId());
    System.out.println(student[3][4].getName()+" "+student[3][4].getId());
    System.out.println(student[3][5].getName()+" "+student[3][5].getId());
    System.out.println(student[2][3].getName()+" "+student[2][3].getId());
    System.out.println(student[2][5].getName()+" "+student[2][5].getId());
    }
    
   public void tellneighbours(int rollno)
   {   int i,j,k,l;  
	   for(i=0;i<5;i++)
	   {for(j=0;j<10;j++)
	       {if (rollno==student[i][j].getId())
	           {System.out.println(student[i][j].getName());
	    	          if(i==0 ||i==4)
	    	          {
	    	        	  
	    	          }
	    	          
	    	          else
	    	          {  int[][] arr=new int [6][2];
	    	        	     arr[0][0]=i-1;arr[0][1]=j;
	    	        	     arr[1][0]=i-1;arr[1][1]=j+1;
	    	        	     arr[2][0]=i+1;arr[2][1]=j;
	    	        	     arr[3][0]=i+1;arr[3][1]=j+1;
	    	        	     arr[4][0]=i;arr[4][1]=j-1;
	    	        	     arr[5][0]=i;arr[5][1]=j+1;
	    	        	     for(k=0;k<6;k++)
	    	        	      {
	    	        	           { if (arr[k][0]>=0 &&arr[k][1]<10)
	    	        	                 {   System.out.println(student[arr[k][0]][arr[k][1]].getId());
	    	        	        	   
	    	        	                 }
	    	        	           }
	    	        	      }
	    	          }
	           }
	       }
	   }
	   
   }
}
