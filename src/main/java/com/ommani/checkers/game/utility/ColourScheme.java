package com.ommani.checkers.game.utility;

import com.ommani.checkers.game.utility.Colour;

import static com.ommani.checkers.game.utility.Colour.*;

public enum ColourScheme {
    BASIC(WHITE, BLACK),
    CLASSIC(RED, BLACK),
    BUMBLE_BEE(BLUE, YELLOW),
    TRANS(GREEN, PURPLE);
    private final Colour secondaryColor;
    private final Colour primaryColor;
    ColourScheme(Colour first, Colour second) {
        this.secondaryColor = first;
        this.primaryColor = second;
    }

    public Colour getSecondaryColor() {
        return secondaryColor;
    }

    public Colour getPrimaryColor() {
        return primaryColor;
    }
}
