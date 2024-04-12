package com.ommani.checkers.game.board;

import com.ommani.checkers.game.Colour;
import com.ommani.checkers.game.pieces.Piece;

public class Position {
    private final int x;
    private final int y;
    private final Colour colour;

    private Colour playerOnTile;

    public Position(int x, int y, Colour colour) {
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Colour getColour() {
        return colour;
    }

    public Colour getPlayerOnTile() {
        return playerOnTile;
    }

    public void setPlayerOnTile(Colour playerOnTile) {
        this.playerOnTile = playerOnTile;
    }
}
