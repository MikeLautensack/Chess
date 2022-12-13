const whiteKing = document.getElementById('wk');
const whiteQueen = document.getElementById('wq');
const whiteRookLight = document.getElementById('wrl');
const whiteRookDark = document.getElementById('wrd');
const whiteBishopLight = document.getElementById('wbl');
const whiteBishopDark = document.getElementById('wbd');
const whiteKnightLight = document.getElementById('wnl');
const whiteKnightDark = document.getElementById('wnd');
const whiteAPawn = document.getElementById('wpa');
const whiteBPawn = document.getElementById('wpb');
const whiteCPawn = document.getElementById('wpc');
const whiteDPawn = document.getElementById('wpd');
const whiteEPawn = document.getElementById('wpe');
const whiteFPawn = document.getElementById('wpf');
const whiteGPawn = document.getElementById('wpg');
const whiteHPawn = document.getElementById('wph');
const blackKing = document.getElementById('bk');
const blackQueen = document.getElementById('bq');
const blackRookLight = document.getElementById('brl');
const blackRookDark = document.getElementById('brd');
const blackBishopLight = document.getElementById('bbl');
const blackBishopDark = document.getElementById('bbd');
const blackKnightLight = document.getElementById('bnl');
const blackKnightDark = document.getElementById('bnd');
const blackAPawn = document.getElementById('bpa');
const blackBPawn = document.getElementById('bpb');
const blackCPawn = document.getElementById('bpc');
const blackDPawn = document.getElementById('bpd');
const blackEPawn = document.getElementById('bpe');
const blackFPawn = document.getElementById('bpf');
const blackGPawn = document.getElementById('bpg');
const blackHPawn = document.getElementById('bph');

const a1 = document.getElementById('a1');
const a2 = document.getElementById('a2');
const a3 = document.getElementById('a3');
const a4 = document.getElementById('a4');
const a5 = document.getElementById('a5');
const a6 = document.getElementById('a6');
const a7 = document.getElementById('a7');
const a8 = document.getElementById('a8');
const b1 = document.getElementById('b1');
const b2 = document.getElementById('b2');
const b3 = document.getElementById('b3');
const b4 = document.getElementById('b4');
const b5 = document.getElementById('b5');
const b6 = document.getElementById('b6');
const b7 = document.getElementById('b7');
const b8 = document.getElementById('b8');
const c1 = document.getElementById('c1');
const c2 = document.getElementById('c2');
const c3 = document.getElementById('c3');
const c4 = document.getElementById('c4');
const c5 = document.getElementById('c5');
const c6 = document.getElementById('c6');
const c7 = document.getElementById('c7');
const c8 = document.getElementById('c8');
const d1 = document.getElementById('d1');
const d2 = document.getElementById('d2');
const d3 = document.getElementById('d3');
const d4 = document.getElementById('d4');
const d5 = document.getElementById('d5');
const d6 = document.getElementById('d6');
const d7 = document.getElementById('d7');
const d8 = document.getElementById('d8');
const e1 = document.getElementById('e1');
const e2 = document.getElementById('e2');
const e3 = document.getElementById('e3');
const e4 = document.getElementById('e4');
const e5 = document.getElementById('e5');
const e6 = document.getElementById('e6');
const e7 = document.getElementById('e7');
const e8 = document.getElementById('e8');
const f1 = document.getElementById('f1');
const f2 = document.getElementById('f2');
const f3 = document.getElementById('f3');
const f4 = document.getElementById('f4');
const f5 = document.getElementById('f5');
const f6 = document.getElementById('f6');
const f7 = document.getElementById('f7');
const f8 = document.getElementById('f8');
const g1 = document.getElementById('g1');
const g2 = document.getElementById('g2');
const g3 = document.getElementById('g3');
const g4 = document.getElementById('g4');
const g5 = document.getElementById('g5');
const g6 = document.getElementById('g6');
const g7 = document.getElementById('g7');
const g8 = document.getElementById('g8');
const h1 = document.getElementById('h1');
const h2 = document.getElementById('h2');
const h3 = document.getElementById('h3');
const h4 = document.getElementById('h4');
const h5 = document.getElementById('h5');
const h6 = document.getElementById('h6');
const h7 = document.getElementById('h7');
const h8 = document.getElementById('h8');

let piecesOnBoard = [whiteKing, whiteQueen, whiteRookLight, whiteRookDark, whiteBishopLight, whiteBishopDark, whiteKnightLight, whiteKnightDark, whiteAPawn, whiteBPawn, whiteCPawn, whiteDPawn, whiteEPawn, whiteFPawn, whiteGPawn, whiteHPawn, blackKing, blackQueen, blackRookLight, blackRookDark, blackBishopLight, blackBishopDark, blackKnightLight, blackKnightDark, blackAPawn, blackBPawn, blackCPawn, blackDPawn, blackEPawn, blackFPawn, blackGPawn, blackHPawn];

let piecesOffBoard = [];

const squares = [a1,a2,a3,a4,a5,a6,a7,a8,b1,b2,b3,b4,b5,b6,b7,b8,c1,c2,c3,c4,c5,c6,c7,c8,d1,d2,d3,d4,d5,d6,d7,d8,e1,e2,e3,e4,e5,e6,e7,e8,f1,f2,f3,f4,f5,f6,f7,f8,g1,g2,g3,g4,g5,g6,g7,g8,h1,h2,h3,h4,h5,h6,h7,h8];

let pieceLocationMap  = {
    a8 : blackRookLight,
    b8 : blackKnightDark,
    c8 : blackBishopLight,
    d8 : blackQueen,
    e8 : blackKing,
    f8 : blackBishopDark,
    g8 : blackKnightLight,
    h8 : blackRookDark,
    a7 : blackAPawn,
    b7 : blackBPawn,
    c7 : blackCPawn,
    d7 : blackDPawn,
    e7 : blackEPawn,
    f7 : blackFPawn,
    g7 : blackGPawn,
    h7 : blackHPawn,
    a6 : "",
    b6 : "",
    c6 : "",
    d6 : "",
    e6 : "",
    f6 : "",
    g6 : "",
    h6 : "",
    a5 : "",
    b5 : "",
    c5 : "",
    d5 : "",
    e5 : "",
    f5 : "",
    g5 : "",
    h5 : "",
    a4 : "",
    b4 : "",
    c4 : "",
    d4 : "",
    e4 : "",
    f4 : "",
    g4 : "",
    h4 : "",
    a3 : "",
    b3 : "",
    c3 : "",
    d3 : "",
    e3 : "",
    f3 : "",
    g3 : "",
    h3 : "",
    a2 : whiteAPawn,
    b2 : whiteBPawn,
    c2 : whiteCPawn,
    d2 : whiteDPawn,
    e2 : whiteEPawn,
    f2 : whiteFPawn,
    g2 : whiteGPawn,
    h2 : whiteHPawn,
    a1 : whiteRookDark,
    b1 : whiteKnightLight,
    c1 : whiteBishopDark,
    d1 : whiteQueen,
    e1 : whiteKing,
    f1 : whiteBishopLight,
    g1 : whiteKnightDark,
    h1 : whiteRookLight
}



