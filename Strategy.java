/**
 * Class containing an type of Strategy.
 * @author	081028AW
 */
import java.*;
public class Strategy extends Object
   {
  /**
   * Encoding for a strategy.
   */

   int opponentLastMove = 1;
   int myLastMove;
   String name;
   int[] moves;
   Integer numMoves;
   int totalDefects;
   int prevDefects;      
   int forgiveCount;
   int requiredSteps;
   double defectRating;
   double randomRating;
   double rEpsilon;

  // 0 = defect, 1 = cooperate

   public Strategy()
      {
      }  /* Strategy */

   public int nextMove()
      {
      return 0;
      }  /* nextMove */


   public void saveOpponentMove(int move)  { opponentLastMove = move; }
   public int getOpponentLastMove()  { return opponentLastMove; }
   public void saveMyMove(int move)  { myLastMove = move; }
   public int getMyLastMove()  { return myLastMove; }
   public String getName()  { return name; }
   }  /* class Strategy */

