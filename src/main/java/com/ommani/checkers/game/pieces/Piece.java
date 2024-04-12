package com.ommani.checkers.game.pieces;

import com.ommani.checkers.game.Colour;
import com.ommani.checkers.game.board.Position;
import com.ommani.checkers.game.moves.Move;

import java.util.List;

public abstract class Piece {
    protected Position position;
    protected List<Move> possibleMoves;
    protected final Colour colour;

    protected Piece(Position position, Colour colour) {
        this.position = position;
        this.colour = colour;
    }

    protected void getPossibleMoves(){
    }

    protected void getMoveType(Position from, Position to){

    }

    protected void executeMove(Move move) {
        Position prevPos = position;
        setPosition(move.getTo());
        prevPos.setPlayerOnTile(null);


        if(move.getNextMove() == null){
            possibleMoves.clear();
        }else {
            this.executeMove(move.getNextMove());
        }
    }

    protected Position getPosition() {
        return position;
    }

    protected void setPosition(Position position) {
        this.position = position;
    }

    protected Colour getColour() {
        return colour;
    }
}
