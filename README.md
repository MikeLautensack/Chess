# Chess-API - (Pre Alpha)

## What is Chess API?

Chess API is a REST API that accepts a board config JSON object and returns a legal moves JSON object. Chess API can be used as an easy way to restrict a user from making illegal moves on a client side chess application.

---

## How to use Chess API

Chess API is intended to be used in client side chess applications as a easy way of restricting illegal moves just like you see on the big name chess websites. To use Chess API follow these simple steps and level up your client chess application.

Start by creating an object in your client code called “boardConfig” or similar with a key for each square and value representing the piece on the square. Pieces are represented by a simple string containing a piece name and empty squares are represented by empty strings. When a move is made in your client application trigger an API call to Chess API using a post request to the address below with the boardConfig object in the body and you will receive a “legalMoves” object in the response body. The legal moves object contains keys representing each unique piece on the chess board. Each keys value is an array containing a list of square coordinates like e4, d4, c4 representing the legal moves for the piece. If the array is empty that piece has no legal moves or is currently not on the board. You can use the legalMoves object in your client code to restrict players from making illegal moves during a game. Keep track of who is to move, move number and other stats in your client code. You can also very easily setup checkmate and stalemate detection in your client code but using the kings legal moves and which color is to move.

Chess API is intended to be used in client side chess applications as a easy way of restricting illegal moves just like you see on the big name chess websites. To use Chess API follow these simple steps and level up your client chess application.

---

## Upcoming features and bug fixes

#### Features

- Update data structures used for boardConfig and legalMoves objects
- Add additional routes for getting game-state object with more information like checkmate and stalemate
- Functionallity for capture and promotion
- Persistant boardConfig data thruout entire game in game-state object

#### Bugs

- Hero buttons on landing page in mobile mode
- Add touch event support on landing page
