package com.ommani.checkers.game.controller;

import com.ommani.checkers.game.utility.ColourScheme;
import com.ommani.checkers.game.model.Board;

public class Game {
    final Player[] players;
    final Board board;
    public Game(String player1, String player2 , ColourScheme colourScheme) {
        this.players = new Player[2];
        players[0] = new Player(colourScheme.getPrimaryColor());
        players[1] = new Player(colourScheme.getSecondaryColor());

        //Random Choose colour
        int randomInt = (int) (Math.random() * 2);
        players[randomInt].setName(player1);
        players[(randomInt + 1) % 2].setName(player2);

        //Set up Board
        board = new Board(colourScheme);
        board.initBoard();
    }
}
