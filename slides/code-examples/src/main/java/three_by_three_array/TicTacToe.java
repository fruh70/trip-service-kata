package three_by_three_array;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class TicTacToe {

    public boolean playerDidWin(char[][] board, char playerMarker) {
        return hasRow(board, playerMarker) ||
                hasColumn(board, playerMarker) ||
                hasDiagonal(board, playerMarker);
    }

    private boolean hasDiagonal(char[][] board, char mark) {
        boolean scoresLeftToRight = board[0][2] == mark
                && board[1][1] == mark
                && board[2][0] == mark;
        boolean scoresRightToLeft = board[0][0] == mark
                && board[1][1] == mark
                && board[2][2] == mark;
        return scoresLeftToRight
                || scoresRightToLeft;
    }

    private boolean hasRow(char[][] board, char playerMarker) {
        return false;
    }
    private boolean hasColumn(char[][] board, char playerMarker) {
        return false;
    }

}
