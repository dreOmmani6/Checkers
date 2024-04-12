package com.ommani.checkers.game.moves;

import com.ommani.checkers.game.Colour;
import com.ommani.checkers.game.board.Position;

import java.util.List;

public abstract class Move {

    protected final Position from;
    protected final Position to;
    protected Move nextMove;
    protected int rewardPoints;

    public Move(Position from, Position to, int rewardPoints) {
        this.from = from;
        this.to = to;
        this.rewardPoints = rewardPoints;
    }

    public Position getFrom() {
        return from;
    }

    public Position getTo() {
        return to;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    int getRewardPoints() {
        return this.rewardPoints;
    }

    public Move getNextMove() {
        return nextMove;
    }

    void setNextMove(Move nextMove){
        if(this.to == nextMove.from ){
            this.nextMove = nextMove;
        }
    }

}
