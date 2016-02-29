
public class Turtle 
{   private int row,column;
    private String facing;
    private String penfunction;
        
    public Turtle(int row,int column)
    {   this.row=row;
    	 this.column=column;
    	 facing="EAST";
    	 penfunction="UP"; //now write the behaviour.
    }
    
    public void setpenfunction(String command)
    { penfunction=command;
    }
    
    public void setfacing(String command)
    { if (facing.equals("EAST"))
           { if(command.equals("RIGHT"))
    	          facing="SOUTH";
           else
        	   facing="NORTH";
           }
    
    else if (facing.equals("WEST"))
    { if(command.equals("RIGHT"))
	          facing="NORTH";
    else
 	   facing="SOUTH";
    }
    
    else if (facing.equals("NORTH"))
    { if(command.equals("RIGHT"))
	          facing="EAST";
    else
 	   facing="WEST";
    }
    
    else if (facing.equals("SOUTH"))
    { if(command.equals("RIGHT"))
	          facing="WEST";
    else
 	   facing="EAST";
    }
    } //this implements the right left commanads.
    
    public void move(int steps,Sketchpad s)
    { int i,j;
    	if (penfunction.equals("UP"))
          {  if (facing.equals("EAST"))
                   column=column+steps;
        	     
          else if (facing.equals("WEST"))
                    column=column-steps;  
          else if (facing.equals("NORTH"))
        	        row=row-steps;
          else if (facing.equals("SOUTH"))
        	        row=row+steps;
    	  }//if pen is up the turtle just moves according to its direction.now pen down draw.
    else if (penfunction.equals("DOWN"))
         { if (facing.equals("EAST"))
               { for(i=column;i<=column+steps-1;i++)
            	     s.obeyturtle(row,i);//this will sketch lines on the pad.
                     column=column+steps;
        	   }
         
         else  if (facing.equals("WEST"))
              { for(i=column;i>=column-(steps-1);i--)
    	     s.obeyturtle(row,i);//this will sketch lines on the pad.
             column=column-steps;
	          }
         
         else  if (facing.equals("SOUTH"))
         { for(i=row;i<=row+(steps-1);i++)
	     s.obeyturtle(i,column);//this will sketch lines on the pad.
        row=row+steps;
         }
         
         else  if (facing.equals("NORTH"))
         { for(i=row;i>=row-(steps-1);i--)
	     s.obeyturtle(i,column);//this will sketch lines on the pad.
        row=row-steps;
         }
    	 }
    }
}
