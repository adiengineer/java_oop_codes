
public class Sketchpad 
{  private char[][] pad=new char[80][80];//basic data type so memory has been allocated.
    public Sketchpad()
    {int i,j;
    	for(i=0;i<80;i++)
    	{for(j=0;j<80;j++)
    		 pad[i][j]=' ';
    		
    	}
    }//pad filled with all spaces. now write tis behaviour.
    
    public void obeyturtle(int row,int column)
    {   pad[row][column]='*';
    }
    
    public void displaypad()
    {  int i,j;
         for(i=0;i<80;i++)
            {for(j=0;j<80;j++)
                { System.out.print(pad[i][j]);
            	      if (j==79)
            	    	  System.out.println();
                }
        	}
    }//implements the show command.
    
}
