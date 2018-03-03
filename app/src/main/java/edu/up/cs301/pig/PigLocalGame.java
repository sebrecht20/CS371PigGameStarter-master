package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.R;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameState;

import android.util.Log;
import android.widget.TextView;

import java.util.Random;

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {

    /**
     * This ctor creates a new game state
     */
    PigGameState pgamestate;
     public PigLocalGame(PigGameState pgs) {
         this.pgamestate = pgs;
         //TODO  You will implement this constructor
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {
        int currentTurnId = pgamestate.getCurrentPlayerTurn();
        if (playerIdx == currentTurnId) {
            return true;
        } else{
            //TODO  You will implement this method
            return false;
        }
    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override

    protected boolean makeMove(GameAction action) {
        if(action instanceof PigHoldAction){
            if(pgamestate.getCurrentPlayerTurn() == pgamestate.getplayer1_id()){
                 pgamestate.setPlayer1_score(pgamestate.getPlayer1_score()+ pgamestate.getcurrent_running_total());
                pgamestate.setcurrent_running_total(0);
                pgamestate.setCurrentPlayerTurn(1);
                return true;
            }

            else if(pgamestate.getCurrentPlayerTurn() == pgamestate.getPlayer2_id()){
                pgamestate.setPlayer2_score(pgamestate.getPlayer2_score()+ pgamestate.getcurrent_running_total());
                pgamestate.setcurrent_running_total(0);
                pgamestate.setCurrentPlayerTurn(0);            }
                return true;
        }
        else if(action instanceof PigRollAction){
            Random r = new Random();
            int diceRollValue = r.nextInt(6)+1;

            if(diceRollValue !=1){
                pgamestate.setcurrent_running_total(diceRollValue);
            }
            else if(diceRollValue ==1){
                pgamestate.setcurrent_running_total(0);
            }
            return true;
        }
        else{
            return false;
        }
    }//makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        PigGameState pstate = new PigGameState(pgamestate);
        p.sendInfo(pstate);
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        if(pgamestate.getCurrentPlayerTurn() == pgamestate.getplayer1_id()){
            if(pgamestate.getPlayer1_score() ==50){
                return null;
            }
        }
        if(pgamestate.getCurrentPlayerTurn() == pgamestate.getPlayer2_id()){
            if(pgamestate.getPlayer2_score() ==50){
                return null;
            }

        }
        }

}// class PigLocalGame
