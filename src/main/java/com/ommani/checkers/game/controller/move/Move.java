package com.ommani.checkers.game.controller.move;

import com.ommani.checkers.game.model.Tile;

public abstract class Move {

    protected final Tile from;
    protected final Tile to;

    protected int rewardPoints;

    public Move(Tile from, Tile to, int rewardPoints) {
        this.from = from;
        this.to = to;
        this.rewardPoints = rewardPoints;
    }

    public Tile getFrom() {
        return from;
    }

    public Tile getTo() {
        return to;
    }

    int getRewardPoints() {
        return this.rewardPoints;
    }



}
