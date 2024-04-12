package com.ommani.checkers.game.moves;

import com.ommani.checkers.game.board.Position;

public class SimpleMove extends Move{
    public SimpleMove(Position from, Position to) {
        super(from, to, 1);
    }

}
