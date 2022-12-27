package com.Game.Chess.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Game.Chess.ResourceRepresentationClasses.currentBoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.legalMoves;

@RestController
public class GameController {

    @PostMapping(path="/boardConfig")
    public ResponseEntity<legalMoves> boardConfig(@RequestBody currentBoardConfig currentBoardConfig) {
        return new ResponseEntity<>(
            new legalMoves(
                null,
                null,
                null,
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null, 
                null),
            HttpStatus.OK);
    }

}
