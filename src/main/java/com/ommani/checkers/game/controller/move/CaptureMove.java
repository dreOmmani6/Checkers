package com.ommani.checkers.game.controller.move;

import com.ommani.checkers.game.model.Tile;

public class CaptureMove extends Move {

    protected Move nextMove;

    public CaptureMove(Tile from, Tile to) {
        super(from, to, 3);
    }

    public Move getNextMove() {
        return nextMove;
    }

    void setNextMove(Move nextMove){
        this.nextMove = nextMove;
        updateRewardPoints();
    }

    void  updateRewardPoints(){
        rewardPoints += nextMove.rewardPoints;
    }
}
