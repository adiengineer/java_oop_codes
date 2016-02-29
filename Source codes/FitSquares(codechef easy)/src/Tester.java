import java.util.Scanner;
class Tester 
{
	//import java.util.Scanner;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t,i;
		
		t=sc.nextInt();
		for(i=1;i<=t;i++)
		{	int b=sc.nextInt();
		     Square.noOfFittedSquares=0;
	//	sc.close();
		
		Square master=new Square(new Point(0,-2),new Point(2,-2),new Point(2,0),new Point(0,0));
		
		for(; ;)  //infinite till break
		{       Square temp=master;
	            master=new Square(temp.p4,temp.p3,new Point(temp.p3.x,temp.p3.y+2),new Point(temp.p4.x,temp.p4.y+2));
	            
	            if (master.isSquareValidVerti(b)==false)
	            	{  System.out.println(Square.noOfFittedSquares);
	            	break;
	            	}
	           Square.noOfFittedSquares++;//required done to check the horizontal fill
	              master.fillRight(master, b);
		}
		}
		sc.close();
	}

}
