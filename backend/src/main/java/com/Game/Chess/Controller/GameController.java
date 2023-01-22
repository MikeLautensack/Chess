package com.Game.Chess.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Game.Chess.Model.Game.GenerateLegalMoves;
import com.Game.Chess.ResourceRepresentationClasses.BoardConfig;
import com.Game.Chess.ResourceRepresentationClasses.LegalMoves;

@RestController
public class GameController {

    @PostMapping(path = "/boardConfig")
    public ResponseEntity<LegalMoves> boardConfig(@RequestBody BoardConfig boardConfig) {

        LegalMoves legalMoves = GenerateLegalMoves.generateLegalMoves(boardConfig);

        return new ResponseEntity<>(
                legalMoves,
                HttpStatus.OK);
    }

}
