let squares = document.querySelectorAll('.square');
let pieces = document.querySelectorAll('.piece');
let setButton = document.querySelector('.set-board-button');

let currentBoardConfig = {
    'a8' : 'blackARook',
    'b8' : 'blackBKnight',
    'c8' : 'blackCBishop',
    'd8' : 'blackQueen',
    'e8' : 'blackKing',
    'f8' : 'blackFBishop',
    'g8' : 'blackGKnight',
    'h8' : 'blackHRook',
    'a7' : 'blackAPawn',
    'b7' : 'blackBPawn',
    'c7' : 'blackCPawn',
    'd7' : 'blackDPawn',
    'e7' : 'blackEPawn',
    'f7' : 'blackFPawn',
    'g7' : 'blackGPawn',
    'h7' : 'blackHPawn',
    'a6' : '',
    'b6' : '',
    'c6' : '',
    'd6' : '',
    'e6' : '',
    'f6' : '',
    'g6' : '',
    'h6' : '',
    'a5' : '',
    'b5' : '',
    'c5' : '',
    'd5' : '',
    'e5' : '',
    'f5' : '',
    'g5' : '',
    'h5' : '',
    'a4' : '',
    'b4' : '',
    'c4' : '',
    'd4' : '',
    'e4' : '',
    'f4' : '',
    'g4' : '',
    'h4' : '',
    'a3' : '',
    'b3' : '',
    'c3' : '',
    'd3' : '',
    'e3' : '',
    'f3' : '',
    'g3' : '',
    'h3' : '',
    'a2' : 'whiteAPawn',
    'b2' : 'whiteBPawn',
    'c2' : 'whiteCPawn',
    'd2' : 'whiteDPawn',
    'e2' : 'whiteEPawn',
    'f2' : 'whiteFPawn',
    'g2' : 'whiteGPawn',
    'h2' : 'whiteHPawn',
    'a1' : 'whiteARook',
    'b1' : 'whiteBKnight',
    'c1' : 'whiteCBishop',
    'd1' : 'whiteQueen',
    'e1' : 'whiteKing',
    'f1' : 'whiteFBishop',
    'g1' : 'whiteGKnight',
    'h1' : 'whiteHRook',
}

let legalMoves = {
    'blackAPawn' : ['a5','a6'],
    'blackARook' : [],
    'blackBKnight' : ['a6','c6'],
    'blackBPawn' : ['b5','b6'],
    'blackCBishop' : [],
    'blackCPawn' : ['c5','c6'],
    'blackDPawn' : ['d5','d6'],
    'blackEPawn' : ['e5','e6'],
    'blackFBishop' : [],    
    'blackFPawn' : ['f5','f6'],
    'blackGKnight' : ['f6','h6'],
    'blackGPawn' : ['g5','g6'],
    'blackHPawn' : ['h5','h6'],
    'blackHRook' : [],
    'blackKing' : [],
    'blackQueen' : [],
    'promotionBishopA' : [],
    'promotionBishopB' : [],
    'promotionBishopC' : [],
    'promotionBishopD' : [],
    'promotionBishopE' : [],
    'promotionBishopF' : [],
    'promotionBishopG' : [],
    'promotionBishopH' : [],
    'promotionKnightA' : [],    
    'promotionKnightB' : [],
    'promotionKnightC' : [],
    'promotionKnightD' : [],
    'promotionKnightE' : [],    
    'promotionKnightF' : [],
    'promotionKnightG' : [],
    'promotionKnightH' : [],
    'promotionQueenA' : [],
    'promotionQueenB' : [],
    'promotionQueenC' : [],
    'promotionQueenD' : [],
    'promotionQueenE' : [],
    'promotionQueenF' : [],
    'promotionQueenG' : [],
    'promotionQueenH' : [],
    'promotionRookA' : [],    
    'promotionRookB' : [],
    'promotionRookC' : [],
    'promotionRookD' : [],
    'promotionRookE' : [],
    'promotionRookF' : [],
    'promotionRookG' : [],
    'promotionRookH' : [],
    'whiteAPawn' : ['a3','a4'],
    'whiteARook' : [],
    'whiteBKnight' : ['a3','c3'],
    'whiteBPawn' : ['b3','b4'],
    'whiteCBishop' : [],
    'whiteCPawn' : ['c3','c4'],
    'whiteDPawn' : ['d3','d4'],
    'whiteEPawn' : ['e3','e4'],
    'whiteFBishop' : [],    
    'whiteFPawn' : ['f3','f4'],
    'whiteGKnight' : ['f3','h3'],
    'whiteGPawn' : ['g3','g4'],
    'whiteHPawn' : ['h3','h4'],    
    'whiteHRook' : [],
    'whiteKing' : [],
    'whiteQueen' : [],
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
