let squares = document.querySelectorAll('.square');
let pieces = document.querySelectorAll('.piece');
let setButton = document.querySelector('.set-board-button');

let currentBoardConfig = {

}

let validMoves = {

}

let squaresControlledByWhite = {

}

let squaresControlledByBlack = {

}

let isWhitesTurn = true;

let pieceMoving;

//piece listeners
pieces.forEach(piece => {
    piece.addEventListener('dragstart', e => {
        pieceMoving = piece;
        console.log('drag');
        console.log(pieceMoving);
    })

    /*piece.addEventListener('dragend', () => {

    })*/

    piece.addEventListener('click', () => {
        console.log('click');
    })
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
        square.append(pieceMoving);
        console.log('drop');
    })

    square.addEventListener('click', () => {
        console.log('click');
    })

    
})

setButton.addEventListener('click', () => {
    console.log(pieceMoving);
    console.log(pieces);
    console.log(squares);
    console.log();
    console.log();
})
