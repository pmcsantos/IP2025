void main() {
    char[][] board = {{' ', ' ',' '},
                      {' ', ' ',' '},
                      {' ', ' ',' '}};
    while (true) {
        printGame(board);
        IO.println("\n");
        int line = Integer.valueOf(IO.readln("X linha: "));
        int col = Integer.valueOf(IO.readln("X coluna: "));
        IO.println("\n");
        board[line][col] = 'X';
        printGame(board);
        IO.println("\n");
        line = Integer.valueOf(IO.readln("O linha: "));
        col = Integer.valueOf(IO.readln("O coluna: "));
        IO.println("\n");
        board[line][col] = 'O';
        IO.println("");
    }
}

static void printGame(char[][] array) {
    IO.println(array[0][0] + "|" + array[0][1] + "|" + array[0][2]);
    IO.println("------");
    IO.println(array[1][0] + "|" + array[1][1] + "|" + array[1][2]);
    IO.println("------");
    IO.print(array[2][0] + "|" + array[2][1] + "|" + array[2][2]);
}