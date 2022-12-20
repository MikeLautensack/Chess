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
        if(isWhitesTurn == true) {
            if(pieceMoving.hasAttribute('data-white')) {
                square.append(pieceMoving);
                isWhitesTurn = false;
            }
        } else {
            if(pieceMoving.hasAttribute('data-black')) {
                square.append(pieceMoving);
                isWhitesTurn = true;
            }
            console.log(isWhitesTurn);
        }
    })    
})

setButton.addEventListener('click', () => {
    console.log(isWhitesTurn);
})
