package winning_combinations;

import java.util.stream.Stream;

public class TicTacToe {

    private Stream<Stream<Integer>> winningCombinations = Stream.of(
            // rows
            Stream.of(0, 1, 2),
            Stream.of(3, 4, 5),
            Stream.of(6, 7, 8),
            // columns
            Stream.of(0, 3, 6),
            Stream.of(1, 4, 7),
            Stream.of(2, 5, 8),
            // diagonals
            Stream.of(0, 4, 8),
            Stream.of(2, 4, 6)
    );

    public boolean playerWon(String game, char player) {
        char[] cases = game.toCharArray();
        return winningCombinations.anyMatch(combination -> playerOccupies(player, cases, combination));
    }

    boolean playerOccupies(char player, char[] board, Stream<Integer> combination) {
        return combination.allMatch(position -> board[position] == player);
    }

}
