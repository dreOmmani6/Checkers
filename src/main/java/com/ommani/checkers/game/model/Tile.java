package com.ommani.checkers.game.model;

import com.ommani.checkers.game.utility.Colour;
import com.ommani.checkers.game.model.pieces.Piece;

public class Tile {
    private final Colour colour;

    private Piece piece;


    public Tile(Colour colour, Piece piece){
        this.colour = colour;
        this.piece = piece;
    }
    public Tile(Colour colour) {
        this(colour, null);
    }

    public Colour getColour() {
        return colour;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
