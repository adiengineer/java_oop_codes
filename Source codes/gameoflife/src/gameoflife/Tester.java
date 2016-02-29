package gameoflife;
import java.util.Scanner;
public class Tester 
{  public static void main(String[] args)
	{ int i,j,k,l;
	  String line1,linein;
	  String[] line1sp;
	Scanner sc=new Scanner(System.in);
	 line1=sc.nextLine().trim();
	  line1sp=line1.split(" ");
	    final int MAXROWNUM=Integer.parseInt(line1sp[0]);
	    final int MAXCOLUMNNUM=Integer.parseInt(line1sp[1]);
	 //better use nextlinehere.done
	 String line;    
	 Cell[][] grid=new Cell[MAXROWNUM][MAXCOLUMNNUM]; //this creates ref
	    for(i=0;i<MAXROWNUM;i++)
	    { for(j=0;j<MAXCOLUMNNUM;j++)
	          grid[i][j]=new Cell(i,j);
	    }//grid ref and objects created.
	     
	    for(i=0;i<MAXROWNUM;i++)
	    { linein=sc.nextLine().trim();
	        //  System.out.println(line.length());
	         for(j=0;j<linein.length();j++)
	          { grid[i][j].setOwneroldstate(linein.charAt(j));
	        /* System.out.print(grid[i][j].getOwneroldstate());//check 
	                        if (j==(linein.length()-1))
	                     System.out.println();*/
	                    	            
	          }
	    }  //grid initialized.all cells filled correctly.display correct.now generations
	    
	    for(i=1;i<=100;i++) //first only one check
	      {  for(k=0;k<MAXROWNUM;k++)
	            { for(l=0;l<MAXCOLUMNNUM;l++)
	              {grid[k][l].changeacorrules(MAXROWNUM, MAXCOLUMNNUM, grid);
	              System.out.print(grid[k][l].getOwnernewstate());//check 
                  if (l==(MAXCOLUMNNUM-1))
               System.out.println();
	                 
	              }//this will show new generation
	              }
	          for(k=0;k<MAXROWNUM;k++)
	          { for(l=0;l<MAXCOLUMNNUM;l++)
	        	   grid[k][l].setOwneroldstate(grid[k][l].getOwnernewstate());//so that old is now replaced 
	        	  
	          }
	            }
	      
	    
	   
	    sc.close();
	}    
 
	    
	  
	    
    
}