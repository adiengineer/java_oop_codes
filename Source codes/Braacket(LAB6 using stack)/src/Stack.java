
public class Stack 
{private char[] elements=new char[100];
   private int top=-1;

   public void push(char c)
   {if (top<99)
      {  top++;
	      elements[top]=c;
      }
   }
   
   public char pop()
   { int temp;
	   if (top>-1)
      {  temp=top;
      top--;
		   return elements[temp];
	      
      }
	   else return 1;//if one is returned means stack is empty.
   }
}
