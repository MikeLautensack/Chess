package com.Game.Chess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Game.Chess.Model.board.Board;

@SpringBootApplication
public class ChessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChessApplication.class, args);

		/*

        board.printBoard();*/

		//import or assign json board config to a hashmap so I can use it??? TBD

		//create board

		Board board = new Board();

		//create pieces



		//add pieces to board

		//get legal squares for each piece and add them into an array then, into a map with corisponsing pieces

		System.out.println();
		System.out.println(board);
		System.out.println();
		board.printBoard();

	}

}





