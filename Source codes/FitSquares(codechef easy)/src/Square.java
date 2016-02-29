
public class Square 
{
    Point p1;
    Point p2;
    Point p3;
    Point p4;
    
    static int noOfFittedSquares=0;
    
      Square(Point p1,Point p2,Point p3,Point p4)
      {
    	  this.p1=p1;
    	  this.p2=p2;
    	  this.p3=p3;
    	  this.p4=p4;
      } //square completely defined by its four vertices. now write 2 methods is square valid and generate right squares.
      
      public boolean isSquareValidHori(int b)
      {
    	  int limitp2x=b-p2.y;   
    	  int limitp3x=b-p3.y;    
    //	      if ((p1.x>=b)||p1.y>=b)
    	//    	  return false;
    	  
    	      if (( p2.x>limitp2x)||p3.x>limitp3x)
    	    	  return false;
    	         	      
    	      return true;
      }
      
      public boolean isSquareValidVerti(int b)
      {    
    int limitp3y=b-p3.x;
    int limitp4y=b-p4.x;
    	  if (( p3.y>limitp3y)||p4.y>limitp4y)
	    	  return false;
	  	    return true;
      }
      
      public void fillRight(Square master,int b)
      {
    	  if (master.isSquareValidHori(b)==false)
    		  {    Square.noOfFittedSquares--;
    		        return;
    		  }
    	    
    	     Square.noOfFittedSquares++;
    	     this.fillRight(new Square(master.p2,new Point(master.p2.x+2,master.p2.y),new Point(master.p3.x+2,master.p3.y),master.p3), b);
      }
}
