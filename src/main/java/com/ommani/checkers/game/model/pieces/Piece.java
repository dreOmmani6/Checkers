package com.ommani.checkers.game.model.pieces;

import com.ommani.checkers.game.utility.Colour;
import com.ommani.checkers.game.model.Tile;

public class Piece {
    protected final Colour colour;

    public Piece(Colour colour) {
        this.colour = colour;
    }

    protected void getMoveType(Tile from, Tile to){

    }

    protected Colour getColour() {
        return colour;
    }
}
