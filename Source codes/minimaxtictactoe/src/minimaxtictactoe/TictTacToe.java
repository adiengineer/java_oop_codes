package minimaxtictactoe;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class TictTacToe
{   public static void main(String[] args) {
    Board b = new Board();
    Random rand = new Random();
    
    b.displayBoard();

    System.out.println("Select turn:\n\n1. Computer 2. User: ");
    int choice = b.scan.nextInt();
    if(choice == 1){//in this design if computer plays first then his first move is random.
        Point p = new Point(rand.nextInt(3), rand.nextInt(3));
        b.placeAMove(p, 1);
        b.displayBoard();
    }
    
    while (!b.isGameOver()) {
        System.out.println("Your move: ");
        Point userMove = new Point(b.scan.nextInt(), b.scan.nextInt());

        b.placeAMove(userMove, 2); //2 for user and 1 is the computer,user makes a move.
        b.displayBoard();
        if (b.isGameOver()) break;
        
        b.minimax(0, 1);  
        
        b.placeAMove(b.computersMove, 1);
        b.displayBoard();
    }
    if (b.hasXWon()) 
        System.out.println("Unfortunately, you lost!");
    else if (b.hasOWon()) 
        System.out.println("You win!"); //Can't happen
    else 
        System.out.println("It's a draw!");
}

}
