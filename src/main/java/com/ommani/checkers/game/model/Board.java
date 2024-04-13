package com.ommani.checkers.game.model;

import com.ommani.checkers.game.model.pieces.Piece;
import com.ommani.checkers.game.utility.Colour;
import com.ommani.checkers.game.utility.ColourScheme;

public class Board {
    private final int dimensions = 8;
    private final Tile[][] tiles;
    private final ColourScheme colourScheme;

    public Board(ColourScheme colourScheme){
        this.tiles = new Tile[dimensions][dimensions];
        this.colourScheme = colourScheme;
    }

    public void initBoard(){
        //init Players

        for(int x = 0 ; x < dimensions; x++){

            for(int y = 0; y < dimensions; y++){
                boolean isPlayingTile = (x + y) % 2 == 1;
                Colour tileColour = isPlayingTile ? colourScheme.getPrimaryColor() : colourScheme.getSecondaryColor() ;
                Tile tile;

                if(y <= 2 && isPlayingTile){
                    //First pieces
                    tile = new Tile(tileColour, new Piece(colourScheme.getPrimaryColor()));
                } else if (y >= 5 && isPlayingTile) {
                    //Second pieces
                    tile = new Tile(tileColour, new Piece(colourScheme.getSecondaryColor()));
                }else {
                    //Ordinary Tile
                    tile = new Tile(tileColour);
                }
                tiles[x][y] = tile;
            }
        }
    }
}
