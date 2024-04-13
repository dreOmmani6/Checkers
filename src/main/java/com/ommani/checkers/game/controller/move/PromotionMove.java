package com.ommani.checkers.game.controller.move;

import com.ommani.checkers.game.model.Tile;

public class PromotionMove extends Move{
    public PromotionMove(Tile from, Tile to, int rewardPoints) {
        super(from, to, rewardPoints);
    }
}
