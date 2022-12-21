let squares = document.querySelectorAll('.square');
let pieces = document.querySelectorAll('.piece');
let setButton = document.querySelector('.set-board-button');

let currentBoardConfig = {

}

let legalMoves = {
    'whiteKing' : [],
    'whiteQueen' : [],
    'whiteKsRook' : [],
    'whiteQsRook' : [],
    'whiteLsBishop' : [],
    'whiteDsBishop' : [],
    'whiteKsKnight' : ['f3','h3'],
    'whiteQsKnight' : ['a3','c3'],
    'whiteAPawn' : ['a3','a4'],    
    'whiteBPawn' : ['b3','b4'],
    'whiteCPawn' : ['c3','c4'],
    'whiteDPawn' : ['d3','d4'],
    'whiteEPawn' : ['e3','e4'],
    'whiteFPawn' : ['f3','f4'],
    'whiteGPawn' : ['g3','g4'],
    'whiteHPawn' : ['h3','h4'],
    'blackKing' : [],
    'blackQueen' : [],
    'blackKsRook' : [],
    'blackQsRook' : [],
    'blackLsBishop' : [],
    'blackDsBishop' : [],
    'blackKsKnight' : ['f6','h6'],
    'blackQsKnight' : ['a6','c6'],
    'blackAPawn' : ['a6','a5'],    
    'blackBPawn' : ['b6','b5'],
    'blackCPawn' : ['c6','c5'],
    'blackDPawn' : ['d6','d5'],
    'blackEPawn' : ['e6','e5'],    
    'blackFPawn' : ['f6','f5'],
    'blackGPawn' : ['g6','g5'],
    'blackHPawn' : ['h6','h5'],
}

let squaresControlledByWhite = {

}

let squaresControlledByBlack = {

}

let isWhitesTurn = true;
let pieceMoving;
let pieceMovingID;
let squareID;
let pieceMovingLegalMoves;

//piece listeners
pieces.forEach(piece => {
    piece.addEventListener('dragstart', () => {
        pieceMoving = piece;
        console.log('drag');
    })

    /*piece.addEventListener('dragend', () => {

    })*/
})

//square listeners
squares.forEach(square => {
    square.addEventListener('dragover', () => {
        event.preventDefault();
        console.log('over');
    })

    /*square.addEventListener('dragenter', () => {
    })
    
    square.addEventListener('dragleave', () => {    
        

    })*/

    square.addEventListener('drop', () => {

        //turn logic
        if(isWhitesTurn == true) {
            if(pieceMoving.hasAttribute('data-white')) {
                pieceMovingID = pieceMoving.id;
                squareID = square.id;
                pieceMovingLegalMoves = legalMoves.pieceMovingID;
                /*if(pieceMovingLegalMoves.includes(squareID)) {

                }*/
                square.append(pieceMoving);
                isWhitesTurn = false;
            }
        } else {
            if(pieceMoving.hasAttribute('data-black')) {
                square.append(pieceMoving);
                isWhitesTurn = true;
            }
        }
        console.log(pieceMovingLegalMoves);
        //valid squares logic

    })    
})

setButton.addEventListener('click', () => {
    console.log(isWhitesTurn);
})
