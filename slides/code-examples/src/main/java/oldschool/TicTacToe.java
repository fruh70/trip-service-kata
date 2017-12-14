package oldschool;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class TicTacToe {


    private boolean scoresDiagonal(char mark, char[][] board) {
        boolean scoresLeftToRight = board[0][2] == mark
                && board[1][1] == mark
                && board[2][0] == mark;
        boolean scoresRightToLeft = board[0][0] == mark
                && board[1][1] == mark
                && board[2][2] == mark;
        return scoresLeftToRight
            || scoresRightToLeft;
    }


    public boolean playerDidWin(char[] board, String playerMarker) {
        return hasRow(board, playerMarker) ||
                hasColumn(board, playerMarker) ||
                hasDiagonal(board, playerMarker);
    }

    private boolean hasRow(char[] board, String playerMarker) {
        return false;
    }
    private boolean hasColumn(char[] board, String playerMarker) {
        return false;
    }
    private boolean hasDiagonal(char[] board, String playerMarker) {
        return false;
    }

}
