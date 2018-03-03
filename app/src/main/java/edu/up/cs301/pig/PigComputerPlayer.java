package edu.up.cs301.pig;

import java.util.Random;

import edu.up.cs301.game.GameComputerPlayer;
import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameInfo;
import edu.up.cs301.game.util.Tickable;

/**
 * An AI for Pig
 *
 * @author Andrew M. Nuxoll
 * @version August 2015
 */
public class PigComputerPlayer extends GameComputerPlayer {

    /**
     * ctor does nothing extra
     */
    public PigComputerPlayer(String name) {
        super(name);
    }

    /**
     * callback method--game's state has changed
     *
     * @param info
     * 		the information (presumably containing the game's state)
     */
    @Override
    protected void receiveInfo(GameInfo info) {
        if(info instanceof PigGameState){
            PigGameState gState = (PigGameState)info;
        }
        if(gState.getCurrentPlayerTurn == gstate.getPlayer1_id){
            Random ran = new Random();
            int random_value=ran.nextInt(2)
                    if(random_value==0)
                    {
                        PigHoldAction holdAction= new PigHoldAction(GamePlayer);
                    }
                    else if (random_value==1)
            {
                PigHoldAction holdAction = new PigHoldAction(GamePlayer);
            }
        }
        if(gState.getCurrentPlayerTurn == gstate.getPlayer2_id){

        }



        // TODO  You will implement this method
    }//receiveInfo

}
