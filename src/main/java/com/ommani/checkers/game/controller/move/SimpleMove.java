package com.ommani.checkers.game.controller.move;

import com.ommani.checkers.game.controller.move.Move;
import com.ommani.checkers.game.model.Tile;

public class SimpleMove extends Move {
    public SimpleMove(Tile from, Tile to) {
        super(from, to, 1);
    }

}
