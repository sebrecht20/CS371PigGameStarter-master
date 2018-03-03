package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

/**
 * Created by sebrecht20 on 3/1/2018.
 */

public class PigGameState extends GameState {

    private int currentPlayerTurn;
    private int player1_id = 0;
    private int player2_id = 1;
    private int player1_score =0;
    private int player2_score =0;
    private int current_running_total;
    private int diceVal = 0;

    public PigGameState(){}

    public PigGameState(PigGameState original){
        original.currentPlayerTurn = this.getCurrentPlayerTurn();
        original.player1_id = this.player1_id;
        original.player2_id = this.player2_id;
        original.current_running_total = this.current_running_total;
        original.diceVal = this.diceVal;
    }

    public int getCurrentPlayerTurn() {
        return currentPlayerTurn;
    }

    public void setCurrentPlayerTurn(int turn){
        this.currentPlayerTurn = turn;
    }

    public int getplayer1_id() {
        return player1_id;
    }

    public void setplayer1_id(){

    }

    public int getPlayer2_id() {
        return player2_id;
    }

    public void setplayer2_id(int id){
        this.player1_id = id;
    }

    public int getcurrent_running_total() {
        return current_running_total;
    }

    public int setcurrent_running_total(int total){
        this.current_running_total = total;
    }

    public int getDiceVal() {
        return diceVal;
    }

    public void setDiceVal(){

    }

    public int getPlayer1_score() {
        return player1_score;
    }

    public void setPlayer1_score(int score){
        this.player1_score = score;
    }

    public int getPlayer2_score() {
        return player2_score;
    }

    public void setPlayer2_score(int score) {
        this.player2_score = score;
    }


    }
