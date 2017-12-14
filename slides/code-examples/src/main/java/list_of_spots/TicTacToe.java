package list_of_spots;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class TicTacToe {

    private Stream<List<Integer>> winningCombinations = Stream.of(
            // rows
            asList(0, 1, 2), asList(3, 4, 5), asList(6, 7, 8),
            // columns
            asList(0, 3, 6), asList(1, 4, 7), asList(2, 5, 8),
            // diagonals
            asList(0, 4, 8), asList(2, 4, 6)
    );

    public boolean playerWon(List<Integer> playerSpots) {
        return winningCombinations.anyMatch(playerSpots::containsAll);
    }

}
