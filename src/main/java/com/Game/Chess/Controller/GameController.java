package com.Game.Chess.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

@RestController
public class GameController {

    

    @PostMapping(path="/boardConfig")
    public ResponseEntity<LegalMoves> boardConfig(@RequestBody BoardConfig boardConfig) {
        System.out.println(boardConfig); 
        return new ResponseEntity<>(
            new LegalMoves(
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
