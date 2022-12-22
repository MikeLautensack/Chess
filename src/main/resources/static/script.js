let squares = document.querySelectorAll('.square');
let pieces = document.querySelectorAll('.piece');
let setButton = document.querySelector('.set-board-button');

let currentBoardConfig = {
    'a1' : 'whiteQsRook',
    'b1' : 'whiteQsKnight',
    'c1' : 'whiteDsBishop',
    'd1' : 'whiteQueen',
    'e1' : 'whiteKing',
    'f1' : 'whiteLsBishop',
    'g1' : 'whiteKsKnight',
    'h1' : 'whiteKsRook',
    'a2' : 'whiteAPawn',
    'b2' : 'whiteBPawn',
    'c2' : 'whiteCPawn',
    'd2' : 'whiteDPawn',
    'e2' : 'whiteEPawn',
    'f2' : 'whiteFPawn',
    'g2' : 'whiteGPawn',
    'h2' : 'whiteHPawn',
    'a3' : '',
    'b3' : '',
    'c3' : '',
    'd3' : '',
    'e3' : '',
    'f3' : '',
    'g3' : '',
    'h3' : '',
    'a4' : '',
    'b4' : '',
    'c4' : '',
    'd4' : '',
    'e4' : '',
    'f4' : '',
    'g4' : '',
    'h4' : '',
    'a5' : '',
    'b5' : '',
    'c5' : '',
    'd5' : '',
    'e5' : '',
    'f5' : '',
    'g5' : '',
    'h5' : '',
    'a6' : '',
    'b6' : '',
    'c6' : '',
    'd6' : '',
    'e6' : '',
    'f6' : '',
    'g6' : '',
    'h6' : '',
    'a7' : 'blackAPawn',
    'b7' : 'blackBPawn',
    'c7' : 'blackCPawn',
    'd7' : 'blackDPawn',
    'e7' : 'blackEPawn',
    'f7' : 'blackFPawn',
    'g7' : 'blackGPawn',
    'h7' : 'blackHPawn',
    'a8' : 'blackQsRook',
    'b8' : 'blackQsKnight',
    'c8' : 'blackLsBishop',
    'd8' : 'blackQueen',
    'e8' : 'blackKing',
    'f8' : 'blackDsBishop',
    'g8' : 'blackKsKnight',
    'h8' : 'blackKsRook',
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

let isWhitesTurn = true;
let isMoveLegal;
let pieceMoving;

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

        isMoveLegal = isDropSquareLegal(pieceMoving, square, legalMoves);

        //valid move filtering logic
        if(isWhitesTurn == true) {
            if(pieceMoving.hasAttribute('data-white')) {
                if(isMoveLegal == true) {
                    square.append(pieceMoving);
                    isWhitesTurn = false;
                }
            }
        } else {
            if(pieceMoving.hasAttribute('data-black')) {
                if(isMoveLegal == true) {
                    square.append(pieceMoving);
                    isWhitesTurn = true;
                }
            }
        }
    })    
})

function isDropSquareLegal(piece, square, legalMoves) {

    let pieceMovingID;
    let squareID;
    let isSquareLegal;

    pieceMovingID = piece.id;
    squareID = square.id;

    if(legalMoves[pieceMovingID].includes(squareID)) {
        isSquareLegal = true;
    }
    return isSquareLegal
}

setButton.addEventListener('click', () => {
    console.log(isWhitesTurn);
    console.log(pieceMovingID);
    console.log(squareID);
    console.log(pieceMovingLegalMoves);
    console.log(pieceMovingLegalMoves);
    console.log(pieceMovingLegalMoves);
})
