package com.ommani.checkers;

import com.ommani.checkers.game.controller.Game;
import com.ommani.checkers.game.utility.ColourScheme;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("William Ruto", "Raila Odinga", ColourScheme.BASIC);
    }
}