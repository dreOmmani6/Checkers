package com.ommani.checkers;

import com.ommani.checkers.controller.game.Game;
import com.ommani.checkers.controller.Player;
import com.ommani.checkers.utility.Colour;
import com.ommani.checkers.utility.ColourScheme;
import com.ommani.checkers.utility.Console;

public class Main {
    public static void main(String[] args) {
        final Player[] players;
        players = new Player[2];


        final ColourScheme colourScheme = ColourScheme.BASIC;

        Game game = new Game(colourScheme);

        //Random Choose colour
        int randomInt = (int) (Math.random() * 2);
        Colour rndmColour = randomInt == 0 ?
                colourScheme.getSecondaryColor(): colourScheme.getPrimaryColor();
        final Player playerA = new Player("William Ruto", rndmColour);
        players[randomInt] = playerA;

        randomInt = (randomInt + 1) % 2;
        rndmColour = randomInt == 0 ?
                colourScheme.getSecondaryColor(): colourScheme.getPrimaryColor();
        final Player playerB = new Player("Raila Odinga", rndmColour);
        players[randomInt] = playerB;


        playerA.joinGame(game, Console.TERMINAL);



        //instaciate Spectators
        //TerminalView terminalView = new TerminalView(game);
        //game.subscribe(terminalView);

        int playerTurn = 0;
        Player player = players[playerTurn];

        while (!player.isGameOver() || playerTurn > 1000){


            playerTurn++;
            player = players[playerTurn % 2];
        }
    }
}