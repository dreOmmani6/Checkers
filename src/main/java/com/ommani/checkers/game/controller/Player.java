package com.ommani.checkers.game.controller;

import com.ommani.checkers.game.utility.Colour;

public class Player {
    private final Colour colour;
    private String name;
    public Player(Colour colour){
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
