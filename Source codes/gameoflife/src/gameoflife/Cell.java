package gameoflife;

public class Cell 
{ private  int rownum,columnnum,livenenum;
   private char owneroldstate;
   private char ownernewstate;
	Cell()
	{
	}
   Cell(int rownum,int columnnum)
	{  
	  this.rownum=rownum;
	    this.columnnum=columnnum;
	    livenenum=0;
	    
    }   //this provides the cell with basic identity.
public int getRownum() {
	return rownum;
}
public void setRownum(int rownum) {
	this.rownum = rownum;
}
public int getColoumnnum() {
	return columnnum;
}
public void setColoumnnum(int coloumnnum) {
	this.columnnum = coloumnnum;
}
public int getLivenenum() {
	return livenenum;
}
public void setLivenenum(int livenenum) {
	this.livenenum = livenenum;
}
public char getOwneroldstate() {
	return owneroldstate;
}
public void setOwneroldstate(char owneroldstate) {
	this.owneroldstate = owneroldstate;
}
public char getOwnernewstate() {
	return ownernewstate;
}
public void setOwnernewstate(char ownernewstate) {
	this.ownernewstate = ownernewstate;
}   //now we write the changing behaviour of cell


public void changeacorrules(int maxrownum,int maxcolumnnum,Cell[][] grid)
{    livenenum=0;//here i am rechecking it i expect it to change  
	int arr[][]=new int[8][2];
    int k;
    arr[0][0]=rownum+1;
	arr[0][1]=columnnum;
	arr[1][0]=rownum-1;
	 arr[1][1]=columnnum;
	 arr[2][0]=rownum;
	 arr[2][1]=columnnum+1;
	 arr[3][0]=rownum;
	 arr[3][1]=columnnum-1;
	 arr[4][0]=rownum+1;
	arr[4][1]=columnnum+1;
	arr[5][0]=rownum-1;
	arr[5][1]=columnnum-1;
	arr[6][0]=rownum+1;
	arr[6][1]=columnnum-1;
	arr[7][0]=rownum-1;
	arr[7][1]=columnnum+1;
	   
	    for(k=0;k<=7;k++)
	     {  if(arr[k][0]>=0&&arr[k][0]<maxrownum&&arr[k][1]>=0&&arr[k][1]<maxcolumnnum)
	          {   if(grid[arr[k][0]][arr[k][1]].getOwneroldstate()=='*')
	        	      livenenum++;
	    	  }
	     }
	    
	    if (livenenum>=4)
	        ownernewstate='-';
	    else if (livenenum<=1)
	    	 ownernewstate='-';
	    else if(owneroldstate=='*'&&(livenenum==2||livenenum==3))
	    	   ownernewstate=owneroldstate;
	 
	   else if (owneroldstate=='-'&&(livenenum==3))
	    	 ownernewstate='*';
	    
	    else if (owneroldstate=='-'&&(livenenum==2))// mod
	    	ownernewstate=owneroldstate;
}

public void permanentchange()
    {  owneroldstate=ownernewstate;
	}

}