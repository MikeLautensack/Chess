import { SquareColor } from '../utils/enums'

export interface ListItemProps {
    col1: string,
    col2: string,
    col3?: string,
    col2func: () => void,
    col3func?: () => void
}
export interface TitleBarProps {
    col1: string,
    col2: string,
    col3: string,
}

export interface Square {
    
}

export interface Piece {
    
}

export interface SquareProps {
    square_id: string,
    squareColor: SquareColor,
    pieceOnSquare: null | undefined | Piece
}